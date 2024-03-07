package reto4_8_ArrayList;

import java.util.ArrayList;

public class Ejercicio1 {

//	Ejercicio 1
//
//	Escribir un programa que:
//
//	cree una lista (arrayList) de cadenas de caracteres
//	inserte las cadenas PHP, Java, C++, Python y visualice la lista con un for
//	inserte Pascal en la primera posición y visualice de nuevo la lista (Pascal, PHP, Java, C++, Python)
//	Recuperar el 3º elemento de la lista : Java
//	Buscar en qué posición se encuentra el elemento Python.
//	Borrar Pascal y visualizar la lista
//	Borrar todos los elementos de la lista y visualizarla de nuevo
	public static void main(String[] args) {

		ArrayList<String> arrayList = new ArrayList<>();

		arrayList.add("PHP");
		arrayList.add("Java");
		arrayList.add("C++");
		arrayList.add("Python");

		mostrarArray(arrayList);

		System.out.println("AÑADIMOS EN LA POSICION 0 EL ELEMENTO PASCAL");
		arrayList.add(0, "Pascal");
		mostrarArray(arrayList);
		System.out.println("RECUPERAMOS EL ELEMENTO JAVA QUE ESTA EN LA TERCERA POSICION");
		System.out.println();
		System.out.println(arrayList.get(2));

		 System.out.println("PYTHON SE ENCUETRA EN LA POSICION :"
		 		+arrayList.indexOf("Python"));

		for (int i = 0; i < arrayList.size(); i++) {

			if (arrayList.get(i).equalsIgnoreCase("Python")) {

				System.out.println("Python se encuentra en la posicon : " + i);

			}

		}
		System.out.println("BORRAMOS PASCAL");
		arrayList.remove("Pascal");

		mostrarArray(arrayList);

		System.out.println("ELIMINAMOS LOS ELEMENTOS DE LA ARRAYLIST");
		arrayList.clear();

		mostrarArray(arrayList);

	}

	static void mostrarArray(ArrayList<String> arrayList) {

		System.out.println("ELEMENTOS EN LA ARRAYLIST");
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}
	}

}
