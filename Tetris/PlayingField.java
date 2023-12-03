import java.awt.Graphics;

public class PlayingField implements Runnable {

  private final int FPS; //kolko krat za sekundusa to ma refreshnut
  private final long frameTime;
  //private boolean isRunning;
  Thread gameThread;

  public PlayingField() {
    this.FPS = 100;
    this.frameTime = 1000000000 / FPS;
    //this.isRunning = true;
  }

  public void startGame() {
    this.gameThread = new Thread(this);
    this.gameThread.start(); //automaticky vola run metodu
  }

  @Override
  public void run() {
    //Update a draw
    //updatnej pozicie tetromin
    //znova ich vykresliš na nových poziciach
    while (gameThread != null) {
      this.update();
      this.repaint();
    }
  }

  private void update() {
    //pocuvat na Keylistener ktory ti povie kam sa ma tetromino posunut
  }

  public void paint(Graphics gra) {
    //Tu budes zobrazovat tetromino
    super.paintComponent(gra);
  }
}
