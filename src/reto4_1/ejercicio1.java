package reto4_1;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		
//		Los ejercicios siguientes utilizan el array de enteros :
//
//			int[] numeros = {12, 15, 13, 10, 8, 9, 13, 14};
//
//			 
//
//			Ejercicio 1:
//
//			Versión 1: Escribir un programa que lea un entero por teclado y diga si se encuentra en el array números.
		
		
		int[] numeros = {12, 15, 13, 10, 8, 9, 13, 14};
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("introduce un numero para ver si esta en la array");
		int numero = sc.nextInt();
		boolean noEncontrado = false;
		
		for(int i =0;i<numeros.length;i++) {
		
		if (numero==numeros[i]) {
			
			System.out.println("El numero "+numero+" se encuentra en la posicion "+(i+1));
			noEncontrado=true;
		}
		
		}
		
		if (!noEncontrado) {
			
			System.out.println("El numero no "+numero+" no esta dentro de la array");
			
		}
		
		
		

	}

}
