package reto_4_7_arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1 {
//1. Realizar un programa Java que lea una serie de valores numéricos enteros desde el teclado
//	y los guarde en un ArrayList de tipo Integer. La lectura de números enteros termina cuando se introduzca el valor 0. 
//	Este valor no se guarda en el ArrayList. A continuación el programa mostrará por pantalla el número de valores que se han leído,
//	el mayor, el menor, su suma y su media.
//	Se mostrarán todos los valores leídos, indicando cuántos de ellos son mayores que la media.
	public static void main(String[] args) {

		ArrayList<Integer> numeroEnteros = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int numero = 1;
		int suma = 0;
		int menor = 999999999;
		int mayor = 0;
		do {
			System.out.println("Introduce un numero ");
			numero = sc.nextInt();
			if (numero > 0) {

				numeroEnteros.add(numero);
				suma += numero;
			}

		} while (numero != 0);

		System.out.println("Numeros Introducidos : ");
		for (int i = 0; i < numeroEnteros.size(); i++) {

			System.out.print(numeroEnteros.get(i) + " ");

			if (numeroEnteros.get(i) > mayor) {
				mayor = numeroEnteros.get(i);
			}

			if (numeroEnteros.get(i) < menor) {
				menor = numeroEnteros.get(i);
			}

		}
		
		System.out.println("\nEl numero mayor de los numero introducidos es :" + mayor);
		System.out.println("El numero menor de los numero introducidos es : " + menor);
		System.out.println("La suma de los numero introducidos es : " + suma);
		System.out.println("La media de los numero introducidos es : " + suma / numeroEnteros.size());
	}

}
