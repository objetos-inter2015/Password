import greenfoot.*;
import java.util.LinkedList;
/**
 * Escribe una descrición de la clase Animacion aquí.
 * 
 * @autor (tu nombre) 
 * @versión (Un número de versión o una fecha)
 */
public class Animacion extends PlataformaEnemigo
{
    private LinkedList <GreenfootImage> imagenes;
    private int frame;
    private int cont;
    /**
     * Constructor de Animacion3
     * crea una lista de imagenes
     */
     public Animacion()
    {
    imagenes = new LinkedList();
        imagenes.add(new GreenfootImage("enemigo.PNG"));         
        imagenes.add(new GreenfootImage("animacion1.png"));     
        imagenes.add(new GreenfootImage("animacion2.png"));
        imagenes.add(new GreenfootImage("animacion3.png"));     
        imagenes.add(new GreenfootImage("animacion4.png"));
        imagenes.add(new GreenfootImage("animacion5.png"));     
       imagenes.add(new GreenfootImage("animacion6.png"));
        //imagenes.add(new GreenfootImage("animacion8.png"));
          
       setImage(getImagen(0));
    }
    
    /**
     * Act - hace lo que Animacion quiere hacer. Este método se llama "cuando quiera" o whenever
     * los botones 'Actuar or 'Ejecutar' son presionados en el entorno.
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
               Greenfoot.setWorld(new Nivel2(band)); 
        frame++;            
           
    }
    
    
     public GreenfootImage getImagen(int n)
    {
        return imagenes.get(n);
    }
    
}
