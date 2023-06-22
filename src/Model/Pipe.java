package Model;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;

import javax.swing.JPanel;

public class Pipe extends JPanel{
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

  public void paintComponent(Graphics g){
    super.paintComponent(g);
    g.drawImage(pipeImage, 300, 400, 50, 50, null);
  }
}
