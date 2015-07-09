import greenfoot.*;

/**
 * Escribe una descrición de la clase Creditos aquí.
 * 
 * @autor (tu nombre) 
 * @versión (Un número de versión o una fecha)
 */
public class Creditos extends World
{
   private GreenfootSound music;
    /**
     * Constructor para objetos de clase Creditos.
     * Reproduce un sonido para hacer mas emotivo todo
     * crea objetos como el boton regresar a menu
     */
    public Creditos()
    {    
        // Crea un nuevo mundo de 600x400 celdas con un tamaño de celda de 1x1 pixeles.
        super(600,400,1);
        music= new GreenfootSound("Back.mp3");
        music.play();
       
         Regresar menu = new Regresar();
         addObject(menu, 48,48);
         
   
         showText("MENU ",48,86);
         
    }
}
