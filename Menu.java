import greenfoot.*;

/**
 * Write a description of class Menu here.
 * 
 * @author Cristy&Hugo 
 * @version (a version number or a date)
 */
public class Menu extends World
{
    private GreenfootSound Lets;

    /**
     * Constructor for objects of class Menu.
     * Se crean los objetos para este mundo
     */
    public Menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
       
        super(600, 400, 1);
         Lets = new GreenfootSound("Lets.mp3");
        // Lets.play();
        PASSWORD p1=new PASSWORD();
          addObject(p1,505,26);
        BotonJugar B1=new BotonJugar();
        addObject(B1,61,187);
        BotonAyuda B2=new BotonAyuda();
         addObject(B2,249,319);
      
      // ScoreBoard B3=new ScoreBoard(600,400);
       //addObject(B3,350,350);
       
    }
}
