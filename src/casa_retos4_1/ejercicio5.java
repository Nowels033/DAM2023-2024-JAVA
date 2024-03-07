package casa_retos4_1;

import java.util.Iterator;
import java.util.Scanner;

public class ejercicio5 {

	public static void main(String[] args) {
//		
//		Ejercicio 5:
//
//			Escribir un método longitudMax() al que se le pase un array de cadenas de caracteres
//			y devuelva la cadena que tiene la longitud más larga.

		String[] cadena = new String[4];
		String[] cadena2 = { "a", "aa", "aaa", "aaaa" };

		longitudMax(cadena);
		longitudMax2(cadena2);
//		
//		
	}

	static void longitudMax(String[] array) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < array.length; i++) {

			System.out.println("introduce una cadena en la posicion " + i + " del array");
			array[i] = sc.nextLine();

		}
		int longitud = 0;
		String cadena = " ";
		for (int i = 0; i < array.length; i++) {

			if (array[i].length() > longitud) {

				longitud = array[i].length();
				cadena = array[i];

			}

		}
		System.out.println("La cadena " + "( " + cadena + " )" + " es la que tiene la maxima longitud de : " + longitud
				+ " caracteres");
	}

	static void longitudMax2(String[] array) {

		int longitud = 0;
		String cadena = " ";
		for (int i = 0; i < array.length; i++) {

			if (array[i].length() > longitud) {

				longitud = array[i].length();
				cadena = array[i];

			}

		}
		System.out.println("La cadena " + "( " + cadena + " )" + " es la que tiene la maxima longitud de : " + longitud
				+ " caracteres");

	}

}
