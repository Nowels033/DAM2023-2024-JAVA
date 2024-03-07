package reto4_8_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//Ejercicio 2
//
//Escribir un programa java que gestione los coches de una empresa de alquiler de coches.
//definir una clase Coche con los atributos: matrícula, marca y modelo. Constructor con todos los parámetros. Método toString().
//en el programa principal, declarar dos listas: alquilados y libres que van a contener los coches que están actualmente alquilados y los coches actualmente libres.
//El programa presenta un menú:
//dar de alta un coche: inserta un coche nuevo a la lista de los libres
//alquilar un coche: visualiza la lista , pide al usuario el coche que desea alquilar, comprueba que en efecto el coche está libre,
//y si es así borra el coche de la lista de los coches libres y lo inserta en la lista de los coches alquilados
//devolver coche: se introduce la matrícula del coche, se comprueba que está en la lista de los coches alquilados. Si es así, se borra el coche de la lista de los coches alquilados y se inserta en la lista de los coches libres.
//Ordenar lista (cualquiera de las dos) por marca.

public class Ejercicio2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList<Coches> alquilados = new ArrayList<>();
		ArrayList<Coches> libres = new ArrayList<>();

		int opcion = 2;
		String marca;
		String modelo;
		String matricula;
		int contador = 0;
		do {
			boolean noEsta = false;

			System.out.println("MENU DE ALQUILER DE COCHES");
			System.out.println("1.DAR DE ALTA UN COCHE");
			System.out.println("2.ALQUILAR UN COCHE");
			System.out.println("3.DELVOLVER COCHE ALQUILADO");
			System.out.println("4.MOSTRAR LISTA DE COCHES ORDENADOS POR MARCA");
			opcion = sc.nextInt();
			sc.nextLine();
			switch (opcion) {

			case 1:
				System.out.println("1.DAR DE ALTA UN COCHE");
				System.out.println("INGRESE LA MATRICULA DEL COCHE");
				matricula = sc.nextLine();
				System.out.println("INGRESE LA MARCA DEL COCHE");
				marca = sc.nextLine();
				System.out.println("INGRESE EL MODELO DEL COCHE");
				modelo = sc.nextLine();			
				libres.add(new Coches(matricula, marca, modelo));
				System.out.println("EL COCHE CREADO ES :");
				System.out.println(libres.get(contador));
				contador++;

				break;

			case 2:
				System.out.println("2.ALQUILAR UN COCHE");
				System.out.println("COCHES LIBRES :");
				System.out.println(libres.toString());
				System.out.println("DIME LA MATRICULA DEL COCHE QUE DESEAS ALQUILAR");
				matricula = sc.nextLine();
				for (int i = 0; i < libres.size(); i++) {

					if (libres.get(i).matricula.equalsIgnoreCase(matricula)) {

						alquilados.add(libres.get(i));
						libres.remove(i);
						System.out.println("EL COCHE SE ALQUILO CORRECTAMENTE");
						noEsta = true;
					}

				}
				if (!noEsta) {
					System.out.println("EL COCHE NO SE PUEDE ALQUILAR NO ESTA DISPONIBLE");
				}
				break;
			case 3:
				System.out.println("3.DELVOLVER COCHE ALQUILADO");
				System.out.println("INTRODUCE LA MATRICULA DEL COCHE QUE QUIERAS DEVOLVER");
				matricula = sc.nextLine();
				for (int i = 0; i < alquilados.size(); i++) {

					if (alquilados.get(i).matricula.equalsIgnoreCase(matricula)) {

						libres.add(alquilados.get(i));
						alquilados.remove(i);
						System.out.println("EL COCHE SE DEVOLVIO CORRECTAMENTE");
						noEsta = true;
					}

				}
				if (!noEsta) {
					System.out.println("EL COCHE NO SE PUEDE DEVOLVER NO ESTA ALQUILADO");
				}
				break;
			case 4:
				System.out.println("4.MOSTRAR LISTA DE COCHES ORDENADOS POR MARCA");
				// Collections;
				ordenarCoches(libres);
				mostrarCoches(libres);
				break;
			case 0:
				System.out.println("FIN DEL PROGRAMA DEL EJERCICIO 2");
				break;
			default:
				System.out.println("Número inválido. Por favor, ingrese un número del 0 al 4.");
			}

		} while (opcion != 0);

	}

	static void mostrarCoches(ArrayList<Coches> coches) {

		for (int i = 0; i < coches.size(); i++) {

			System.out.println(coches.get(i));
		}
	}
	
	static void ordenarCoches(ArrayList<Coches> coches) {

	Coches cambio = new  Coches() ;
		for (int i = 0; i < coches.size(); i++) {

			for (int j = 0; j < coches.size(); j++) {
				
				if (coches.get(i).marca.compareTo(coches.get(j).marca)<0) {
					
					cambio=coches.get(i);
					
					coches.set(i, coches.get(j));
					coches.set(j, cambio);
					
				}
			}
		}
	}

}
