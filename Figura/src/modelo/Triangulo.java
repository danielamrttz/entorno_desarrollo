package modelo;
import java.util.*;

/**
 * 
 */
public class Triangulo {


    private int base;
    private int altura;

 
    public Triangulo() {
        
    }


    public Triangulo(int base, int altura) {
    	this.base=base;
    	this.altura=altura;
        // TODO implement here
    }

 
    public void setBase(int base) {
        this.base=base;
    }

  
    public int getBase() {
        
        return this.base;
    }

  
    public void setAltura(int altura) {
        this.altura=altura;
    }

 
    public int getAltura() {
        
        return this.altura;
    }

    /**
     * devuelve el area del triangulo (base*altura )/2
     * @return
     */
    public double calcularArea() {
     
        return (this.base*this.altura)/2;
    }

}