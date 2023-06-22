package Model;

import java.awt.Image;
import java.io.File;

import javax.imageio.ImageIO;

public class Life {
  private int countLife;
  private Image lifeImage;

  public Life(){
    try {
      lifeImage = ImageIO.read(new File("src/ressources/images/Heart.png"));
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

}
