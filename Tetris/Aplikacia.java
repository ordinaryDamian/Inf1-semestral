//Spustit vsetko
public class Aplikacia {

  private Frame okno;
  private PlayingField playfield;

  public Aplikacia() {
    this.okno = new Frame();
    this.playfield = new PlayingField();
    this.okno.add(this.playfield);
  }
}
