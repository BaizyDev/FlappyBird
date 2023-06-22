package Model;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;

public class Bird {
  private int life;
  private Point coordinates;
  private Image birdImage;

  public Bird(){
    
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

  public void paint(Graphics g){
  }
}
