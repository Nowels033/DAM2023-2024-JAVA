package reto4_1;

import java.util.Scanner;

public class ejercicio2V2 {
//	Ejercicio 2:
//
//		Escribir un programa que lea un
//		entero por teclado y diga si se encuentra en el array números indicando las posiciones en las que se encuentra.
	
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);

		int[] numeros = { 12, 15, 13, 10, 8, 9, 13, 14 }; // DECLARO ARRAY CON LOS NUMEROS
		int numeroBuscado;

		System.out.println("Ingresa un número para buscar");
		numeroBuscado = leer.nextInt();
		estaPresente(numeros, numeroBuscado);


	}

	public static void estaPresente(int[] numeros, int numeroBuscado) {
		
		for (int i = 0; i < numeros.length; i++) {
			
			if (numeros[i] == numeroBuscado) {
				System.out.println("El número " + numeroBuscado + " está presente en el array esta en la posicon : "+i);
				
				
			}
			if (numeros[i] != numeroBuscado) {
				System.out.println("El número " + numeroBuscado + " no está presente en el array en la poscion : " +i);
			}
		}

	}

}
