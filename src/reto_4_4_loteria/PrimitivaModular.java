package reto_4_4_loteria;

/*
 * Programa que simula el juego de la lotería primitiva
 */

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class PrimitivaModular {
	public static Scanner sc = new Scanner(System.in);
	public static Random rnd = new Random();

	public static void main(String[] args) {

		// Definición de las variables
		final int CANTIDAD_NUMEROS = 6; // Números en una apuesta de lotería primitiva
		int[] ganadora = new int[CANTIDAD_NUMEROS]; // combinación ganadora
		int[] miPrimitiva = new int[CANTIDAD_NUMEROS]; // apuesta del usuario

		// Cargar/Inicializar el array ganadora sin repetidos
		inicializarArrayAleatorio(ganadora);

		// Cargar/Inicializar el array miPrimitiva sin repetidos
		inicializarArrayUsuario(miPrimitiva);

		// imprimir aciertos
		System.out.println("La combinación ganadora es  : " + Arrays.toString(ganadora));
		System.out.println("tu apuesta es : " + Arrays.toString(miPrimitiva));
		System.out.println("Has tenido " + comprobarAciertos(ganadora, miPrimitiva) + " acierto(s)");
	}

	/************************************************************************/
	/* El método va a inicializar un array con números aleatorios */
	/* Si el número generado ya está en el array , se genera otro número */
	/************************************************************************/
	static void inicializarArrayAleatorio(int[] vector) {

		// Código del método

	}

	/****************************************************************************/
	/* El método va a inicializar un array con números pedidos al usuario */
	/* Si el número generado ya está en el array o está fuera del rango 1..49 */
	/* se pide al usuario que introduzca otro número */
	/****************************************************************************/
	static void inicializarArrayUsuario(int[] vector) {

		// Código del método
		Scanner sc = new Scanner(System.in);
		int numero;
		boolean fin=true;
		for (int i = 0; i < vector.length; i++) {
			do {
			System.out.println("Introduce el numero " + (i + 1));
			numero = sc.nextInt();
			
			if (numero >= 0 && numero <= 50) {
				
				for (int j = 0; j < vector.length; j++) {
					
					if (numero!=vector[j]) {
						
						
					}
				}
				
			}
			else {
				System.out.println(numero+" No es un numero valido");
			}
			}while(fin);
		}

	}

	/*****************************************************************************/
	/* El método recibe dos arrays y comprueba cuantos números están contenidos */
	/* en los dos arrays . Devuelve el número de aciertos */
	/*****************************************************************************/
	static int comprobarAciertos(int[] vector1, int[] vector2) {

		return 1;
		// Código del método
	}

}