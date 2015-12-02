/*
Cosmic Intruders
Authors: James, Nick, Jon

The panel displaying the processes of the game
*/

import javax.swing.JPanel;
import java.awt.Graphics2D;
import java.awt.Graphics;
import java.awt.Color;
import java.util.Timer;
import java.util.TimerTask;

public class GamePanel extends JPanel
{
    private PlayerShip player;
    public GamePanel()
    {
        player = new PlayerShip(1024);
        setBackground(Color.black);
		Timer graphicsTimer = new Timer();
		TimerTask repaint = new TimerTask()
		{
			@Override
			public void run()
			{
				player.setY(player.getY() + 1);
				repaint();
			}
		};
		graphicsTimer.scheduleAtFixedRate(repaint, 0, 10);
    }
    @Override
    protected void paintComponent(Graphics g) 
    {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.WHITE);
        g2d.drawRect(player.getX(), player.getY(), 10, 10);
    }
}
