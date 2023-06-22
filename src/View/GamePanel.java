package View;

import javax.swing.JPanel;
import java.awt.Dimension;

public class GamePanel extends JPanel{
  private static final int WINDOW_HEIGHT = 800;
  private static final int WINDOW_WIDTH = 600;
  

  public GamePanel(){
    setPreferredSize(new Dimension(WINDOW_WIDTH, WINDOW_HEIGHT));
    setVisible(true);
  }
}
