import greenfoot.*;

/**
 * Escribe una descrición de la clase PASSWORD aquí.
 * 
 * @autor (tu nombre) 
 * @versión (Un número de versión o una fecha)
 */
public class PASSWORD extends BOTONES_MENU
{

    /**
     * En cualquier momento del juego al hacer clic en esta clase, producira que cambie el mundo. 
     * hace un llamado al mundo "Creditos"
     */
    public void act() 
    {
        if (Greenfoot.mouseClicked(this))  
        {  
            Greenfoot.setWorld(new Creditos());  
        }
    }    
}
