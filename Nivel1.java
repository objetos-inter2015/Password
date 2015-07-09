import greenfoot.*;

/**
 * Write a description of class Nivel1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nivel1 extends Niveles
{
   private Counter theCounter;
     
   
     /**
     * Constructor para objetos de clase nivel1
     * Aquí se crean todos los objetos que va tener el mundo en el primer nivel
     */
    public Nivel1()
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
      
        Plataforma p1=new Plataforma();
        addObject(p1,265,350);
        Plataforma p2=new Plataforma();
        addObject(p2,350,350);
        Plataforma p3=new Plataforma();
        addObject(p3,435,350);
         Plataforma P4=new Plataforma();
        addObject(P4,520,350);
        
        
        Plataforma P5=new Plataforma();
        addObject(P5,265,265);
        Plataforma P6=new Plataforma();
        addObject(P6,350,265);
        Plataforma P7=new Plataforma();
        addObject(P7,435,265);
        Plataforma P8=new Plataforma();
        addObject(P8,520,265);
        
        Plataforma P9=new Plataforma();
        addObject(P9,265,180);
        Plataforma p10=new Plataforma();
        addObject(p10,350,180);
        Plataforma p11=new Plataforma();
        addObject(p11,435,180);
        Plataforma p12=new Plataforma();
        addObject(p12,520,180);
        
        Plataforma p13=new Plataforma();
        addObject(p13,265,95);
        
        Plataforma p14=new Plataforma();
        addObject(p14,350,95);
        Plataforma p15=new Plataforma();
        addObject(p15,435,95);
        Plataforma p16=new Plataforma();
        addObject(p16,520,95);

       PlataformaEnemigo pk1=new PlataformaEnemigo();
        addObject(pk1,105,275);
        
        theCounter = new Counter();
        addObject(theCounter, 300, 40);
       
        Goku g1=new Goku();
        addObject(g1,260,352);
      
     
       
  
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

     
     