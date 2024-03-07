package eedt2e1;

import java.util.Scanner;

/*
 * Programa para la comprobación de números capicuos
 * enteros de más de una cifra.
 * 
 */
public class ejercicio2 {

	public static void main(String[] args) {
		int N, aux, inverso=0, cifra;
		// Obtención del número por teclado
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("Introduce un número >= 10:");
			N = sc.nextInt();
		} while (N < 10);
		// Obtención del número invertido
		aux = N;
		while (aux != 0) {
			cifra = aux % 10;
			inverso = inverso * 10 + aux;
			aux = aux / 10;
		}
		// Comprobación capicua
		if (N == inverso) {
			System.out.println("Es capicúa");
		} else {
			System.out.println("No es capicúa");
		}
		sc.close();
	}

}
