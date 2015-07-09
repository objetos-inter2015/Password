import greenfoot.*;

/**
 * Escribe una descrición de la clase Regresar aquí.
 * 
 * @autor (tu nombre) 
 * @versión (Un número de versión o una fecha)
 */
public class Regresar extends BOTONES_MENU
{
    /**
     * Act - 
     * al hacer clic en esta clase, producira que cambie el mundo. 
     * hace un llamado al mundo "menu"
     */
    public void act() 
    {
          if (Greenfoot.mouseClicked(this))  
        {  
            Greenfoot.setWorld(new Menu());  
        }
        
    }    
}
