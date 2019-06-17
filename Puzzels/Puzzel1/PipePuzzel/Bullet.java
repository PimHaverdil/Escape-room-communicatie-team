import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)
import javax.swing.JOptionPane;
/**
 * A bullet that can hit asteroids.
 * 
 * @author Poul Henriksen
 */
public class Bullet extends Mover
{
    /** A bullet looses one life each act, and will disappear when life = 0 */
    private int life = 30;
    
    /** The damage this bullet will deal */
    private int damage = 16;
    
    public Bullet()
    {
    }
    
    public Bullet(Vector speed, int rotation)
    {
        super(speed);
        setRotation(rotation);
        increaseSpeed(new Vector(rotation, 15));
    }
    
    /**
     * The bullet will damage asteroids if it hits them.
     */
    public void act()
    {
        if(life <= 0) {
            getWorld().removeObject(this);
            JOptionPane.showMessageDialog(null, "You got Killed!");
            Greenfoot.setWorld(new Level1());
        } 
        else {
            move();
            Player player = (Player) getOneIntersectingObject(Player.class);
            if(player != null){
            getWorld().removeObject(this);
            JOptionPane.showMessageDialog(null, "You got Killed!");
            Greenfoot.setWorld(new Level1());
            }
        }
        
        // removeBullet();
    }
    
    public boolean canSee(Class clss)
    {
        Actor actor = getOneObjectAtOffset(0, 0, clss);
        return actor != null;        
    }
    
    // public void removeBullet()
    // {
       // if (isAtEdge())
       // {
           // getWorld().removeObject(this);
       // }
    // }
}