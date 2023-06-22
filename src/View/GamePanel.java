package View;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import Presenter.GamePresenter;

import java.awt.Dimension;
import java.awt.Image;
import java.io.File;
import java.awt.Graphics;

public class GamePanel extends JPanel{
  private static final int WINDOW_HEIGHT = 800;
  private static final int WINDOW_WIDTH = 600;
  private Image backgroundImage;
  private GamePresenter presenter;
  

  public GamePanel(GamePresenter presenter){
    this.presenter = presenter;
    setPreferredSize(new Dimension(WINDOW_WIDTH, WINDOW_HEIGHT));
    setVisible(true);

    try {
      backgroundImage = ImageIO.read(new File("src/ressources/images/Background.png"));
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

    @Override
  protected void paintComponent(Graphics g){
    super.paintComponent(g);
    g.drawImage(backgroundImage, 0, 0, WINDOW_WIDTH, WINDOW_HEIGHT, null);
  }
}
