/*
Cosmic Intruders
Authors: James, Nick, Jon

The class representing the enemy ships
*/
import java.awt.Image;
import javax.swing.ImageIcon;
public class Boss
{
    private int mid;
    private int dmg;
    private int hp;
    private int x; //the player's x coordinate
    private int y; //the player's y coordinate
	private Image sprite;
    private final int l = 300; //the boss sprite's length
    private final int h = 250; //the boss sprite's height
    public Boss(int windowLength, int bosshp, int bossdmg, String pixie)
    {
		sprite = new ImageIcon("GameApp".getClass().getResource(pixie)).getImage();
        mid = (windowLength - l)/2;
		    y = 0;
        x = mid;
		    hp = bosshp;
		    dmg = bossdmg;
    }
    public void setX(int value)
    {
        x = value;
    }
    public void setY(int value)
    {
        y = value;
    }
    public int getX()
    {
        return x;
    }
    public int getY()
    {
        return y;
    }
    public Image getSprite()
    {
        return sprite;
    }
	public void hit() //when the boss gets hit
    {
		  hp--;
    }
    public int getDMG()
    {
      return dmg;
    }
}
