package controller;

import Logic.Operaciones;
import Model.Jugador;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jugador pablo = new Jugador(3,4,5,6,6,4,1,2);
		System.out.println(Operaciones.tirarDado20());
		System.out.println(Operaciones.evado(pablo,18));
		System.out.println(pablo.toString());
	
	
	
	}

}
