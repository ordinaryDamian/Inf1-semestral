//can you create a java class that will hanle input from arrow keys ?
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class input implements KeyListener {

  public void keyPressed(KeyEvent e) {
    System.out.println("Key Pressed: " + e.getKeyCode());
    handleInput(e.getKeyCode());
  }

  public void keyReleased(KeyEvent e) {
    System.out.println("Key Released: " + e.getKeyCode());
  }

  public void keyTyped(KeyEvent e) {
    System.out.println("Key Typed: " + e.getKeyChar());
  }

  private void handleInput(int keyCode) {
    // Use switch-case statement to handle different key codes
    switch (keyCode) {
      case KeyEvent.VK_UP:
        // Code to execute when UP arrow key is pressed
        //Zmenit orientáciu bloku
        break;
      case KeyEvent.VK_DOWN:
        // Code to execute when DOWN arrow key is pressed
        //Zrýchliť padanie bloku
        break;
      case KeyEvent.VK_LEFT:
        // Code to execute when LEFT arrow key is pressed
        //posunúť blok o jednu kocku dolava
        break;
      case KeyEvent.VK_RIGHT:
        // Code to execute when RIGHT arrow key is pressed
        //posunuť o jednu kocku doprava
        break;
      default:
        // Code to execute for all other keys
        //System.out.println(
        //  "You pressed wrong key, please read manual for assitance."
        //);
        break;
    }
  }
}
