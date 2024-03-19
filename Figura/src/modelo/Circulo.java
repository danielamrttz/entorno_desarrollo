package modelo;
import java.util.*;


public class Circulo {


    private int radio;

    public Circulo() {
    	
        
    }

   
    public void Circulo(int radio) {
    	this.radio=radio;
    }

   
    public void setRadio(int radio) {
        this.radio=radio;
    }

  
    public int getRadio() {
      
        return this.radio;
    }

    /**
     * Devuelve el área del circulo : pi*r^
     * 2
     * @return
     */
    public double calcularArea() {
      
        return Math.PI*(Math.pow(this.radio, 2));
    }

    /**
     * Devuelve perímetro del circulo 2*pi*r
     */
    public double calcularPerimetro() {
        return 2*Math.PI*this.radio;
    }

}