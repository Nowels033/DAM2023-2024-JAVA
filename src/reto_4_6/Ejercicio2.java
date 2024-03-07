package reto_4_6;

import java.util.Random;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		2. Realizar un programa que genere 20 números enteros aleatorios entre 100 y 199 y los almacene en un array, 
//		no deberá haber números repetidos.
//		El programa debe crear un nuevo array con los números primos que haya entre esos 20 números. 
//		Luego debe mostrar los dos arrays.

		aleatoriosPrimos();

	}

	static void aleatoriosPrimos() {
		final int TAMAÑO = 20;
		int[] aleatorios = new int[TAMAÑO];
		int[] primos = new int[TAMAÑO];

		int numero;

		Random rnd = new Random();

		// SE RELLENA LA ARRAY CON NUMEROS ALEATORIOS EN EL RANGO PEDIDO Y SIN REPETIDOS
		for (int i = 0; i < primos.length; i++) {
			boolean fin = true;

			do {

				numero = rnd.nextInt(200) + 1;

				if (esNumeroValido(aleatorios, numero, i)) {

					aleatorios[i] = numero;
					fin = false;

				}

			} while (fin);

		}
		System.out.println("ARRAY DE ALEATORIOS GENERADA:");
		// MOSTRAMOS EL CONTENIDO DE LA ARRAY
		for (int i = 0; i < aleatorios.length; i++) {

			System.out.print(aleatorios[i] + " ");
		}

		// ORDENAMOS LOS ENTEROS DE LA ARRAY DE MENOR A MAYOR
		int cambio;
		for (int i = 0; i < aleatorios.length; i++) {

			for (int j = 0; j < aleatorios.length; j++) {

				if (aleatorios[i] < aleatorios[j]) {
					cambio = aleatorios[i];
					aleatorios[i] = aleatorios[j];
					aleatorios[j] = cambio;
				}

			}

		}
		// VOLVEMOS A IMPRIMIR LA ARRAY PARA VER LOS RESULTADOS
		System.out.println();
		System.out.println("ARRAY DE ALEATORIOS DE MENOR A MAYOR:");

		for (int i = 0; i < aleatorios.length; i++) {

			System.out.print(aleatorios[i] + " ");
		}
		System.out.println();

		// RELLENAMOS LA ARRAY CON NUMEROS PRIMOS ENTRE LA POSICION 0 Y LA 19 DE LA
		// ARRAY ALEATORIOS.

		int numeroP;
		int numeroInicio = aleatorios[0];
		int numeroFinal = aleatorios[19];
		boolean fin = true;
		int primo =0;
		for (int i = 0; i < primos.length; i++,primo++) {
		
					if (esPrimo(aleatorios[i])) {

						primos[primo] = aleatorios[i];
						
					 
			}
//					else {
//						i=i-1;
//					}
					
					else {
						primo--;
					}
//					else if (!esPrimo(aleatorios[i])) {
//
//						b--;
//					 
//			}

		}
		System.out.println();
		System.out.println();
		System.out.println("ARRAY DE PRIMOS EN EL RANGO DE LA ARRAY DE ALEATORIOS");
		for (int i = 0; i < primos.length && primos[i]!=0; i++) {
			
//			if(primos[i]>0) {

			System.out.print("|" + primos[i]);
			
//			}

		}

	}

	// CREAMOS EL METDODO PARA VERIFICAR SI EL NUMERO ESTA EN EL ARRAY Y DENTRO DEL
	// RANGO QUE QUERAMOS
	public static boolean esNumeroValido(int[] array, int numero, int indice) {
		if (numero < 100 || numero > 199) {
			return false;
		}

		for (int i = 0; i < indice; i++) {
			if (array[i] == numero) {
				return false;
			}
		}

		return true;
	}

	public static boolean esPrimo(int numero) {
		// Los números menores o iguales a 1 no son primos
		if (numero <= 1) {
			return false;
		}

		// Verificar si el número es divisible por algún número desde 2 hasta la raíz
		// cuadrada de dicho número
		for (int i = 2; i <= Math.sqrt(numero); i++) {
			if (numero % i == 0) {
				// El número es divisible, por lo tanto, no es primo
				return false;
			}
		}

		// Si no se encontró ningún divisor, el número es primo
		return true;
	}

}
