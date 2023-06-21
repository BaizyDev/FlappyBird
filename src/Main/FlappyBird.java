package Main;

import java.awt.EventQueue;

import View.GameWindow;

public class FlappyBird{
  public static void main(String[] args){
    EventQueue.invokeLater(() -> new GameWindow());
  }
}