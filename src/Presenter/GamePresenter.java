package Presenter;

import Model.Bird;
import Model.Pipe;
import Model.PipeUpside;
import View.GameWindow;
import javax.swing.*;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GamePresenter implements ActionListener{
  private Timer timer = null;
  private GameWindow window;
  private Bird bird;
  private PipeUpside topPipe;
  private Pipe botPipe;
  private boolean playMode;

  public GamePresenter(GameWindow gameWindow){
    this.window = gameWindow;
    bird = new Bird(260, 325, 100, 100);
    topPipe = new PipeUpside(260, 0, 100, 200);
    botPipe = new Pipe(260, 575, 100, 200);
    timer = new Timer(10, this);
    timer.start();
  }

  @Override
  public void actionPerformed(ActionEvent e){
    updateGame();
    window.repaint();
  }

  public void updateGame(){
    if(playMode = false){
      timer.stop();
    }
    else{

    }
  }

  public void drawBird(Graphics g){
    bird.draw(g);
  }

  public void drawPipe(Graphics g){
    topPipe.draw(g);
    botPipe.draw(g);
  }



}
