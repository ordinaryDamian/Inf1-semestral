import java.awt.*;
import javax.swing.*;

//import java.util.*;
/*import java.util.ArrayList;
 *import java.util.Timer;
 *import java.util.Random;
 *import javax.swing.JFrame;
 *import javax.swing.JLabel;
 *import javax.swing.JPanel;
 *import javax.swing.SwingConstants;
 */

//TODO: Scanner a Printer na konzolu vypise vestky vysledky
public class Tetris extends JFrame {

  private static int fieldHeight;
  private static int fieldWidth;
  private int score;
  // Timer timer = new Timer();
  // Random ran = new Random();
  JPanel uvodPanel = new JPanel();
  //JPanel box = new JPanel();
  //JPanel panel = new JPanel(new GridLayout(2, 2));
  JPanel box = new JPanel(new GridLayout(20, 10)); // official game rules numbers
  JFrame okno = new JFrame();
  JLabel text = new JLabel();

  //private scoreBoard ScoreBoard;

  public Tetris() {
    //ScoreBoard = new scoreBoard();
    fieldHeight = 1000;
    fieldWidth = 600;
    okno.setSize(fieldWidth, fieldHeight);
    //okno.getContentPane().setBackground(new Color(127, 127, 127));
    okno.setTitle("Tetris");
    okno.setResizable(false);
    okno.setDefaultCloseOperation(EXIT_ON_CLOSE);
    //okno.setLayout(new CardLayout()); //FIXME: pravedpodobne to tu nema co robit
    okno.setVisible(true);
    okno.add(this.uvodPanel);
    okno.add(this.box);
    okno.requestFocusInWindow();
    okno.setFocusable(true);
    this.score = 0;

    //TODO: za tieto 2 by som mal vedeit nahradit class scoreBoard
    //uvodPanel.setLayout(new BorderLayout());
    uvodPanel.setBackground(Color.GRAY);
    uvodPanel.setBounds(0, 0, 600, 50);
    uvodPanel.add(this.text);
    //System.out.println(uvodPanel.getBackground());

    text.setText("Skóre: " + this.score);
    text.setForeground(new Color(255, 255, 255));
    text.setBackground(uvodPanel.getBackground());
    text.setHorizontalAlignment(SwingConstants.CENTER);
    //text.setVerticalAlignment(SwingConstants.NORTH);
    text.setFont(new Font("Iosevka", Font.PLAIN, 30));
    text.setOpaque(true);
    //FIXME: z nejakeho dovodu tohto bastarda nechce zobrazit
    box.setBounds(0, 50, 600, 950);
    box.setBackground(Color.yellow);
    //box.setLayout(new FlowLayout());
    box.setLayout(null);
    box.setVisible(true);
  }
}
//TODO: stale nemam sajnu co a ako urobit cize asi navrhnut asi UMLko a ist knemu na konzultacie a spitat sa ho co a ako
