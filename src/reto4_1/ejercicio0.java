package reto4_1;

import java.util.Scanner;

public class ejercicio0 {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente

		int enteros[] = new int[6];

		Scanner sc = new Scanner(System.in);

//		Escribir un programa que lea 6 enteros por teclado y los almacene en un array. Visualizar su contenido.
//

//
//		Idem con 6 caracteres

		for (int i = 0; i < enteros.length; i++) {

			System.out.println("Introduce un numero entero en la posicion " + i);

			enteros[i] = sc.nextInt();
		}

		for (int i = 0; i < enteros.length; i++) {

			System.out.println("El numero entero en la posicion " + i + " es " + enteros[i]);

		}

//		Idem con 6 cadenas de caracteres.

		String cadena[] = new String[6];
		sc.nextLine();
		for (int i = 0; i < cadena.length; i++) {

			System.out.println("Introduce una cadena de caracteres en la posicion " + i);
			
			cadena[i] = sc.nextLine();

		}

		for (int i = 0; i < cadena.length; i++) {

			System.out.println("La cadena de caracteres la posicion " + i + " es " + cadena[i]);

		}
		
		char caracter [] = new char [6];
		
		for (int i = 0; i < caracter.length; i++) {

			System.out.println("Introduce un caracter en la posicion " + i);
			
			caracter[i] = sc.nextLine().charAt(0);

		}
		
		for (int i = 0; i < caracter.length; i++) {

			System.out.println("El caracter en la posicion " + i + " es " + caracter[i]);
			

		}
		
		sc.close();

	}

}
