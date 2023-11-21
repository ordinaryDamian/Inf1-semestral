import java.awt.*;
import javax.swing.*;

public class scoreBoard {

  public static Object setScore;
  private int score;
  private JLabel textScore;

  public scoreBoard() {
    JPanel scoreBoard = new JPanel();
    JLabel textScore = new JLabel();
    int score;
    textScore.setText("Skóre: " + this.score);
    textScore.setForeground(new Color(255, 255, 255));
    textScore.setBackground(scoreBoard.getBackground());
    textScore.setHorizontalAlignment(SwingConstants.CENTER);
    //text.setVerticalAlignment(SwingConstants.NORTH);

    textScore.setFont(new Font("Iosevka", Font.PLAIN, 30));
    textScore.setOpaque(true);
    scoreBoard.setBackground(Color.darkGray);
    scoreBoard.setBounds(0, 0, 600, 50);
    scoreBoard.add(this.textScore);
  }

  public int getScore() {
    return this.score;
  }

  public void setScore(int paScore) {
    this.score = this.score + paScore;
  }

  public void setScoreZero() {
    this.score = 0;
  }
}
