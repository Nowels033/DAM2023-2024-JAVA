package casa_retos4_6;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

		buscarTesoroV1();

	}

	private static void buscarTesoroV1() {

		final int ALTURA = 10;
		final int ANCHO = 10;
		String[][] tablero = new String[ALTURA][ANCHO];
		
		

		for (int i = 0; i <= ALTURA - 1; i++) {

			for (int j = 0; j <= ANCHO - 1; j++) {

				tablero[i][j] = "[     ]";
				if (tablero[i][j] == tablero[i][ANCHO - 1]) {
					tablero[i][ANCHO - 1] = "[  " + (i + 1) + "  ]";
				}
				if (tablero[i][j] == tablero[ALTURA - 1][j]) {
					tablero[ALTURA - 1][j] = "[  " + (j + 1) + "  ]";
				}
				tablero[ALTURA - 1][ANCHO - 1] = "[ V H ]";
			}

		}
       // PONER LA MINA
		Random rnd = new Random();
		int bombaX = rnd.nextInt(ALTURA - 2);
		int bombaY = rnd.nextInt(ANCHO - 2);

		tablero[bombaX][bombaY] = "[  B  ]";

		// PONER TESORO
		
		int tesoroX = rnd.nextInt(ALTURA - 2);
		int tesoroY = rnd.nextInt(ANCHO - 2);
		tablero[tesoroX][tesoroY] = "[  T  ]";
		
		if (bombaX==tesoroX&&bombaY==tesoroY) {
			 tesoroX = rnd.nextInt(ALTURA - 2);
			 tesoroY = rnd.nextInt(ANCHO - 2);
		}

		mostrarTablero(tablero);
		Scanner sc = new Scanner(System.in);
		int v;
		int h;
		boolean ganador = true;
		do {
			System.out.println("INTRUDUCE UNA POSICION VERTICAL :");
			v = sc.nextInt() - 1;
			System.out.println("INTRUDUCE UNA POSICION HORIZONTAL :" + "");
			h = sc.nextInt() - 1;
			if (estaCerca(v, h, bombaX, bombaY)) {
				System.out.println();
				
				tablero[v][h] = "[  X  ]";
				
				mostrarTablero(tablero);
				System.out.println("ESTAS CERCA DE LA BOMBA!!");
				System.out.println("¡¡FALLO!! Vuelve a intentarlo...");
				System.out.println();
			}
			else if (estaCerca(v, h, tesoroX, tesoroY)) {

				System.out.println();
				System.out.println("ESTAS CERCA DE EL TESORO!");
				tablero[v][h] = "[  X  ]";
				System.out.println("¡¡FALLO!! Vuelve a intentarlo...");
				mostrarTablero(tablero);
				System.out.println();
			} else if (v == tesoroX && h == tesoroY) {
				System.out.println("CONSEGUISTE EL TESORO!");
				System.out.println("FIN DEL JUEGO!!");
				System.out.println();
				ganador = false;
			} else if (v == bombaX && h == bombaY) {

				System.out.println("PISASTE LA BOMBA!!");
				System.out.println("FIN DEL JUEGO!!");
				System.out.println();
				ganador = false;
			} else {
				System.out.println();
				System.out.println("¡¡FALLO!! Vuelve a intentarlo...");
				tablero[v][h] = "[  X  ]";
				mostrarTablero(tablero);
			}
		} while (ganador);
	}

	public static void mostrarTablero(String[][] array) {

		// MOSTAR TABLERO

		System.out.println("JUEGO Nº1 DE NOWELS ENCONTRAR EL TESORO....O LA MINA!!!");
		System.out.println();

		for (int i = 0; i < array.length; i++) {

			for (int j = 0; j < array.length; j++) {

				System.out.print(array[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}

	public static boolean estaCerca(int posicionVertical, int posicionHorizontal, int secretoVertical,
			int secretoHorizontal) {

		if ((posicionVertical == secretoVertical && posicionHorizontal == secretoHorizontal - 1)
				|| (posicionHorizontal == secretoHorizontal && posicionVertical == secretoVertical - 1)
				|| (posicionHorizontal == secretoHorizontal + 1 && posicionVertical == secretoVertical)
				|| (posicionVertical == secretoVertical + 1 && posicionHorizontal == secretoHorizontal)) {
			return true;
		} else {
			return false;
		}
	}
}
