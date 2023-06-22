package View;

import javax.swing.JFrame;

public class GameWindow extends JFrame {

  private static final int WINDOW_HEIGHT = 800;
  private static final int WINDOW_WIDTH = 600;
  private MenuPanel menuPanel;

  public GameWindow() {
    setVisible(true);
    setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
    setTitle("Flappy Bird");

    menuPanel = new MenuPanel();
    add(menuPanel);

    
  }

  
}
