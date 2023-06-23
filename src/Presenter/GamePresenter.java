package Presenter;

import Model.Bird;
import Model.Pipe;
import View.GameWindow;

import java.awt.Graphics;

public class GamePresenter {
  private GameWindow window;
  Bird bird = new Bird();
  Pipe topPipe = new Pipe();
  Pipe botPipe = new Pipe();

  public GamePresenter(GameWindow gameWindow){
    this.window = gameWindow;
  }

  public void updateGame(){

  }

  public void drawBird(Graphics g){
    // bird.paintComponent(g);
  }

  public void drawPipe(Graphics g){
    topPipe.paintComponent(g);
    botPipe.paintComponent(g);
  }


}
