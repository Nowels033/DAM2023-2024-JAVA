package reto_4_2;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
//		4. Obtener la letra de un DNI, se pedirá el DNI por teclado y se nos devolverá el DNI completo.
//
//		Para el cálculo de la letra, se cogerá el resto de dividir el DNI entre 23,
//		el resultado debe estar entre 0 y 22. Realizar un método donde reciba el resultado de la anterior fórmula
//		y busque en un array de caracteres la posición que corresponde a la letra. Tabla de caracteres:

		ejercicio4();

	}

	static void ejercicio4() {
		Scanner sc = new Scanner(System.in);
		
		boolean fin=true;
		int dni;

		char[] letras = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H',
				'L', 'C', 'K', 'E' };

		System.out.println("Introduce un numero de un DNI para calcular su letra");
		dni = sc.nextInt();
		
		System.out.println(dni);
		
		String cadena = String.format("%08d" , dni);
		
	System.out.println(cadena);

		do {

			if (cadena.length()==8) {

				int division = dni % 23;

				System.out.println("TU DNI COMPLETO ES : " + cadena + "-" + letras[division]);
				fin=false;
			}

			else {
				System.out.println("ERROR EN EL NUMERO DEL DNI : ["+dni+"] TIENE MAS DE 8 CIFRAS");
				fin=false;
			}

		} while (fin);

		sc.close();
	}

}
