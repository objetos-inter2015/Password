import greenfoot.*;

/**
 * Escribe una descrición de la clase ElegirJugador aquí.
 * 
 * @autor (tu nombre) 
 * @versión (Un número de versión o una fecha)
 */
public class ElegirJugador extends World
{
    
    /**
     * Constructor para objetos de clase ElegirJugador.
     * 
     */
    public ElegirJugador()
    {     super(600,400,1);
        // Crea un nuevo mundo de 600x400 celdas con un tamaño de celda de 1x1 pixeles.
       
        BotonGoku g1=new BotonGoku();
        addObject(g1,150,200);
      
    }
}
