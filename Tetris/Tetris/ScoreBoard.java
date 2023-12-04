import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.*;
import javax.swing.border.Border;

public class ScoreBoard {

  private int score;

  public ScoreBoard() {
    JPanel scoreBoard = new JPanel();
    JLabel displayScore = new JLabel();
    Border border = BorderFactory.createLineBorder(
      displayScore.getForeground(),
      1
    );
    this.score = 0;
    displayScore.setText("Skóre: " + this.score);
    displayScore.setForeground(new Color(255, 255, 255));
    displayScore.setBackground(scoreBoard.getBackground());
    displayScore.setHorizontalAlignment(JLabel.CENTER);
    displayScore.setVerticalAlignment(JLabel.CENTER);
    displayScore.setBorder(border);
    //displayScore.setFont(new Font("Iosevka", Font.PLAIN, 30));;
    displayScore.setOpaque(true); //zobrazenie pozadia panelu
    scoreBoard.setBackground(Color.DARK_GRAY);
    scoreBoard.setBounds(0, 50, 475, 50);
    scoreBoard.setLayout(new BorderLayout());
    scoreBoard.add(displayScore);
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
