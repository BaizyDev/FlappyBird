package Model;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.io.File;
import java.awt.Graphics;
import java.awt.Point;


public class Bird {
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

  public void paint(Graphics g){
  }


@Override
  protected void paintComponent(Graphics g){
    super.paintComponent(g);
    g.drawImage(birdImage, 0, 0, 50, 50, null);
  }
}
