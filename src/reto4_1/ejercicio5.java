package reto4_1;

import java.util.Scanner;

public class ejercicio5 {

//	Ejercicio 5:
//
//		Escribir un método longitudMax() al que se le pase un array de cadenas de caracteres y devuelva la cadena que tiene la 
//		longitud más larga.

	public static void main(String[] args) {

		longitudMax();
	}

	public static void longitudMax() {

		String[] cadena = new String[3];

		Scanner sc = new Scanner(System.in);
		int max=0;
		String cadenaMax="";
		for (int i = 0; i < cadena.length; i++) {

			System.out.println("Introduce una cadena de caracteres");
			 cadena[i] = sc.nextLine();
			 
			 if (cadena[i].length()>max) {
				 
				 max=cadena[i].length();
				 cadenaMax=cadena[i];
				
			}
			 
			 System.out.println("la cadena mas larga es : ("+cadenaMax+") con : "+max+" caracteres");
		}

	}
}
