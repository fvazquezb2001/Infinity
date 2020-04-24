package Logic;

import java.lang.Math;
import java.util.Random;
import java.util.stream.IntStream;

import Model.Jugador;

public class Operaciones {

	static public int tirarDado6() {
		Random r = new Random();
		return r.ints(1, 7).findFirst().getAsInt();
	}

	static public int tirarDado20() {
		Random r = new Random();
		return r.ints(1, 21).findFirst().getAsInt();

	}

	static public boolean evado(Jugador jugador, int enemyDex) {
		int dado20 = tirarDado20();
		int evasionJugador = dado20 + jugador.getDextreza();
		if (evasionJugador > enemyDex) {
			return true;
		} else {
			return false;
		}
	}

	static public boolean defiendo(Jugador jugador, int enemyFz) {
		int dado20 = tirarDado20();
		int defensaJugador = dado20 / 2 + jugador.getVitalidad();
		if (defensaJugador > enemyFz) {
			return true;
		} else {
			return false;
		}
	}

}
