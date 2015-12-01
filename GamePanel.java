/*
Cosmic Intruders
Authors: James, Nick, Jon

The panel displaying the processes of the game
*/

import javax.swing.JPanel;
import java.awt.Graphics2D;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.Timer;
public class GamePanel extends JPanel
{
    private PlayerShip player;
    public GamePanel()
    {
        player = new PlayerShip(1024);
        setBackground(Color.black);
        ActionListener timerListener = new ActionListener()
        {
            public void actionPerformed(ActionEvent evt)
            {
                player.setX(player.getX());
                player.setY(player.getY() + 1);
                repaint();
            }
        };
        Timer gameRefresh = new Timer(10, timerListener);
        gameRefresh.start();
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
