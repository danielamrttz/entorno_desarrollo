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

}
