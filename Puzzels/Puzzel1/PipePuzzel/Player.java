import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.JOptionPane;

 /**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        playerMovement();
        findDoor();
    } 
    
    public void playerMovement()
    {
       int dx = 0, dy = 0; 
       if (Greenfoot.isKeyDown("W"))
       {
           dy = -1;
       }
       if (Greenfoot.isKeyDown("A"))
       {
           dx = -1;
       }
       if (Greenfoot.isKeyDown("S"))
       {
           dy = 1;
       }
       if (Greenfoot.isKeyDown("D")) 
       {  
           dx = 1;
       }
       setLocation(getX()+dx, getY()+dy);
       if (isTouching(SolidWall.class))
       {
           setLocation(getX()-dx, getY()-dy);
       }
    }
    
    public boolean canSee(Class clss)
    {
        Actor actor = getOneObjectAtOffset(0, 0, clss);
        return actor != null;        
    }
    
    public void findDoor()
    {
        if(canSee(Door.class))
        {
            JOptionPane.showMessageDialog(null, "To the next level you go!");
            
        
            Greenfoot.setWorld(new Level2());
        
        }
    }
    }

