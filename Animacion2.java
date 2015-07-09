import greenfoot.*;
import java.util.LinkedList;
/**
 * Escribe una descrición de la clase Animacion2 aquí.
 * 
 * @autor (tu nombre) 
 * @versión (Un número de versión o una fecha)
 */
public class Animacion2 extends PlataformaEnemigo2
{
    private LinkedList <GreenfootImage> imagenes;
    private int frame;
    private int cont;
    /**
     * Constructor de Animacion3
     * crea una lista de imagenes
     */
     public Animacion2()
    {
    imagenes = new LinkedList();
        imagenes.add(new GreenfootImage("enemigo2.png"));         
        imagenes.add(new GreenfootImage("animacion11.png"));     
        imagenes.add(new GreenfootImage("animacion12.png"));
        imagenes.add(new GreenfootImage("animacion13.png"));     
        imagenes.add(new GreenfootImage("animacion14.png"));
        imagenes.add(new GreenfootImage("animacion15.png"));     
       imagenes.add(new GreenfootImage("animacion16.png"));
        //imagenes.add(new GreenfootImage("animacion8.png"));
          
       setImage(getImagen(0));
    }
    
   /**
     * Act - ejecuta la funcion animar
     * siempre estara ecutada mientras que estes jugando
     */
    public void act() 
    {
        
        //move(jug);    
        animar();
        
    }    
    
     /**
     * animar -
     * hace que las imagenes se intercalen y asi se vea que se esta produciendo un cambio de imagenes
     * pareciera como si cambiaran de objeto
     *
     */
           public void animar()
    {
        
           switch(frame) 
             {
                case 4: setImage(getImagen(0));
                break;
                case 8: setImage(getImagen(1));
                break;
                case 12: setImage(getImagen(2));
                break;
                case 16: setImage(getImagen(3));
                break;
                case 20: setImage(getImagen(4));
                break;
                 case 24: setImage(getImagen(6));
                  cont++;
                /*break;
                case 28: setImage(getImagen(8));*/
                frame = 0;
                
                break;

            }

         if(frame == 40) {
           setImage(getImagen(0));
            frame = 0;
           
            
        }
        if(cont==10)
               Greenfoot.setWorld(new Nivel3()); 
        frame++;            
           
    }
    
    
     public GreenfootImage getImagen(int n)
    {
        return imagenes.get(n);
    }
    
}
