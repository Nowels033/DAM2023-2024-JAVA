package reto_4_2;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
//		1. Construir un array de caracteres que contenga las letras de la ‘A’ a la ‘Z’
//		(solo las mayúsculas sin tener en cuenta las letras 'Ñ', 'LL'...).
//		Posteriormente se pedirán posiciones del array por teclado y, si la posición es correcta, 
//		se añadirá el carácter correspondiente a una cadena que se imprimirá al final, 
//		se dejará de insertar cuando se introduzca un número negativo.
//
//		Por ejemplo, si se introducen los siguientes números:
//		0 // Se añade la ‘A’
//		6 // Se añade la ‘G’
//		25 // Se añade la ‘Z’
//		50 // Insertar números entre 0 y 25
//		-3 // Fin
		
		char [] abc = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		
		
		ejercicio1(abc);
		
	}
	
	static void ejercicio1(char[] array) {
		
		Scanner sc = new Scanner(System.in);
		String cadena=" ";
		int posicion;
		//boolean fin=true;
		
		do {
			
			System.out.println("introduce una posicion de la array valida");
			posicion=sc.nextInt();
			
			if (posicion>25) {
				
				System.out.println("introducir numeros entre 0 y 25");
				
			}
			
			if (posicion<0) {
				
				System.out.println("NUMERO NEGATIVO SE TERMINO EL PROGRAMA DE JUNTAR CARACTERES");
				//fin=false;
				
			}
			
			if (posicion>=0 && posicion<=25) {
				System.out.println(array[posicion]);
				cadena+=array[posicion]+" ";
				
			}
			
			
		}while (posicion>=0);
		
		System.out.println(cadena);
	}

}
