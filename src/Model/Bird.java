package Model;

import javax.imageio.ImageIO;
import java.awt.Image;
import java.io.File;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.*;
import javax.swing.*;


public class Bird extends JPanel{
  private int life;
  private Point coordinates;
  private Image birdImage;

  public Bird(){

    try {
      birdImage = ImageIO.read(new File("src/ressources/images/Bird.png"));
    } catch (Exception e) {
      e.printStackTrace();
    }
  }


  public int getLife(){
    return life;
  }

  public void setLife(int life){
    this.life = life;
  }

  public void setCoordinates(int x, int y){
    new Point(x, y);
  }

  public Point getCoordinates(){
    return coordinates;
  }

  @Override
  public void draw(Graphics g) {
    super.paintComponent(g);
    g.drawImage(birdImage, 300, 400, 50, 50, null);
  }



}
