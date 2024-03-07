package casa_retos4_2;

import java.util.Scanner;

public class Ejercicio3 {

//	3. Realizar un programa que pida al usuario una frase
//	y pase sus caracteres a un array de caracteres. Se podrá realizar con o sin métodos de String.

	public static void main(String[] args) {

		ejercicio3();

	}

	static void ejercicio3() {
		Scanner sc = new Scanner(System.in);

		String cadena;

		System.out.println("Introduce una palabra o frase para pasarlo a una array");
		cadena = sc.nextLine();

		char[] array = new char[cadena.length()];

		for (int i = 0; i < array.length; i++) {

			array[i] = cadena.charAt(i);

		}

		for (int i = 0; i < array.length; i++) {

			System.out.println("Posicion " + i + " de la array con caracter : " + array[i]);

		}
		sc.close();
	}

}
