import greenfoot.*;
import java.util.LinkedList;
/**
 * Escribe una descrición de la clase Goku aquí.
 * 
 * @autor (tu nombre) 
 * @versión (Un número de versión o una fecha)
 */
public class Goku extends Jugadores
{    private int jug = 7;
     private LinkedList <GreenfootImage> imagenes;
     private int cont;
     private int verificar;

   

    /**
     * Constructor de la clase Goku
     * Crea una lista de imagenes que utilizara el usuario
     */
    public Goku()
    {
    imagenes = new LinkedList();
        imagenes.add(new GreenfootImage("jug22.png"));         
        imagenes.add(new GreenfootImage("jug2.png"));     
        imagenes.add(new GreenfootImage("jug23.png"));   
        imagenes.add(new GreenfootImage("jug24.png"));
        imagenes.add(new GreenfootImage("jug25.png"));
       setImage(getImagen(0));
    }
    
     /**
     * act- en cualquier instante del juego se estaran llamando en un ciclo las funciones que esten aqui 
     * 
     */
    public void act() 
    {
         animar();
        move(jug); 
        verificar();
    }    

     /**
     * genera n
     * 
     */
     public GreenfootImage getImagen(int n)
    {
        return imagenes.get(n);
    }
    
     /**
     *  Le dice al usuario con que letras se va mover y cuanto
     * 
     */
      public void move(int mover)  
    {  
      
        int dx = 0, dy = 0;  
       
        if (Greenfoot.isKeyDown("right"))
          { 
            setRotation(180);
            dx += 1; 
          
            }
        if (Greenfoot.isKeyDown("left")) 
           {
            setRotation(180);
            dx -= 1; 
            
            }
        if (Greenfoot.isKeyDown("down"))
          {
            setRotation(90);
            dy += 1;  
          
          }
        if (Greenfoot.isKeyDown("up"))
          {
            setRotation(270);
            dy -= 1;  
            
           }
          
           
      for (int i = 0; i < mover; i++)  
        {  
        
            setLocation(getX() + dx, getY());  
             setLocation(getX(), getY() + dy);  
           
             if ((getOneIntersectingObject(Limites.class) != null))
            {          
                setLocation(getX() - dx, getY());
                 setLocation(getX(), getY() - dy);
             } 
           }  
        
    }
      /**
     * Cambia las imagenes que se tienen para producir un efecto de que el usuario esta moviendo los pies
     * 
     */
          public void animar()
    {
        
             if((Greenfoot.isKeyDown("up"))|| (Greenfoot.isKeyDown("down"))|| (Greenfoot.isKeyDown("left")) )
                switch(cont) {
                case 1: setImage(getImagen(1));
                break;
                case 2: setImage(getImagen(2));
                cont = 0;
                break;

            }
           else if(Greenfoot.isKeyDown("right"))
            switch(cont) {
                case 1: setImage(getImagen(4));
                break;
                case 2: setImage(getImagen(3));
                cont = 0;
                break;

            }
            else 
                   setImage(getImagen(0));
        
         if(cont == 3) {
           
            cont = 0;
        }
        cont++;
    
    }
public void verificar()
    { 
     if ((getOneIntersectingObject(Pverde.class) != null )||(getOneIntersectingObject(Projo.class) != null)) {
                   
                          
                          World world = getWorld();                           
                                   
                                 getWorld().addObject(new Goku(), getX(), getY());   
                                world.removeObject(this);             
                     }
   }
   
   
             
   
  } 
  
    
    
    
   
    