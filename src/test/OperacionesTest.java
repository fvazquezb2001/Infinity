package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Logic.Operaciones;
import Model.Jugador;

class OperacionesTest {

	@Test
	void testEvado() {
		Jugador pablo = new Jugador(3, 30, 7, 3, 4, 5, 12, 2);
		assertEquals(true,Operaciones.evado(pablo,20));
		
	}

}
