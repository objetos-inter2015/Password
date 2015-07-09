import greenfoot.*;

/**
 * Escribe una descrición de la clase Nivel2 aquí.
 * 
 * @autor (tu nombre) 
 * @versión (Un número de versión o una fecha)
 */
    public class Nivel2 extends Niveles
{
     private Counter theCounter;
     private Plataforma2 p4;
   
    /**
     * Constructor para objetos de clase nivel2
     * Aquí se crean todos los objetos que va tener el mundo en el segundo nivel
     */
    public Nivel2(int band)
    {    
      
         Status Estado=new  Status();
       addObject(Estado,50,80);
        Vertical v1=new Vertical();
        addObject(v1,220,222);
         Vertical v2=new Vertical();
        addObject(v2,567,222);
        Horizontal h1=new Horizontal();
        addObject(h1,390,49);
         Horizontal h2=new Horizontal();
        addObject(h2,392,395);
      
        Plataforma2 p1=new Plataforma2();
        addObject(p1,265,350);
        Plataforma2 p2=new Plataforma2();
        addObject(p2,350,350);
        Plataforma2 p3=new Plataforma2();
        addObject(p3,435,350);
         Plataforma2 P4=new Plataforma2();
        addObject(P4,520,350);
        
        
        Plataforma2 P5=new Plataforma2();
        addObject(P5,265,265);
        Plataforma2 P6=new Plataforma2();
        addObject(P6,350,265);
        Plataforma2 P7=new Plataforma2();
        addObject(P7,435,265);
        Plataforma2 P8=new Plataforma2();
        addObject(P8,520,265);
        
        Plataforma2 P9=new Plataforma2();
        addObject(P9,265,180);
        Plataforma2 p10=new Plataforma2();
        addObject(p10,350,180);
        Plataforma2 p11=new Plataforma2();
        addObject(p11,435,180);
        Plataforma2 p12=new Plataforma2();
        addObject(p12,520,180);
        
        Plataforma2 p13=new Plataforma2();
        addObject(p13,265,95);
        
        Plataforma2 p14=new Plataforma2();
        addObject(p14,350,95);
        Plataforma2 p15=new Plataforma2();
        addObject(p15,435,95);
        Plataforma2 p16=new Plataforma2();
        addObject(p16,520,95);

       PlataformaEnemigo2 pk1=new PlataformaEnemigo2();
        addObject(pk1,105,275);
        
        theCounter = new Counter();
        addObject(theCounter, 300, 40);
        
       
        Goku g2=new Goku();
        addObject(g2,265,95);
      
    
       
  
    }
    
    /**
     * será utilizado para accesar a la clase Counter y poder modificarla 
     * 
     */
    public Counter getCounter()
    {
        return theCounter;
    }   
} 

     
     