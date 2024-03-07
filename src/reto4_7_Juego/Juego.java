package reto4_7_Juego;

import java.util.Random;
import java.util.Scanner;

public class Juego {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		final int INTENTOS = 11;
		int dificultad = 0;
		do {
			System.out.println("Introduce con cuantos numeros quieres jugar : 4 numeros, 6 numeros o 8 numeros");
			dificultad = sc.nextInt();
		} while (dificultad != 4 && dificultad != 6 && dificultad != 8);

		dificultad = dificultad;

		int[][] juego = new int[INTENTOS][dificultad];

		Random rnd = new Random();
		int delreves = INTENTOS - 1;

		for (int i = 0; i < juego.length; i++) {

			for (int j = 0; j < juego[j].length; j++) {

				int aleatorio1 = rnd.nextInt(8) + 1;

				juego[0][j] = aleatorio1;
			}

		}

		mostarJuego(juego);
		int [] resultado= {0,0};

		for (int i = 0; i < juego.length - 1 && resultado[0]!=4; i++, delreves--) {

			System.out.println("Intento " + (i + 1));
			for (int j = 0; j < juego[i].length; j++) {

				System.out.println("Introduce el numero : " + (j + 1));

				juego[delreves][j] = sc.nextInt();

			}

			mostarJuego(juego);
			resultado=comprobarNumeros(juego[0], juego[delreves], dificultad);
			
			

		}

	}

	public static void mostarJuego(int[][] array) {

		for (int i = 0; i < array.length; i++) {

			for (int j = 0; j < array[j].length; j++) {

				if (array[i][j] == 0) {

					System.out.print(" [   ] ");
				}

				else {
					System.out.print(" [ " + array[i][j] + " ] ");
				}
			}

			System.out.println();
		}

	}

	public static int[] comprobarNumeros(int[] ganadora, int[] numero, int dificultad) {

		int contador = 0;
		int[] aciertos = new int[2];

		for (int i = 0; i < ganadora.length; i++) {

			if (ganadora[i] == numero[i]) {

				aciertos[0]++;
				contador++;
			}

			else {
				for (int j = 0; j < ganadora.length; j++) {

					if (ganadora[j] == numero[i]) {

						aciertos[1]++;

					}

				}

			}

		}

		if (contador == dificultad) {
			System.out.println("  ACABAS DE GANAR EL JUEGO");
			
		} else {
			System.out.println("TIENES " + aciertos[0] + " EN LA POSICION CORRECTA Y " + aciertos[1] + " CORRECTOS "
					+ "PERO NO EN LA POSICION CORRECTA");
		}

		return aciertos;

	}

}
