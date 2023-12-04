import java.awt.Graphics;
import javax.swing.JPanel;

public class PlayingField extends JPanel implements Runnable {

  private final int FPS; //kolko krat za sekundu sa to ma refreshnut
  private final long frameTime;
  //private boolean isRunning;
  Thread gameThread;
  private int gridRows;
  private int gridColums;
  private int cellInGridSize;

  public PlayingField() {
    this.requestFocus();
    this.FPS = 100;
    this.frameTime = 1000000000 / FPS;
    this.setBounds(0, 100, 600, 950);
    //this.isRunning = true;
    this.gridRows = 20;
    this.gridColums = 10;
    this.cellInGridSize = this.getBounds().width / this.gridColums;
  }

  public void startGame() {
    this.gameThread = new Thread(this);
    this.gameThread.start(); //automaticky vola run metodu
  }

  //GameLoop
  @Override
  public void run() {
    //Update a draw
    //updatnej pozicie tetromin
    //znova ich vykresliš na nových poziciach
    double refresh;
    long time1 = System.nanoTime();
    long time2;
    while (gameThread != null) {
      time2 = System.nanoTime();
      refresh = (time2 - time1) / this.frameTime;
      if (refresh >= 1) {
        this.update();
        this.repaint();
      }
    }
  }

  private void update() {
    //pocuvat na Keylistener ktory ti povie kam sa ma tetromino posunut
  }

  @Override
  public void paintComponent(Graphics g) {
    //Tu budes zobrazovat tetromino
    super.paintComponent(g);
    //g.fillRect(0, 0, 50, 50); //vramci JPanela
    for (int i = 0; i < this.gridColums; i++) {
      g.drawRect(
        i * this.cellInGridSize,
        i,
        this.cellInGridSize,
        this.cellInGridSize
      );
    }
  }
}
