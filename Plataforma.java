import greenfoot.*;
import java.util.LinkedList;


/**
 * Escribe una descrición de la clase Plataforma aquí.
 * 
 * @autor (tu nombre) 
 * @versión (Un número de versión o una fecha)
 */
public class Plataforma extends BotonJugar
{
  private int posicionX;
  private int posicionY;
  private int i=0;
  private int nueva=0;
 public LinkedList <GreenfootImage> imagenes;

   /**
     * constructor: crea una lista de imagenes
     * 
     */
  public Plataforma() 
    {
       
         imagenes = new LinkedList();
        imagenes.add(new GreenfootImage("CuadroNegro.jpg"));         
        imagenes.add(new GreenfootImage("CuadroAmarillo.jpg"));     
        imagenes.add(new GreenfootImage("CuadroVerde.jpg"));     
       setImage(getImagen(0));
           
         
    }
    
    /**
     * Act llama a un metodo para que siempre se ejecute
     */
    
    public void act() 
    {
           
            interseccion();
             
              
           
    }
    
         public GreenfootImage getImagen(int n)
    {
        return imagenes.get(n);
    }
    
    
      /**
     * Verifica si esta intersectando a la clase goku y toma la Y y X del mundo y utiliza 
     * el posicionamiento de estas
     */
    public void interseccion()
    {
         World w=getWorld();
             w.showText("señala 7 casillas incluyendo la inicial y la final",300,20);
       if (getOneIntersectingObject(Goku.class) != null) {
                    if (Greenfoot.isKeyDown("enter"))
                     {
                        
                          World world = getWorld();
                          
                                posicionX=getX();
                                posicionY=getY();
                               posicion();
                               
                                 //getWorld().addObject(new Pverde(), getX(), getY());  
                                 
                                 
                                //world.removeObject(this);                         
                     }
           
                     
                      setImage(getImagen(1));
                 }
                
                 else 
                 setImage(getImagen(0));
       
    }
    
     /**
     * Destruye objetos plataforma y crea nuevos objetos, todo esto dependiendo donde 
     * se este dando clic
     * 
     */
    
