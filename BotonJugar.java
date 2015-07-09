import greenfoot.*;

/**
 * Escribe una descrición de la clase BotonJugar aquí.
 * 
 * @autor (tu nombre) 
 * @versión (Un número de versión o una fecha)
 */
public class BotonJugar extends BOTONES_MENU
{
  
    public int band=0;
 
    /**
     * Act - hace lo que BotonJugar quiere hacer. Este método se llama "cuando quiera" o whenever
     * Llama a otro mundo y ademas crea una variable band que la podran utiliar sus subclases
     */
    public void act() 
    {
         // Add your action code here.
        if(Greenfoot.mouseClicked(this))
        {
            World w=getWorld();
            w=new ElegirJugador();
            Greenfoot.setWorld(w);
        }
              
        
    }   
}
