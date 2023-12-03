import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Buttons implements ActionListener { //ActionListener je to interface ktory pocuva ci bolo tlacidlo stlacene a podla toho uroby

  JButton showScore;
  JButton writeScore;
  JButton resetGame;

  public Buttons() {
    JPanel scoreBoard = new JPanel();
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

    scoreBoard.setLayout(new FlowLayout(0, 0, 0)); //TODO:
    scoreBoard.setBounds(0, 0, 475, 50);
    scoreBoard.add(showScore);
    scoreBoard.add(writeScore);
    scoreBoard.add(resetGame);
  }

  // @Override
  // public void ActionListener(ActionEvent e) {
  //   if (e.getSource() == this.showScore) {
  //     System.out.println("Tvoja história hier: ");
  //     //TODO: implement print of scores, nacitanie skore hráca zo suboru
  //   }
  //   if (e.getSource() == this.writeScore) {
  //     //TODO: implemet score write to file, zapísanie score do suboru v inej class
  //   }
  //   if (e.getSource() == this.resetGame) {
  //     //TODO: implement resetovať hru
  //   }
  // }

  @Override
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
}
