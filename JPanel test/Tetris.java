import java.awt.CardLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
// import java.util.ArrayList;
// import java.util.Timer;
// import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Tetris extends JFrame {

  private static int fieldHeight;
  private static int fieldWidth;
  private int score;
  // Timer timer = new Timer();
  // Random ran = new Random();
  JPanel uvodPanel = new JPanel();
  //JPanel box = new JPanel();
  //JPanel panel = new JPanel(new GridLayout(2, 2));
  JPanel box = new JPanel(new GridLayout(25, 10));
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
    okno.setLayout(new CardLayout());
    okno.setVisible(true);
    okno.add(this.uvodPanel);
    okno.add(this.box);
    okno.requestFocusInWindow();
    okno.setFocusable(true);
    this.score = 0;

    //uvodPanel.setLayout(new BorderLayout());
    uvodPanel.setBackground(Color.darkGray);
    uvodPanel.setBounds(0, 0, 600, 50);
    uvodPanel.add(this.text);
    //System.out.println(uvodPanel.getBackground());

    box.setBounds(0, 50, 600, 950);
    box.setBackground(Color.GRAY);
    box.setLayout(new FlowLayout());
    box.setVisible(true);

    text.setText("Skóre: " + this.score);
    text.setForeground(new Color(255, 255, 255));
    text.setBackground(uvodPanel.getBackground());
    text.setHorizontalAlignment(SwingConstants.CENTER);
    //text.setVerticalAlignment(SwingConstants.NORTH);
    text.setFont(new Font("Iosevka", Font.PLAIN, 30));
    text.setOpaque(true);
  }
}
