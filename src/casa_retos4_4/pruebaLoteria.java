package casa_retos4_4;

import java.util.Scanner;

public class pruebaLoteria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int CANTIDAD_NUMEROS = 6; // Números en una apuesta de lotería primitiva
		int[] ganadora = new int[CANTIDAD_NUMEROS]; // combinación ganadora
		int[] miPrimitiva = new int[CANTIDAD_NUMEROS]; // apuesta del usuario

		inicializarArrayUsuario(miPrimitiva);

		for (int i = 0; i < miPrimitiva.length; i++) {
			System.out.print(miPrimitiva[i] + " ");
		}

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

	}

	public static boolean esNumeroValido(int[] array, int numero, int indice) {
		if (numero < 1 || numero > 50) {
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
