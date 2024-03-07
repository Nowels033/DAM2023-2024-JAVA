package reto4_3;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

//	2. Realizar un programa que pida 20 números enteros. Estos números se deben introducir en un array de 4 filas 
//	por 5 columnas. El programa mostrará las sumas parciales de filas y columnas igual que si de una hoja de cálculo se tratara.
//	La suma total debe aparecer en la esquina inferior derecha.

		tabla20Numeros();

	}

	static void tabla20Numeros() {
		Scanner sc = new Scanner(System.in);
		int[][] numeros = new int[5][6];

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("Introduce el numero de la posicion: [" + (i + 1) + "]" + "[" + (j + 1) + "] : ");
				numeros[i][j] = sc.nextInt();
				
				numeros[i][5] += numeros[i][j];
				numeros[4][j] += numeros[i][j];
				
			}
		}

		for (int i = 0; i < 4; i++) {

			for (int j = 0; j < 5; j++) {
				System.out.print(numeros[i][j] + "\t");
			
			}
			System.out.print(numeros[i][5]);
			System.out.println();
		}
		for (int i = 0; i < 5; i++) {
				System.out.print(numeros[4][i] + "\t");
				numeros[4][5] += numeros[4][i];
			
		}
		System.out.print(numeros[4][5]);
		// System.out.print(total);
	}

}
