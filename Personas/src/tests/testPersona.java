package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import models.Persona;

class testPersona {
	@Test
	void constructorParamIncorrecto() {
		
		Exception excepcion = assertThrows (IllegalArgumentException.class, () -> new Persona (" "," ", -1));
		
		String esperado = "La edad debe estar entre 0 y 130";
		String obtenido = excepcion.getMessage();
		assertEquals (esperado, obtenido);
		
	}
	
	
	@Test
	void constructorParamIncorrecto1() {
		
		Exception excepcion = assertThrows (IllegalArgumentException.class, () -> new Persona (" "," ", 131));
		
		String esperado = "La edad debe estar entre 0 y 130";
		String obtenido = excepcion.getMessage();
		assertEquals (esperado, obtenido);
		
	}
	
	@Test
	 void metodoNumero0() {
		Persona persona = new Persona ("Daniela", "Martinez", 0);
		String esperado="Menor de edad";
		String obtenido= persona.mostrarEdad();
		assertEquals(esperado, obtenido);
	}
	
	@Test
	 void metodoNumero17() {
		Persona persona = new Persona ("Daniela", "Martinez", 17);
		String esperado="Menor de edad";
		String obtenido= persona.mostrarEdad();
		assertEquals(esperado, obtenido);
	}
	
	@Test
	 void metodoNumero18() {
		Persona persona = new Persona ("Daniela", "Martinez", 18);
		String esperado="Mayor de edad";
		String obtenido= persona.mostrarEdad();
		assertEquals(esperado, obtenido);
	}
	
	@Test
	 void metodoNumero65() {
		Persona persona = new Persona ("Daniela", "Martinez", 65);
		String esperado="Mayor de edad";
		String obtenido= persona.mostrarEdad();
		assertEquals(esperado, obtenido);
	}
	
	@Test
	 void metodoNumero66() {
		Persona persona = new Persona ("Daniela", "Martinez", 66);
		String esperado="Jubilado";
		String obtenido= persona.mostrarEdad();
		assertEquals(esperado, obtenido);
	}
	
	@Test
	 void metodoNumero130() {
		Persona persona = new Persona ("Daniela", "Martinez", 130);
		String esperado="Jubilado";
		String obtenido= persona.mostrarEdad();
		assertEquals(esperado, obtenido);
	}
	
}
