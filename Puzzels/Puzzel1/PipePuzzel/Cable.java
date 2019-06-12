    import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
    
    /**
     * Write a description of class Cable here.
     * 
     * @author (your name) 
     * @version (a version number or a date)
     */
    public class Cable extends Actor
    {
        public static int count = 0;
        
        /**
         * Act - do whatever the Cable wants to do. This method is called whenever
         * the 'Act' or 'Run' button gets pressed in the environment.
         */
        public void act() 
        {
            
        }    
        
        public void onClick()
        {
            if (Greenfoot.mouseClicked(this))
            {
                turn(90);
            }
        }
        
    public boolean Connected()
    {
        if (isTouching(StraightCable.class) || isTouching(BentCable.class))
        {
          addCount();
          return true;
        } else
        {   
          return false;
        }
    }
    
    public void addCount()
    {
          count += 1;
    }
    
    public static int getCount()
    {
        return count;
    }
}
