package Model;

import javax.imageio.ImageIO;
import java.awt.Image;
import java.io.File;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.*;
import javax.swing.*;


public class Bird extends GameObject{
  private static int SCREEN_WIDTH = 800;  // Die Breite des Spielfelds
  private static int SCREEN_HEIGHT = 600;
  private int life;
  private Point coordinates;
  private Image birdImage;
  private boolean isInCenter;

  public Bird(int x, int y, int width, int height){
    super(x, y, width, height);
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

  public void update(){
    if(x < SCREEN_WIDTH / 2){
      isInCenter = true;
    }else{
      isInCenter = false;
    }
  }
  @Override
  public void draw(Graphics g) {
    g.drawImage(birdImage, x, y, width, height, null);
  }
}
