//Spustit vsetko
public class Aplikacia {

  private Frame okno;
  private Buttons buttons;
  private ScoreBoard scoreBoard;
  private PlayingField playfield;

  public Aplikacia() {
    this.okno = new Frame();
    this.buttons = new Buttons();
    this.scoreBoard = new ScoreBoard();
    this.playfield = new PlayingField();
    //FIXNE: nepridavam komponenty ale class okravit
    okno.add(this.buttons);
    okno.add(this.scoreBoard);
    okno.add(this.playfield);
  }
}
