import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.JOptionPane;
/**
 * Write a description of class Boss here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boss extends Actor
{
    private static final int NORTH = 0;
    private static final int SOUTH = 1;
    private int rotation;
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        findPlayer();
        enemyMovement();
    } 
    
    public Boss()
    {
        rotation = 90;
        turn(rotation);
    }
    
    public void findPlayer()
    {
        if(canSee(Player.class))
        {
            eat(Player.class);
            JOptionPane.showMessageDialog(null, "You got Killed!");
        }
    }
    
    public void enemyMovement()
    {
       move(1);
       if(isAtEdge())
       {
           turn(180);
       } else if (isTouching(SolidWall.class))
       {
           turn(180);
       }
    }
    
    public boolean canSee(Class clss)
    {
        Actor actor = getOneObjectAtOffset(0, 0, clss);
        return actor != null;        
    }

    public void eat(Class clss)
    {
        Actor actor = getOneObjectAtOffset(0, 0, clss);
        if(actor != null) {
            getWorld().removeObject(actor);
            Greenfoot.setWorld(new Level1());
        }
    }
    
}
