import greenfoot.*;

/**
 * Escribe una descrición de la clase Nivel3 aquí.
 * 
 * @autor (tu nombre) 
 * @versión (Un número de versión o una fecha)
 */
public class Nivel3 extends Niveles
{
 private Counter theCounter;
     /**
     * Constructor para objetos de clase nivel3
     * Aquí se crean todos los objetos que va tener el mundo en el tercer nivel
     */
    public Nivel3()
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
      
        Plataforma3 p1=new Plataforma3();
        addObject(p1,265,350);
        Plataforma3 p2=new Plataforma3();
        addObject(p2,350,350);
        Plataforma3 p3=new Plataforma3();
        addObject(p3,435,350);
         Plataforma3 P4=new Plataforma3();
        addObject(P4,520,350);
        
        
        Plataforma3 P5=new Plataforma3();
        addObject(P5,265,265);
        Plataforma3 P6=new Plataforma3();
        addObject(P6,350,265);
        Plataforma3 P7=new Plataforma3();
        addObject(P7,435,265);
        Plataforma3 P8=new Plataforma3();
        addObject(P8,520,265);
        
        Plataforma3 P9=new Plataforma3();
        addObject(P9,265,180);
        Plataforma3 p10=new Plataforma3();
        addObject(p10,350,180);
        Plataforma3 p11=new Plataforma3();
        addObject(p11,435,180);
        Plataforma3 p12=new Plataforma3();
        addObject(p12,520,180);
        
        Plataforma3 p13=new Plataforma3();
        addObject(p13,265,95);
        
        Plataforma3 p14=new Plataforma3();
        addObject(p14,350,95);
        Plataforma3 p15=new Plataforma3();
        addObject(p15,435,95);
        Plataforma3 p16=new Plataforma3();
        addObject(p16,520,95);

       PlataformaEnemigo3 pk1=new PlataformaEnemigo3();
        addObject(pk1,105,275);
        
        theCounter = new Counter();
        addObject(theCounter, 300, 40);
     
        Goku g1=new Goku();
        addObject(g1,520,95);
      
     
       
  
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

