package reto4_3;

import java.util.Scanner;

public class Ejercicio1V2 {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente

//		1. Escribir un programa que pida al usuario un número n y dibuje un cuadrado de n elementos de lado utilizando 
//		'*' mediante matrices bidimensionales
//
//		Por ejemplo para n=4, se visualiza:
//
//		 
//
//		****
//
//		****
//
//		****
//
//		****
//
//		Escribir una segunda versión donde el cuadrado esté hueco
//
		
		cuadradoV2();

	}

	static void cuadrado() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un numero para hacer el cuadrado");
		int numero = sc.nextInt();

		char[][] cuadrado = new char[numero][numero];

		for (int i = 0; i < cuadrado.length; i++) {

			for (int j = 0; j < cuadrado.length; j++) {
				cuadrado[i][j] = '*';
			}
		}

		for (int i = 0; i < cuadrado.length; i++) {

			for (int j = 0; j < cuadrado.length; j++) {

				System.out.print(cuadrado[i][j] + " ");

			}

			System.out.println();

		}

	}

	static void cuadradoV2() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un numero para hacer el cuadrado");
		int numero = sc.nextInt();

		char[][] cuadrado = new char[numero][numero];

		for (int i = 0; i < cuadrado.length; i++) {

			for (int j = 0; j < cuadrado.length; j++) {
				
				if (i == 0 || i ==  cuadrado.length - 1 || j == 0 || j ==  cuadrado.length - 1) {

					cuadrado[i][j]='*';
				} else {
					cuadrado[i][j]=' ';
				}
			}
		}

		for (int i = 0; i <  cuadrado.length; i++) {

			for (int j = 0; j <  cuadrado.length; j++) {

					System.out.print(cuadrado[i][j]+" ");
				
			}

			System.out.println();

		}

	}

}
