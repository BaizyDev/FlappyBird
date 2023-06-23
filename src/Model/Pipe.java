package Model;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;

import javax.swing.JPanel;

public class Pipe extends GameObject{
  private static int SCREEN_WIDTH = 800;  // Die Breite des Spielfelds
  private static int SCREEN_HEIGHT = 600;
  private Point coordinates;
  private Image pipeImage;
  private boolean isVisible;

  public Pipe(int x, int y, int width, int height){

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
    g.drawImage(pipeImage, 300, 400, 50, 50, null);
  }
}
