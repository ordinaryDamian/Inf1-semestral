import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Movement implements KeyListener {

  //Nebudem používať
  @Override
  public void keyTyped(KeyEvent e) {}

  @Override
  public void keyPressed(KeyEvent e) {
    System.out.println(e.getKeyCode() + e.getKeyChar());
  }

  @Override
  public void keyReleased(KeyEvent e) {
    System.out.println(e.getKeyCode() + e.getKeyChar());
    switch (e.getKeyCode()) {
      case KeyEvent.VK_UP:
        System.out.println("Stlacil si hore");
        break;
      case KeyEvent.VK_LEFT:
        System.out.println("Stlacil si dolava");
        break;
      case KeyEvent.VK_RIGHT:
        System.out.println("Stlacil si doprava");
        break;
      case KeyEvent.VK_DOWN:
        System.out.println("Stlacil si dole");
        break;
      default:
        break;
    }
  }
}
