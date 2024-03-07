package reto_4_7_arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio2 {
//2. Crear un programa que use un ArrayList de números float. El programa deberá mostrar un menú donde se pueda agregar un número,
//buscar un número, modificar un número, eliminar un número e insertar un número en una posición específica

	public static void main(String[] args) {

		ArrayList<Float> numeroEnteros = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		int opcion = 2;
		float numero;
		int posicion;
		float numeroModificar;

		do {

			boolean noEsta = false;

			System.out.println("INTRODUCE UNA OPCION");
			System.out.println("1.AGREGAR UN NUMERO");
			System.out.println("2.BUSCAR UN NUMERO");
			System.out.println("3.MODIFICAR UN NUMERO");
			System.out.println("4.ELIMINAR UN NUMERO");
			System.out.println("5.INSERTAR UN NUMERO EN UNA POSICION ESPECIFICA");
			System.out.println("6.MOSTRAR CONTENIDO DE LA ARRAY");
			System.out.println("7.ELIMINAR ARRAYLIST");
			System.out.println("0.SALIR");
			opcion = sc.nextInt();

			switch (opcion) {

			case 1:
				System.out.println("AGREGAR UN NUMERO");
				System.out.println("INTRODUCE EL NUMERO A INGRESAR EN LA ARRAYLIST");
				numero = sc.nextFloat();
				numeroEnteros.add(numero);
				break;
			case 2:
				System.out.println("BUSCAR UN NUMERO");
				System.out.println("INGRESE UN NUMERO PARA BUSCAR EN LA ARRAYLIST");
				numero = sc.nextFloat();
				for (int i = 0; i < numeroEnteros.size(); i++) {
					if (numeroEnteros.get(i) == numero) {

						System.out
								.println("EL NUMERO : " + numero + " ESTA EN LA AARAYLIST EN LA POSICION : " + (i + 1));
						noEsta = true;
					}

				}
				if (!noEsta) {
					System.out.println("EL NUMERO : " + numero + " NO ESTA EN LA AARAYLIST ");
				}
				// System.out.println("LA ARRAY CONTIENE EL NUMERO :"+numero+" :
				// "+numeroEnteros.contains(numero));
				break;
			case 3:
				System.out.println("MODIFICAR UN NUMERO");
				System.out.println("INTRODUCE EL NUMERO QUE QUIERES MODIFICAR");
				numero = sc.nextFloat();
				System.out.println("INTRODUCE EL NUEVO NUMERO QUE QUIERES AÑADIR POR : " + numero);
				numeroModificar = sc.nextFloat();
				for (int i = 0; i < numeroEnteros.size(); i++) {

					if (numeroEnteros.get(i) == numero) {
						numeroEnteros.set(i, numeroModificar);
						noEsta = true;
					}

				}
				if (!noEsta) {
					System.out.println("EL NUMERO INGRESADO : " + numero + ", NO ESTA EN LA ARRAYLIST");
				}

				break;
			case 4:
				System.out.println("4.ELIMINAR UN NUMERO");
				System.out.println("INTRODUCE EL NUMERO QUE QUIERES ELIMINAR");
				numero = sc.nextFloat();
				numeroEnteros.remove(numero);
				System.out.println("NUMERO : (" + numero + ") ELIMINADO");
				break;
			case 5:
				System.out.println("INSERTAR UN NUMERO EN UNA POSICION ESPECIFICA");
				System.out.println("INTRODUCE EL NUMERO QUE QUIERES INSERTAR EN UNA POSICION ESPECIFICA");
				numero = sc.nextFloat();
				System.out.println("INTRODUCE LA POSICION A ESPECIFICA DE LA ARRAYLIST");
				posicion = sc.nextInt() - 1;
				numeroEnteros.set(posicion, numero);
				System.out.println("NUMERO : (" + numero + ") INSERTADO EN LA POSICION : " + (posicion + 1));
				break;
			case 6:
				System.out.println("MOSTRAR CONTENIDO DE LA ARRAY");
				System.out.println("LA ARRAY LIST CONTIENE ESTOS NUMEROS :");
				mostrarArrayList(numeroEnteros);
				break;
			case 7:
				System.out.println("ELIMINAR NUMEROS DE ARRAY ARRAYLIST");
				numeroEnteros.clear();
				break;
			case 0:
				System.out.println("FIN DEL PROGRAMA DEL EJERCICIO 2");
				break;
			default:
				System.out.println("Número inválido. Por favor, ingrese un número del 0 al 7.");
			}

		} while (opcion != 0);

	}

	static void mostrarArrayList(ArrayList<Float> arrayList) {
		System.out.println();
		for (int i = 0; i < arrayList.size(); i++) {

			System.out.println("NUMERO " + (i + 1) + ": " + arrayList.get(i));
		}

	}

}
