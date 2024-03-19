package app;

import modelo.Rectangulo;
import modelo.Circulo;
import modelo.Triangulo;

public class main {

	public static void main(String[] args) {
		
		Rectangulo mirectangulo = new Rectangulo (20,10);
		Triangulo mitriangulo = new Triangulo (20,10);
		Circulo micirculo = new Circulo (20);
		
		System.out.println(mirectangulo.calcularArea());
		System.out.println(mirectangulo.calcularPerimetro());
		System.out.println(mitriangulo.calcularArea());
		System.out.println(micirculo.calcularPerimetro());
		System.out.println(micirculo.calcularArea());

	}

}
