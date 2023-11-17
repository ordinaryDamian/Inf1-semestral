import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class test implements KeyListener {

  private boolean sipkaEast, sipkaWest, sipkaInverse1, sipkaInverse2;

  @Override
  public void keyTyped(KeyEvent e) {
    //stlacenie asi?
    if (e.getKeyCode() == e.VK_RIGHT) {
      this.sipkaEast = true;
    }
    if (e.getKeyCode() == e.VK_LEFT) {
      this.sipkaWest = true;
    }
  }

  @Override
  public void keyPressed(KeyEvent e) {
    // drzanie klavesi ?
    //System.out.println("Key pressed: " + e.getKeyChar());
  }

  @Override
  public void keyReleased(KeyEvent e) {
    // pustenie ?
    //
    if (e.getKeyCode() == e.VK_RIGHT) {
      this.sipkaEast = false;
    }
    if (e.getKeyCode() == e.VK_LEFT) {
      this.sipkaWest = false;
    }
  }
}
//v inej class bude pocuvat tento imput
