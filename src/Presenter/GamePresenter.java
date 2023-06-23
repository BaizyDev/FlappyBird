package Presenter;

import Model.Bird;
import Model.Pipe;
import View.GameWindow;
import java.util.Timer;

import java.awt.Graphics;

public class GamePresenter {
  private Timer gameTimer;
  private GameWindow window;
  Bird bird = new Bird(400, 300, 50, 50);
  Pipe topPipe = new Pipe(200, 0, 100, -100);
  Pipe botPipe = new Pipe(500, 600, 100, 100);

  public GamePresenter(GameWindow gameWindow){
    this.window = gameWindow;
  }

  public void updateGame(){

  }

  public void drawBird(Graphics g){
     bird.draw(g);
  }

  public void drawPipe(Graphics g){
    topPipe.draw(g);
    botPipe.draw(g);
  }


}
