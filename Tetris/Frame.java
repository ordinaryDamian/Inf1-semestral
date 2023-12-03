/*
 *https://www.youtube.com/watch?v=xk4_1vDrzzo&list=PLUkXNtsgszckPOy_uH07PfNLfge8N9N2b&index=4&t=20383s
 */
import java.awt.*;
import javax.swing.*;

public class Frame extends JFrame {

  private final int WIDTH = 600;
  private final int HEIGHT = 1050;

  public Frame() {
    this.setVisible(true);
    this.setTitle("Tetris Nadžady");
    this.setSize(WIDTH, HEIGHT);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setResizable(false);
    this.getContentPane().setBackground(new Color(127, 128, 127));
    this.setLocation(300, 0);
    this.setLayout(null);
  }
}
