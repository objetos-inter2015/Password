import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

/**
 * Write a description of class Counter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Counter  extends Actor
{
    public int totalCount = 0;
/**
     * constructor 
     * crea la imagen de la clase
     */
    public Counter()
    {
        setImage(new GreenfootImage("0", 20, Color.WHITE, Color.BLACK));
    }

    /**
     * Incrementa los puntos que se tienen
     */
    public void bumpCount(int cont)
    {
        totalCount += cont;
        setImage(new GreenfootImage("Tu puntaje en esta ronda es: " + "" + totalCount, 20, Color.WHITE, Color.BLACK));
        if(totalCount<0)
            Greenfoot.setWorld(new Nivel1()); 
    }
    
    
}
