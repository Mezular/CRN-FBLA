/*
Cosmic Intruders
Authors: James, Nick, Jon

The panel displaying the processes of the game
*/

import javax.swing.JPanel;
import javax.swing.ImageIcon;
import java.awt.Graphics2D;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Timer;
import java.util.TimerTask;

public class GamePanel extends JPanel
{
    private PlayerShip player;
	private int direction;
    public GamePanel()
    {
        player = new PlayerShip(1024, 768);
        setBackground(Color.black);
		Timer timer = new Timer();
		TimerTask repaint = new TimerTask()
		{
			@Override
			public void run()
			{
				player.setX(player.getX() + direction);
				repaint();
			}
		};
		addKeyListener(new KeyAdapter() 
		{
			public void keyPressed(KeyEvent e) 
			{                
				if(e.getKeyCode() == KeyEvent.VK_LEFT)
				{
					direction = -1;
				}
				else if(e.getKeyCode() == KeyEvent.VK_RIGHT)
				{
					direction = 1;
				}
			}
			public void keyReleased(KeyEvent e) 
			{                
				if(e.getKeyCode() == KeyEvent.VK_LEFT || e.getKeyCode() == KeyEvent.VK_RIGHT)
				{
					direction = 0;
				}
			}
		});
		timer.scheduleAtFixedRate(repaint, 0, 1);
    }
    @Override
    protected void paintComponent(Graphics g) 
    {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.WHITE);
        g2d.drawImage(player.getSprite(), player.getX(), player.getY(), this);
    }
}
