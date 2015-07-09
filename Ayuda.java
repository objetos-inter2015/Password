import greenfoot.*;

/**
 * Escribe una descrición de la clase Ayuda aquí.
 * 
 * Oguh Ortsac 
 * 1.0
 */
public class Ayuda extends World
{

    /**
     * Constructor para objetos de clase Ayuda.
     * Se crean los objetos que necesitara, uno de ellos es el de regresar a menu
     */
    public Ayuda()
    {    
        super(600,400,1);
        Regresar menu = new Regresar();
         addObject(menu, 530,348);
         
   
         showText("MENU ",530,320);
    }
}
