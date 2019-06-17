import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.JOptionPane;
/**
 * Write a description of class Boss here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boss extends Mover
{
    private static final int NORTH = 0;
    private static final int SOUTH = 1;
    private int rotation;
    private int gunReloadTime;                  // The minimum delay between firing the gun.
    private int reloadDelayCount;               // How long ago we fired the gun the last time.
    private Vector acceleration;                // How fast the rocket is.
    private int shotsFired; 
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
        gunReloadTime = 15;
        reloadDelayCount = 5; // initially slowly drifting
        shotsFired = 0;
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
    
     /**
     * Fire a bullet if the gun is ready.
     */
    private void fire() 
    {
        int rn = Greenfoot.getRandomNumber(5);
            Bullet b = new Bullet(getMovement().copy(), getRotation());
            getWorld().addObject(b, getX() - rn , getY() - rn);
            b.move();
            shotsFired++;
            reloadDelayCount = 0;
    }
    
     /**
     * Set the time needed for re-loading the rocket's gun. The shorter this time is,
     * the faster the rocket can fire. The (initial) standard time is 20.
     */
    public void setGunReloadTime(int reloadTime)
    {
        gunReloadTime = reloadTime;
    }
    
     /**
     * Return the number of shots fired from this rocket.
     */
    public int getShotsFired()
    {
        return shotsFired;
    }
}
