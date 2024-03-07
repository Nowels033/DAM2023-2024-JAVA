package casa_retos4_6;

import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
//5. Realizar el juego "Tres en raya". Deberá admitir las coordenadas de cada jugada
//de cada jugador y avisar en el momento en el que alguno de los 2 jugadores gane.
//En cada iteración el programa deberá marcar el estado del tablero

		tresEnRaya();

	}

	static void tresEnRaya() {
		
		Scanner sc = new Scanner(System.in);

		final int SIZE = 4;
		String jugador1="";
		String jugador2="";
		
		String[][] tablero = new String[SIZE][SIZE];
		
		
		System.out.println("¡¡BIENVENIDOS A LAS TRES EN RAYA!!");
		System.out.println();

		jugador1=inicioJugador1(jugador1).toUpperCase();
		jugador2=inicioJugador2(jugador2).toUpperCase();
		tablero=rellenarTablero(tablero);
		mostrarTablero(tablero);
		
		

	}
	
	static String inicioJugador1(String jugador1) {
	Scanner sc = new Scanner(System.in);
	
		
		System.out.println("Introduce el nombre del jugador que jugara con la : X");
		jugador1=sc.nextLine();
		
		return jugador1;
		
			
	}
	static String inicioJugador2(String jugador2) {
		Scanner sc = new Scanner(System.in);
		
			System.out.println("Introduce el nombre del jugador que jugara con la : O");
			jugador2=sc.nextLine();
			
			return jugador2;
				
		}

	static String [][] rellenarTablero(String[][] tablero) {

		for (int i = 0; i < tablero.length; i++) {

			for (int j = 0; j < tablero.length; j++) {

				tablero[i][j] = "[   ]";
				tablero[i][3] = "[ " + (i + 1) + " ]";
				tablero[3][j] = "[ " + (j + 1) + " ]";
			}

		}
		//tablero[3][0] ="[   ]";
		tablero[3][3] ="";
		
		return tablero;
		
	}

	static void mostrarTablero(String[][] tablero) {

		for (int i = 0; i < tablero.length; i++) {

			for (int j = 0; j < tablero.length; j++) {

				System.out.print(tablero[i][j]);

			}
			System.out.println();
		}
	}
	
}
