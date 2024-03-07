package reto_4_4_loteria;

import java.util.Random;
import java.util.Scanner;

public class pruebaLoteria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int CANTIDAD_NUMEROS = 6; // Números en una apuesta de lotería primitiva
		int[] ganadora = new int[CANTIDAD_NUMEROS]; // combinación ganadora
		int[] miPrimitiva = new int[CANTIDAD_NUMEROS]; // apuesta del usuario

		// inicializarArrayUsuario(miPrimitiva);
		inicializarArrayAleatorio(ganadora);
		inicializarArrayUsuario(miPrimitiva);
		
		System.out.println("aciertos con : "+ comprobarAciertos(ganadora, miPrimitiva));

	}

	static void inicializarArrayUsuario(int[] vector) {

		// Código del método
		Scanner sc = new Scanner(System.in);
		int numero;

		for (int i = 0; i < vector.length; i++) {
			boolean fin = true;
			do {
				System.out.println("Introduce tu numero en la posicion " + (i + 1) + " de " + vector.length);
				numero = sc.nextInt();

				if (esNumeroValido(vector, numero, i)) {
					vector[i] = numero;
					fin = false;
				} else {
					if (numero < 1 || numero > 50) {
						System.out.println(
								"El numero : " + numero + " esta fuera de rango para poder jugar la Primitiva");
						System.out.println("Tu numero tiene que estar entre el 1 y el 50");
					} else {

						System.out.println("El numero : " + numero
								+ " esta repetido en una de tus posiciones poder jugar la Primitiva");
					}
					System.out.println("Vuelve a introducir tu numero ");

				}
			} while (fin);
		}
		System.out.print("Tu boleto es el ---> ");
		for (int i = 0; i < vector.length; i++) {
			System.out.print(vector[i] + " ");
		}

	}

	static void inicializarArrayAleatorio(int[] vector) {
		Random rnd = new Random();
		int numero;

		for (int i = 0; i < vector.length; i++) {

			boolean fin = true;
			do {

				numero = rnd.nextInt(49)+1;

				if (esNumeroValido(vector, numero, i)) {
					vector[i] = numero;
					fin = false;
				}

			} while (fin);

		}

		System.out.print("El boleto ganador es el ---> ");

		for (int i = 0; i < vector.length; i++) {
			System.out.print(vector[i] + " ");
		}
		// Código del método

	}
	
	static int comprobarAciertos(int[] vector1, int[] vector2) {
		int aciertos=0;
		
		for (int i = 0; i < vector2.length; i++) {
			
			for (int j = 0; j < vector2.length; j++) {
				
				if(vector1[i]==vector2[j]) {
					
					aciertos++;
				}
				
			}
			
		}

		return aciertos;
		// Código del método
	}

	public static boolean esNumeroValido(int[] array, int numero, int indice) {
		if (numero < 1 || numero > 50) {
			
			System.out.println();
			return false;
		}

		for (int i = 0; i < indice; i++) {
			if (array[i] == numero) {
				return false;
			}
		}

		return true;
	}

}