    public void posicion() 
    {
         World world = getWorld();
        if(i<4){
             if(posicionX==265 && posicionY==350)
                                   {
                                         i++;
                                          Nivel1 spaceWorld = (Nivel1) getWorld();
                                          Counter counter = spaceWorld.getCounter();
                                           counter.bumpCount(5);
                                           getWorld().addObject(new Pverde(), getX(), getY());  
                                          world.removeObject(this); 
                                           
                                    }
             
             else if(posicionX==350 && posicionY==350)
                                   {
                                       
                                         i++;
                                         Nivel1 spaceWorld = (Nivel1) getWorld();
                                         Counter counter = spaceWorld.getCounter();
                                         counter.bumpCount(-6);
                                         getWorld().addObject(new Projo(), getX(), getY());  
                                          world.removeObject(this); 
                                    }
                                    
             else if(posicionX==435 && posicionY==350)
                                   {
                                         i++;
                                         Nivel1 spaceWorld = (Nivel1) getWorld();
                                         Counter counter = spaceWorld.getCounter();
                                         counter.bumpCount(-6);
                                         getWorld().addObject(new Projo(), getX(), getY());  
                                          world.removeObject(this); 
                                    }
             else if(posicionX==520 && posicionY==350)
                                   {
                                       i++;
                                        Nivel1 spaceWorld = (Nivel1) getWorld();
                                         Counter counter = spaceWorld.getCounter();
                                         counter.bumpCount(-6);
                                         getWorld().addObject(new Projo(), getX(), getY());  
                                          world.removeObject(this); 
                                    }
                                    
             else if(posicionX==265 && posicionY==265)
                                   {
                                          i++;
                                          Nivel1 spaceWorld = (Nivel1) getWorld();
                                          Counter counter = spaceWorld.getCounter();
                                           counter.bumpCount(5);
                                           getWorld().addObject(new Pverde(), getX(), getY());  
                                          world.removeObject(this); 
                                    }
             
            else  if(posicionX==350 && posicionY==265)
                                   {
                                        
                                        i++;
                                          Nivel1 spaceWorld = (Nivel1) getWorld();
                                          Counter counter = spaceWorld.getCounter();
                                           counter.bumpCount(5);
                                           getWorld().addObject(new Pverde(), getX(), getY());  
                                          world.removeObject(this); 
                                    }
                                    
             else if(posicionX==435 && posicionY==265)
                                   {
                                         i++;
                                         Nivel1 spaceWorld = (Nivel1) getWorld();
                                         Counter counter = spaceWorld.getCounter();
                                         counter.bumpCount(-6);
                                         getWorld().addObject(new Projo(), getX(), getY());  
                                          world.removeObject(this); 
                                    }
             else if(posicionX==520 && posicionY==265)
                                   {
                                        i++;
                                         Nivel1 spaceWorld = (Nivel1) getWorld();
                                         Counter counter = spaceWorld.getCounter();
                                         counter.bumpCount(-6);
                                         getWorld().addObject(new Projo(), getX(), getY());  
                                          world.removeObject(this); 
                                    }
             
            else  if(posicionX==265 && posicionY==180)
                                   {
                                         i++;
                                         Nivel1 spaceWorld = (Nivel1) getWorld();
                                         Counter counter = spaceWorld.getCounter();
                                         counter.bumpCount(-6);
                                         getWorld().addObject(new Projo(), getX(), getY());  
                                          world.removeObject(this); 
                                    }
             
             else if(posicionX==350 && posicionY==180)
                                   {
                                          i++;
                                          Nivel1 spaceWorld = (Nivel1) getWorld();
                                          Counter counter = spaceWorld.getCounter();
                                           counter.bumpCount(5);
                                           getWorld().addObject(new Pverde(), getX(), getY());  
                                          world.removeObject(this); 
                                    }
                                    
             else if(posicionX==435 && posicionY==180)
                                   {
                                         i++;
                                          Nivel1 spaceWorld = (Nivel1) getWorld();
                                          Counter counter = spaceWorld.getCounter();
                                           counter.bumpCount(5);
                                           getWorld().addObject(new Pverde(), getX(), getY());  
                                          world.removeObject(this); 
                                    }
            else  if(posicionX==520 && posicionY==180)
                                   {
                                        i++;
                                          Nivel1 spaceWorld = (Nivel1) getWorld();
                                          Counter counter = spaceWorld.getCounter();
                                           counter.bumpCount(5);
                                           getWorld().addObject(new Pverde(), getX(), getY());  
                                          world.removeObject(this); 
                                    }
                                    
             else if(posicionX==265 && posicionY==95)
                                   {
                                         i++;
                                         Nivel1 spaceWorld = (Nivel1) getWorld();
                                         Counter counter = spaceWorld.getCounter();
                                         counter.bumpCount(-6);
                                         getWorld().addObject(new Projo(), getX(), getY());  
                                          world.removeObject(this); 
                                    }
             
             else if(posicionX==350 && posicionY==95)
                                   {
                                        i++;
                                         Nivel1 spaceWorld = (Nivel1) getWorld();
                                         Counter counter = spaceWorld.getCounter();
                                         counter.bumpCount(-6);
                                         getWorld().addObject(new Projo(), getX(), getY());  
                                          world.removeObject(this); 
                                    }
                                    
            else  if(posicionX==435 && posicionY==95)
                                   {
                                         i++;
                                         Nivel1 spaceWorld = (Nivel1) getWorld();
                                         Counter counter = spaceWorld.getCounter();
                                         counter.bumpCount(-6);
                                         getWorld().addObject(new Projo(), getX(), getY());  
                                          world.removeObject(this); 
                                    }
             else if(posicionX==520 && posicionY==95)
                                   {
                                          i++;
                                          Nivel1 spaceWorld = (Nivel1) getWorld();
                                          Counter counter = spaceWorld.getCounter();
                                           counter.bumpCount(5);
                                           getWorld().addObject(new Pverde(), getX(), getY());  
                                          world.removeObject(this); 
                                          world.addObject(new Animacion(),105,275);
                                        
                                          world.showText("Camino correcto ",105,365);
                                    }                       
              }
    }
    
         
}
              

