package View;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.io.File;
import java.awt.Graphics;

public class MenuPanel extends JPanel {
  private static final int WINDOW_HEIGHT = 800;
  private static final int WINDOW_WIDTH = 600;
  public JButton startButton;
  public JButton exitButton;
  public JButton scoreButton;
  private JPanel top;
  private JPanel mid;
  private JPanel bot;
  private Image backgroundImage;
  private Image logo;

  public MenuPanel() {
    setLayout(new BorderLayout());
    setPreferredSize(new Dimension(WINDOW_WIDTH, WINDOW_HEIGHT));
    setVisible(true);

    top = new JPanel();
    top.setBackground(Color.BLACK);
    top.setPreferredSize(new Dimension(WINDOW_WIDTH, 200));
    top.setOpaque(false);
    top.setLayout(null);
    add(top, BorderLayout.NORTH);

    mid = new JPanel();
    mid.setBackground(Color.RED);
    mid.setPreferredSize(new Dimension(WINDOW_WIDTH, 400));
    mid.setOpaque(false);
    mid.setLayout(null);
    add(mid, BorderLayout.CENTER);

    bot = new JPanel();
    bot.setBackground(Color.BLUE);
    bot.setPreferredSize(new Dimension(WINDOW_WIDTH, 200));
    bot.setOpaque(false);
    bot.setLayout(null);
    add(bot, BorderLayout.SOUTH);

    startButton = new JButton("Start");
    // ImageIcon startIcon = new ImageIcon(getClass().getResource("src/ressources/images/Background.png"));
    // startButton.setIcon(startIcon);
    startButton.setBounds(225, 75, 150, 50);
    
    scoreButton = new JButton("Score");
    // ImageIcon scoreIcon = new ImageIcon(getClass().getResource("src/ressources/images/Score.jpg"));
    // scoreButton.setIcon(scoreIcon);
    scoreButton.setBounds(225, 175, 150, 50);

    exitButton = new JButton("Exit");
    // ImageIcon exitIcon = new ImageIcon(getClass().getResource("src/ressources/images/Exit.jpg"));
    // exitButton.setIcon(exitIcon);
    exitButton.setBounds(225, 275, 150, 50);
    
    mid.add(startButton);
    mid.add(exitButton);
    mid.add(scoreButton);

    try {
      backgroundImage = ImageIO.read(new File("src/ressources/images/Background.png"));
    } catch (Exception e) {
      e.printStackTrace();
    }

    try {
      logo = ImageIO.read(new File ("src/ressources/images/Logo.png"));
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @Override
  protected void paintComponent(Graphics g){
    super.paintComponent(g);
    g.drawImage(backgroundImage, 0, 0, WINDOW_WIDTH, WINDOW_HEIGHT, null);
    g.drawImage(logo, 150, 25, 300, 200, top);
  }
}
