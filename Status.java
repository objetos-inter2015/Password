import greenfoot.*;
import java.util.LinkedList;

/**
 * Escribe una descrición de la clase Status aquí.
 * 
 * @autor (tu nombre) 
 * @versión (Un número de versión o una fecha)
 */
public class Status extends BotonJugar
{
    private LinkedList <GreenfootImage> imagenes;
    private int frame;
    private int cont;
    
     /**
     *Constructor 
     * Crea una lista de imagenes 
     */
     public Status()
    {
    imagenes = new LinkedList();
        imagenes.add(new GreenfootImage("frezzer.png"));         
        imagenes.add(new GreenfootImage("frezzer1.png"));     
        imagenes.add(new GreenfootImage("frezzer2.png"));

          
       setImage(getImagen(0));
    }
    
    /**
     * Act - hace lo que Animacion quiere hacer. 
     * Hace que el objeto intermbie sus posturas gracias a estar rotando sus imagenes
     */
    public void act() 
    {
        
        //move(jug);    
        animar();
        
    }    
     /**
     * 
     * Hace rotar las imagenes
     */
           public void animar()
    {
        
           switch(frame) 
             {
                case 7: setImage(getImagen(0));
                break;
                case 14: setImage(getImagen(1));
                break;
               
                 case 21: setImage(getImagen(2));
                  
                /*break;
                case 28: setImage(getImagen(8));*/
                frame = 0;
                
                break;

            }

         if(frame == 28) {
           setImage(getImagen(0));
            frame = 0;
           
            
        }
       
        frame++;            
           
    }
    
    
     public GreenfootImage getImagen(int n)
    {
        return imagenes.get(n);
    }
    
}