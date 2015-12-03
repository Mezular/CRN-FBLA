/*
Cosmic Intruders
Authors: James, Nick, Jon

The class representing bullets
*/

public class Bullet
{
    private String direction;
    private int x; //the bullet's x coordinate
    private int y; //the bullet's y coordinate
    private final int l = 10; //the bullet's length
    private final int h = 10; //the bullet's height
    private boolean visible = true;
    public Bullet(int startx, int starty)
    {
        x = startx;
	      y = starty;
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
    public boolean getVisible()
    {
        return visible;
    }
    public String getDirection()
    {
    	return direction;
    }
    public void setDirection(String newd)
    {
    	direction = newd;
    }
    }
}
