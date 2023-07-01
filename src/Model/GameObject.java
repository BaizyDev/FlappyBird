package Model;

import java.awt.*;

public abstract class GameObject {
  protected int x;
  protected int y;
  protected int height;
  protected int width;

  GameObject(int x, int y, int height, int width){
    this.x = x;
    this.y = y;
    this.height = height;
    this.width = width;
  }

  public int getY(){
    return y;
  }

  public void setY(int y){
    this.y = y;
  }

  public int getX(){
    return y;
  }

  public void setX(int x){
    this.x = x;
  }

  public int getWidth(){
    return width;
  }

  public void setWidth(int width){
    this.width = width;
  }

  public int getHeight(){
    return height;
  }

  public void setHeight(int height){
    this.height = height;
  }

  public abstract void update();

  public abstract void draw(Graphics g);

  //Kollisiondetection
  public boolean intersects(GameObject other){
    Rectangle thisBounds = new Rectangle(x, y, width, height);
    Rectangle otherBounds = new Rectangle(other.x, other.y, other.width, other.height);
    return thisBounds.intersects(otherBounds);
  }



}
