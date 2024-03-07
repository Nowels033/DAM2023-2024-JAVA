package reto4_1;

import java.util.Scanner;

public class ejercicio1version2 {
	
//	Los ejercicios siguientes utilizan el array de enteros :
//
//		int[] numeros = {12, 15, 13, 10, 8, 9, 13, 14};
//
//		 
//
//		Ejercicio 1:
//
//		Versión 1: Escribir un programa que lea un entero por teclado y diga si se encuentra en el array números.
//
//		Versión 2: Escribir un método estaPresente() al que se le pase como argumento el array números y un entero y devuelva si el entero se encuentra en el array.
//
//		Opcional: parar la búsqueda en cuanto se ha encontrado el número.

	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int[] numeros = {12, 15, 13, 10, 8, 9, 13, 14};
		
		System.out.println("introduce un numero para ver si esta en la matriz");
		int numero = sc.nextInt();
		
		System.out.println(estaPresente(numeros, numero));
		
	}
	
	public static boolean estaPresente(int [] matriz,int numero) {
	 
		for (int i = 0; i < matriz.length; i++) {
			
			if (matriz[i]==numero) {
				
				return true;
				
			}
			
		}
		
		return false;
	}
}
