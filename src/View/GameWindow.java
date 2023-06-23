package View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import Presenter.GamePresenter;

public class GameWindow extends JFrame {

  private static final int WINDOW_HEIGHT = 800;
  private static final int WINDOW_WIDTH = 600;
  private MenuPanel menuPanel;
  private GamePanel gamePanel;
  private GamePresenter presenter;

  public GameWindow() {
    setVisible(true);
    setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
    setTitle("Flappy Bird");

    menuPanel = new MenuPanel();
    add(menuPanel);
    
    menuPanel.startButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent a){
        startGame();
      }
    });

    menuPanel.scoreButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent a){

      }
    });

    menuPanel.exitButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent a){
        System.exit(0);
      }
    });
    
  }

  public void startGame(){
    gamePanel = new GamePanel(presenter);
    presenter = new GamePresenter(this);
    remove(menuPanel);
    add(gamePanel);

    gamePanel.requestFocus();
    revalidate();
  }


}
