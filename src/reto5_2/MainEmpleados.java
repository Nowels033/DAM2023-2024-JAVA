package reto5_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MainEmpleados {

	public static void main(String[] args) {

//En el main se pedirán empleados hasta que no se quieran introducir más. 
//Se solicitará el tipo de empleado (Empleado, Jefe, Becario) y los datos necesarios para crear el objeto
//
//Recorrer array empresa y mostrar datos de todos
//
//Sumar sueldos por categorías
//
//Mostrar datos ordenados por categorías

		Scanner sc = new Scanner(System.in);

		ArrayList<Empleado> empresa = new ArrayList<>();

		boolean fin = true;
		String añadirEmpleado;
		String nombre;
		double sueldo;
		// String array="a";

		do {
			System.out.println("¿Quieres añadir un nuevo empleado?");
			System.out.println("-------------------------------Si");
			System.out.println("-------------------------------No");
			añadirEmpleado = sc.nextLine();

			if (añadirEmpleado.equalsIgnoreCase("si")) {

				System.out.println("Selecciona que tipo de Empleado:");
				System.out.println("1.------------Empleado Normal");
				System.out.println("2.--------------------Becario");
				System.out.println("3.-----------------------Jefe");

				int opcion = sc.nextInt();
				sc.nextLine();

				switch (opcion) {
				case 1:
					System.out.println("1.-----------------Empleado Normal");
					System.out.println("Introduce el Nombre de el EMPLEADO");
					nombre = sc.nextLine();
					System.out.println("Introduce el Sueldo de :" + nombre);
					sueldo = sc.nextDouble();
					Empleado nuevoEmpleado = new Empleado(nombre, sueldo);
					empresa.add(nuevoEmpleado);
					sc.nextLine();

					break;
				case 2:
					System.out.println("2.--------------------Becario");
					System.out.println("Introduce el Nombre de el BECARIO");
					nombre = sc.nextLine();
					System.out.println("Introduce el Sueldo de :" + nombre);
					sueldo = sc.nextDouble();
					Becario nuevoBecario = new Becario(nombre, sueldo);
					empresa.add(nuevoBecario);
					sc.nextLine();

					break;
				case 3:
					System.out.println("3.-----------------------Jefe");
					System.out.println("Introduce el Nombre de el JEFE");
					nombre = sc.nextLine();
					System.out.println("Introduce el Sueldo de :" + nombre);
					sueldo = sc.nextDouble();
					Jefe nuevoJefe = new Jefe(nombre, sueldo);
					empresa.add(nuevoJefe);
					sc.nextLine();

					break;
				default:
					System.out.println("Opción inválida");
					break;
				}
			}

			else if (añadirEmpleado.equalsIgnoreCase("no")) {

				fin = false;

			}

			else {
				System.out.println("INTRODUCE [SI] o [NO]");
			}

		} while (fin);

		double totalEmpleado = 0, totalBecario = 0, totalJefe = 0;

		for (int i = 0; i < empresa.size(); i++) {

			System.out.println(empresa.get(i));

			if (empresa.get(i).toString().charAt(0) == 'E') {

				totalEmpleado += empresa.get(i).getSueldo();
			}

			if (empresa.get(i).toString().charAt(0) == 'B') {

				totalBecario += empresa.get(i).getSueldo();
			}

			if (empresa.get(i).toString().charAt(0) == 'J') {

				totalJefe += empresa.get(i).getSueldo();
			}
		}

		System.out.println("Suma total de los salarios de los EMPLEADOS :" + totalEmpleado);
		System.out.println("Suma total de los salarios de los BECARIOS :" + totalBecario);
		System.out.println("Suma total de los salarios de los JEFES :" + totalJefe);

		System.out.println("EMPLEADOS:");

		for (int i = 0; i < empresa.size(); i++) {

			if (!(empresa.get(i) instanceof Becario )&&!(empresa.get(i) instanceof Jefe)) {

				System.out.println(empresa.get(i));
			}

		}

		System.out.println("BECARIOS:");

		for (int i = 0; i < empresa.size(); i++) {

			if (empresa.get(i) instanceof Becario) {

				System.out.println(empresa.get(i));
			}

		}

		System.out.println("JEFES:");

		for (int i = 0; i < empresa.size(); i++) {

			if (empresa.get(i) instanceof Jefe) {

				System.out.println(empresa.get(i));
			}

		}
	}

}
