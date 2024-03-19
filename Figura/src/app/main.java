package app;

import modelo.Rectangulo;

public class main {

	public static void main(String[] args) {
		
		Rectangulo mirectangulo = new Rectangulo (20,10);
		
		System.out.println(mirectangulo.calcularArea());
		System.out.println(mirectangulo.calcularPerimetro());

	}

}
