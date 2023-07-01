package Model;

import java.io.File;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;

import javax.imageio.ImageIO;


public class PipeUpside extends GameObject{
    private static int SCREEN_WIDTH = 800;  // Die Breite des Spielfelds
  private static int SCREEN_HEIGHT = 600;
  private Point coordinates;
  private Image pipeImage;
  private Image pipeImageUpside;
  private boolean isVisible;

  public PipeUpside(int x, int y, int width, int height){
    super(x, y, height, width);

    try {
      pipeImage = ImageIO.read(new File("src/ressources/images/PipeUpside.png"));
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  private void setCoordinates(int x, int y){
    new Point(x, y);
  }

  private Point getCoordinates(){
    return coordinates;
  }


  public void update(){
    if((x + width) < 1 || x < 800){
      isVisible = true;
    }else{
      isVisible = false;
    }
  }

    
  @Override
  public void draw(Graphics g){
    g.drawImage(pipeImage, x, y, width, height, null);
  }
}
