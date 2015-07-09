import greenfoot.*;

/**
 * Escribe una descrición de la clase BotonGoku aquí.
 * 
 * @autor (tu nombre) 
 * @versión (Un número de versión o una fecha)
 */
public class BotonGoku extends BotonJugar
{
   
    /**
     * Act - hace lo que BotonGoku quiere hacer. Este método se llama "cuando quiera" o whenever
     * Hace llamar el mundo del primer nivel y asi comenzar el juego
     * esto pasa cuando se le da clic sobre el
     */
    public void act() 
    { 
        if(Greenfoot.mouseClicked(this))
        {
            band=1;
          
            World w=getWorld();
            w=new Nivel1();
            Greenfoot.setWorld(w);
            
        }
    }    
}
