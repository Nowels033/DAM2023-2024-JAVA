package reto_4_5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;



public class MainAlumnoV2 {

	public static void main(String[] args) {

//		En el programa principal:
//
//			• crear 5 alumnos
//			• Poner las notas de los alumnos con los métodos set.
//			• Imprimir la información de los alumnos

		final int NUM_ALUMNOS = 5;

		Scanner sc = new Scanner(System.in);

		String fecha;
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

		Alumno[] alumnos = new Alumno[NUM_ALUMNOS];

		for (int i = 0; i < NUM_ALUMNOS; i++) {

			alumnos[i] = new Alumno();

			System.out.println("NOMBRE DEL ALUMNO : " + (i + 1));
			alumnos[i].nombre = sc.nextLine();
			System.out.println("APELLIDO DEL ALUMNO :" + (i + 1));
			alumnos[i].apellido = sc.nextLine();
			System.out.println("INGRESE UNA FECHA (EN EL FORMATO YYYY-MM-DD): ");
			fecha=sc.nextLine();
			alumnos[i].fechaNacimiento=LocalDate.parse(fecha, formatter);
		}

		for (int i = 0; i < NUM_ALUMNOS; i++) {

			System.out
					.println("INTRODUCE LA NOTA DE INGLES DEL ALUMNO " + alumnos[i].nombre + " " + alumnos[i].apellido);
			Alumno.setNotaIngles(alumnos[i], sc.nextInt());
			System.out.println(
					"INTRODUCE LA NOTA DE FRANCES DEL ALUMNO " + alumnos[i].nombre + " " + alumnos[i].apellido);
			Alumno.setNotaFrances(alumnos[i], sc.nextInt());
			System.out
					.println("INTRODUCE LA NOTA DE ALEMAN DEL ALUMNO " + alumnos[i].nombre + " " + alumnos[i].apellido);
			Alumno.setNotaAleman(alumnos[i], sc.nextInt());

//				alumnos[i].notas[j]=sc.nextInt();

		}

		sc.nextLine();
		for (int i = 0; i < NUM_ALUMNOS; i++) {

			System.out.println(alumnos[i].toString());

		}
	}

}
