import java.awt.Color;
import java.awt.Font;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Tetris extends JFrame {

  private static int fieldHeight;
  private static int fieldWidth;
  Random ran = new Random();
  JPanel uvodPanel = new JPanel();
  JPanel box = new JPanel();
  JFrame okno = new JFrame();
  JLabel text = new JLabel();

  public Tetris() {
    fieldHeight = 1000;
    fieldWidth = 600;
    okno.setSize(fieldWidth, fieldHeight);
    okno.getContentPane().setBackground(new Color(0, 0, 0));
    okno.setTitle("Tetris");
    okno.setResizable(false);
    okno.setDefaultCloseOperation(EXIT_ON_CLOSE);
    okno.setLayout(null);
    okno.setVisible(true);
    okno.add(this.uvodPanel);
    okno.add(this.box);

    //uvodPanel.setLayout(new BorderLayout());
    uvodPanel.setBackground(Color.darkGray);
    uvodPanel.setBounds(0, 0, 600, 50);
    uvodPanel.add(this.text);
    //System.out.println(uvodPanel.getBackground());

    box.setBounds(0, 50, 600, 950);
    box.setBackground(Color.GRAY);

    text.setText("Začiatok hry");
    text.setForeground(new Color(255, 255, 255));
    text.setBackground(uvodPanel.getBackground());
    text.setHorizontalAlignment(SwingConstants.CENTER);
    //text.setVerticalAlignment(SwingConstants.NORTH);
    text.setFont(new Font("Iosevka", Font.PLAIN, 30));
    text.setOpaque(true);
  }
}
