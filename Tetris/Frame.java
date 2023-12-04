/*
 *https://www.youtube.com/watch?v=xk4_1vDrzzo&list=PLUkXNtsgszckPOy_uH07PfNLfge8N9N2b&index=4&t=20383s
 */

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Frame extends JFrame implements ActionListener {

  private final int WIDTH = 475;
  private final int HEIGHT = 1050;
  private int score;
  private PlayingField playField;
  private JButton showScore;
  private JButton writeScore;
  private JButton resetGame;

  public Frame() {
    this.setVisible(true);
    this.setTitle("Tetris Nadžady");
    this.setSize(WIDTH, HEIGHT);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setResizable(false);
    this.getContentPane().setBackground(new Color(127, 128, 127));
    this.setLocationRelativeTo(null);
    this.setLayout(null);
    this.add(this.playField);
    this.playField.requestFocus();

    JPanel buttonPanel = new JPanel();
    showScore = new JButton();
    writeScore = new JButton();
    resetGame = new JButton();
    showScore.addActionListener(this); //this lebo class implementuje interdace ActionListener
    showScore.setToolTipText("Ukáž predošlé zapísané hry.");
    showScore.setIcon(new ImageIcon("scores.png"));
    showScore.setFocusable(false);
    showScore.setBackground(Color.LIGHT_GRAY);
    writeScore.addActionListener(this);
    writeScore.setToolTipText("Zapíš skóre aktuálnej hry");
    writeScore.setIcon(new ImageIcon("write.png"));
    writeScore.setFocusable(false);
    writeScore.setBackground(Color.LIGHT_GRAY);
    resetGame.addActionListener(this);
    resetGame.setToolTipText("Začni hru odznova");
    resetGame.setIcon(new ImageIcon("reset.png"));
    resetGame.setFocusable(false);
    resetGame.setBackground(Color.LIGHT_GRAY);

    buttonPanel.setLayout(new FlowLayout(0, 0, 0)); //TODO:
    buttonPanel.setBounds(0, 0, 475, 50);
    buttonPanel.add(showScore);
    buttonPanel.add(writeScore);
    buttonPanel.add(resetGame);
    this.add(buttonPanel);

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
    this.add(displayScore);
  }

  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == this.showScore) {
      System.out.println("Tvoja história hier: ");
      //TODO: implement print of scores, nacitanie skore hráca zo suboru
    }
    if (e.getSource() == this.writeScore) {
      //TODO: implemet score write to file, zapísanie score do suboru v inej class
    }
    if (e.getSource() == this.resetGame) {
      //TODO: implement resetovať hru
      //zmenit skore na 0
      //vycistit hracie pole
    }
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
