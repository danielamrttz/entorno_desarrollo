package Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import modelo.Algoritmos;

class testAlgoritmo {

	@Test
	void testSumatorio() {
		int numeroEsperado=6;
		int numerObtenido=Algoritmos.sumatorio(3);
		assertEquals(numeroEsperado, numerObtenido);
	}
	
	@Test
	void testFactorial() {
		int numeroEsperado=24;
		int numerObtenido= Algoritmos.factorial(4);
		assertEquals(numeroEsperado, numerObtenido);
	}

	@Test
	void sumatorioParamIncorrecto() {
		
		Exception excepcion = assertThrows (IllegalArgumentException.class, () -> Algoritmos.sumatorio(-1));
		
		String esperado = "El número debe ser igual o superior a 0";
		String obtenido = excepcion.getMessage();
		assertEquals (esperado, obtenido);
		
	}

}
