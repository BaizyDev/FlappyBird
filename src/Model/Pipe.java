package Model;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;

public class Pipe {
  private Point coordinates;
  private Image pipeImage;

  public Pipe(){

  }

  private void setCoordinates(int x, int y){
    new Point(x, y);
  }

  private Point getCoordinates(){
    return coordinates;
  }

  public void paint(Graphics g){

  }
}
