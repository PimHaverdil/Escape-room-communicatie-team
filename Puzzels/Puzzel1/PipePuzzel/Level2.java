
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level2 extends World
{
    private int i = 7;
    private int x = 13;
    private int y = 1;
    private int o = 5;
    private int e = 1;
    private int h = 15;
    private int u = 12;
    /**
     * Constructor for objects of class Level2.
     * 
     */
    public Level2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(20, 12, 60);
        setBackground("images/cell.png");
        addWalls();
        addPlayer();
        Greenfoot.setSpeed(30);
    }
    
    public void addWalls()
    { 
      //row 1
      addObject(new SolidWall(),3,0);
      addObject(new SolidWall(),5,0);
      addObject(new SolidWall(),11,0);
      
      //row 2
      addObject(new SolidWall(),1,1);
      addObject(new SolidWall(),2,1);
      addObject(new SolidWall(),3,1);
      addObject(new SolidWall(),5,1);
      while(i < 12)
      {
          addObject(new SolidWall(),i ,1);
          i++;
      }
      while(x < 19)
      {
          addObject(new SolidWall(), x, 1);
          x++;
      }
      
      //row 3
      addObject(new SolidWall(),5,2);
      addObject(new SolidWall(),13,2);
      
      //row 4
      while(y < 14)
      {
          addObject(new SolidWall(),y,3);
          y++;
      }
      addObject(new SolidWall(),15,3);
      addObject(new SolidWall(),16,3);
      addObject(new SolidWall(),17,3);
      addObject(new SolidWall(),18,3);
      
      //row 5
      addObject(new SolidWall(),3,4);
      addObject(new SolidWall(),15,4);
      addObject(new SolidWall(),17,4);
      
      //row 6
      addObject(new SolidWall(),0,5);
      addObject(new SolidWall(),1,5);
      addObject(new SolidWall(),3,5);
      while(o < 16)
      {
          addObject(new SolidWall(),o,5);
          o++;
      }
      addObject(new SolidWall(),17,5);
      addObject(new SolidWall(),19,5);
      
      //row 7
      addObject(new SolidWall(),3,6);
      addObject(new SolidWall(),7,6);
      addObject(new SolidWall(),13,6);
      addObject(new SolidWall(),17,6);
      addObject(new SolidWall(),19,6);
      
      //row 8
      while(e < 6)
      {
          addObject(new SolidWall(),e,7);
          e++;
      }
      addObject(new SolidWall(), 7, 7);
      addObject(new SolidWall(), 8, 7);
      addObject(new SolidWall(), 9, 7);
      addObject(new SolidWall(), 11, 7);
      addObject(new SolidWall(), 13, 7);
      addObject(new SolidWall(), 15, 7);
      
      //row 9
      addObject(new SolidWall(),1,8);
      addObject(new SolidWall(),3,8);
      addObject(new SolidWall(),5,8);
      addObject(new SolidWall(),9,8);
      addObject(new SolidWall(),11,8);
      while(h < 20)
      {
          addObject(new SolidWall(),h,8);
          h++;
      }
      
      //row 10
      addObject(new SolidWall(),1,9);
      addObject(new SolidWall(),5,9);
      addObject(new SolidWall(),6,9);
      addObject(new SolidWall(),7,9);
      addObject(new SolidWall(),9,9);
      addObject(new SolidWall(),11,9);
      addObject(new SolidWall(),12,9);
      addObject(new SolidWall(),15,9);
      
      //row 11
      addObject(new SolidWall(),3,10);
      addObject(new SolidWall(),7,10);
      addObject(new SolidWall(),9,10);
      while(u < 19)
      {
          addObject(new SolidWall(),u,10);
          u++;
      }
      
      //row 12
      addObject(new SolidWall(),3,11);
      addObject(new SolidWall(),5,11);
      addObject(new SolidWall(),9,11);

      while(i < 10)
      {
        
       i++;
      }
    }
    
    public void addPlayer()
    {
        addObject(new Player(), 16,9);
        addObject(new Enemy(),10,11);
        addObject(new Door(),4,0);
    }
}
