package reto_4_6;

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
		String jugador1 = "";
		String jugador2 = "";
		boolean finDeJuego = true;

		String[][] tablero = new String[SIZE][SIZE];

		jugador1 = inicioJugador1(jugador1).toUpperCase();
		jugador2 = inicioJugador2(jugador2).toUpperCase();
		tablero = rellenarTablero(tablero);
		mostrarTablero(tablero);

		do {

			tablero = jugador1PonerX(tablero, jugador1);
			mostrarTablero(tablero);

			finDeJuego = ganar(jugador1, tablero, "[ X ]");

			if (!finDeJuego) {

				tablero = jugador2PonerO(tablero, jugador2);
				mostrarTablero(tablero);

				finDeJuego = ganar(jugador2, tablero, "[ O ]");

			}

		} while (!finDeJuego);

	}

//	static void ganador(String[][] tablero,String jugadorX,String jugadorO) {
//
//		for (int i = 0; i < tablero.length - 1; i++) {
//
//			for (int j = 0; j < tablero.length - 1; j++) {
//
//				if ((tablero[1][1].equalsIgnoreCase("[ O ]") && tablero[1][2].equalsIgnoreCase("[ O ]")
//						&& tablero[1][3].equalsIgnoreCase("[ O ]"))
//						|| (tablero[2][1].equalsIgnoreCase("[ O ]") && tablero[2][2].equalsIgnoreCase("[ O ]")
//								&& tablero[2][3].equalsIgnoreCase("[ O ]"))
//						|| (tablero[2][1].equalsIgnoreCase("[ O ]") && tablero[2][2].equalsIgnoreCase("[ O ]")
//								&& tablero[2][3].equalsIgnoreCase("[ O ]"))
//						|| (tablero[3][1].equalsIgnoreCase("[ O ]") && tablero[3][2].equalsIgnoreCase("[ O ]")
//								&& tablero[3][3].equalsIgnoreCase("[ O ]"))
//						|| (tablero[1][1].equalsIgnoreCase("[ O ]") && tablero[2][1].equalsIgnoreCase("[ O ]")
//								&& tablero[3][1].equalsIgnoreCase("[ O ]"))
//						|| (tablero[1][2].equalsIgnoreCase("[ O ]") && tablero[2][2].equalsIgnoreCase("[ O ]")
//								&& tablero[3][3].equalsIgnoreCase("[ O ]"))
//						|| (tablero[1][3].equalsIgnoreCase("[ O ]") && tablero[2][3].equalsIgnoreCase("[ O ]")
//								&& tablero[3][3].equalsIgnoreCase("[ O ]"))
//						|| (tablero[1][1].equalsIgnoreCase("[ O ]") && tablero[2][2].equalsIgnoreCase("[ O ]")
//								&& tablero[3][3].equalsIgnoreCase("[ O ]"))
//						|| (tablero[1][3].equalsIgnoreCase("[ O ]") && tablero[2][2].equalsIgnoreCase("[ O ]")
//								&& tablero[3][1].equalsIgnoreCase("[ O ]"))
//
//				) {
//					
//					System.out.println("EL JUGADOR "+jugadorO+" ACABA DE GANAR LA PARTIDA");
//					return true;
//
//				}
//
//			}
//		}
//
//		
//	}

	static String[][] jugador1PonerX(String[][] tablero, String jugador1) {

		Scanner sc = new Scanner(System.in);
		boolean casillaUsada = true;

		do {

			System.out.println("INTRODUCE UNA POSICION VERTICAL PARA PONER X");
			int posicionX = sc.nextInt() - 1;
			System.out.println("INTRODUCE UNA POSICION HORIZONTAL  PARA PONER X");
			int posicionY = sc.nextInt() - 1;

			if (tablero[posicionX][posicionY].equalsIgnoreCase("[ O ]")) {

				System.out.println("LA CASILLA" + posicionX + " " + posicionY + " ESTA OCUPADA POR TU CONTRINCANTE");
				System.out.println("INTRODUCE OTRAS COORDENADAS");
			}

			else {

				tablero[posicionX][posicionY] = "[ X ]";
				casillaUsada = false;
			}

		} while (casillaUsada);

		return tablero;
	}

	static String[][] jugador2PonerO(String[][] tablero, String jugador1) {

		Scanner sc = new Scanner(System.in);
		boolean casillaUsada = true;

		do {

			System.out.println("INTRODUCE UNA POSICION VERTICAL PARA PONER O");
			int posicionX = sc.nextInt() - 1;
			System.out.println("INTRODUCE UNA POSICION HORIZONTAL  PARA PONER O");
			int posicionY = sc.nextInt() - 1;

			if (tablero[posicionX][posicionY].equalsIgnoreCase("[ X ]")) {

				System.out.println("LA CASILLA" + posicionX + " " + posicionY + " ESTA OCUPADA POR TU CONTRINCANTE");
				System.out.println("INTRODUCE OTRAS COORDENADAS");

			}

			else {

				tablero[posicionX][posicionY] = "[ O ]";
				casillaUsada = false;
			}

		} while (casillaUsada);

		return tablero;
	}

	static String inicioJugador1(String jugador1) {
		Scanner sc = new Scanner(System.in);

		System.out.println("¡¡BIENVENIDOS A LAS TRES EN RAYA!!");
		System.out.println();

		System.out.println("Introduce el nombre del jugador que jugara con la : X");
		jugador1 = sc.nextLine();

		return jugador1;

	}

	static String inicioJugador2(String jugador2) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce el nombre del jugador que jugara con la : O");
		jugador2 = sc.nextLine();

		return jugador2;

	}

	static String[][] rellenarTablero(String[][] tablero) {

		for (int i = 0; i < tablero.length; i++) {

			for (int j = 0; j < tablero.length; j++) {

				tablero[i][j] = "[   ]";
				tablero[i][3] = "[ " + (i + 1) + " ]";
				tablero[3][j] = "[ " + (j + 1) + " ]";
			}

		}
		// tablero[3][0] ="[ ]";
		tablero[3][3] = "";

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

	static boolean ganar(String jugador, String[][] tablero, String jugada) {

		int comprobar = 0;
		System.out.println(jugada);

		for (int i = 0; i < tablero.length; i++) {

			if (tablero[0][i].equals(jugada) && tablero[0][i + 1].equals(jugada) && tablero[0][i + 2].equals(jugada)) {

				System.out.println("EL JUGADOR QUE PONE : " + jugada + " : " + jugador + " ACABA DE GANAR LA PARTIDA");

				return true;

			}

			else if (tablero[i][0].equals(jugada) && tablero[i + 1][0].equals(jugada) && tablero[i + 2][0].equals(jugada)) {

				System.out.println("EL JUGADOR QUE PONE : " + jugada + " : " + jugador + " ACABA DE GANAR LA PARTIDA");

				return true;

			}
			
			else if (tablero[0][0].equals(jugada) && tablero[1][1].equals(jugada) && tablero[2][2].equals(jugada) ||
				tablero[0][2].equals(jugada) && tablero[1][1].equals(jugada) && tablero[2][0].equals(jugada)	) {
				
				
				System.out.println("EL JUGADOR QUE PONE : " + jugada + " : " + jugador + " ACABA DE GANAR LA PARTIDA");

				return true;
				
			}

		}

		return false;

	}

}
