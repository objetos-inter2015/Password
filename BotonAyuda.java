import greenfoot.*;

/**
 * Escribe una descrición de la clase BotonAyuda aquí.
 * 
 * @autor (tu nombre) 
 * @versión (Un número de versión o una fecha)
 */
public class BotonAyuda extends BOTONES_MENU
{
    /**
     * 
     * Llama a un escenario que contiene el entorno de como mover al usuario y como jugar
     */
    public void act() 
    {
       if(Greenfoot.mouseClicked(this))
        {
           Greenfoot.setWorld(new Ayuda()); 
        }
    }    
}
