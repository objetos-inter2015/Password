import greenfoot.*;

/**
 * Write a description of class Final here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Final extends World
{

    /**
     * Constructor for objects of class Final.
     *  Se abrira una clase para que aparezca la pantalla final
     */
    public Final()
    {
         super(600,400,1);
         Regresar menu = new Regresar();
         addObject(menu, 48,48);
         
   
         showText("MENU ",48,86);
         
    }
}
