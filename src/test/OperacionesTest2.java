package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Logic.Operaciones;
import Model.Jugador;

class OperacionesTest2 {

	@Test
	void testDefiendo() {
		Jugador pablo = new Jugador(10, 2, 10, 30, 1, 2, 2, 1);
		assertEquals(true,Operaciones.defiendo(pablo, 1));
	}

}
