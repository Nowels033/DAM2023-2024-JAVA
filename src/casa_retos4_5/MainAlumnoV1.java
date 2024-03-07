package casa_retos4_5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MainAlumnoV1 {
	public static void main(String[] args) {

//		En el programa principal:
//
//			• crear 5 alumnos
//			• Poner las notas de los alumnos con los métodos set.
//			• Imprimir la información de los alumnos

		final int NUM_ALUMNOS = 5;

		Scanner sc = new Scanner(System.in);

//		String fecha;
//		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

		Alumno[] alumnos = new Alumno[NUM_ALUMNOS];
		// CREAR LOS ALUMNOS DEL 0 AL 4
		alumnos[0] = new Alumno("Noel", "Dominguez", LocalDate.now());
		alumnos[1] = new Alumno("Pablo", "Rivas", LocalDate.now());
		alumnos[2] = new Alumno("Brayan", "Simancas", LocalDate.now());
		alumnos[3] = new Alumno("Cristian", "Crack", LocalDate.now());
		alumnos[4] = new Alumno("Javier", "Profesor", LocalDate.now());

		// PONER NOTAS AL ALUMNO 0
		Alumno.setNotaIngles(alumnos[0], 1);
		Alumno.setNotaFrances(alumnos[0], 2);
		Alumno.setNotaAleman(alumnos[0], 3);
		// PONER NOTAS AL ALUMNO 1
		Alumno.setNotaIngles(alumnos[1], 1);
		Alumno.setNotaFrances(alumnos[1], 2);
		Alumno.setNotaAleman(alumnos[1], 3);
		// PONER NOTAS AL ALUMNO 2
		Alumno.setNotaIngles(alumnos[2], 1);
		Alumno.setNotaFrances(alumnos[2], 2);
		Alumno.setNotaAleman(alumnos[2], 3);
		// PONER NOTAS AL ALUMNO 3
		Alumno.setNotaIngles(alumnos[3], 1);
		Alumno.setNotaFrances(alumnos[3], 2);
		Alumno.setNotaAleman(alumnos[3], 3);
		// PONER NOTAS AL ALUMNO 4
		Alumno.setNotaIngles(alumnos[4], 1);
		Alumno.setNotaFrances(alumnos[4], 2);
		Alumno.setNotaAleman(alumnos[4], 3);

//		for (int i = 0; i < NUM_ALUMNOS; i++) {
//
//			alumnos[i] = new Alumno();
//
//			System.out.println("NOMBRE DEL ALUMNO : " + (i + 1));
//			alumnos[i].nombre = sc.nextLine();
//			System.out.println("APELLIDO DEL ALUMNO :" + (i + 1));
//			alumnos[i].apellido = sc.nextLine();
//			System.out.println("INGRESE UNA FECHA (EN EL FORMATO YYYY-MM-DD): ");
//			fecha = sc.nextLine();
//			alumnos[i].fechaNacimiento = LocalDate.parse(fecha, formatter);
//		}
//
//		for (int i = 0; i < NUM_ALUMNOS; i++) {
//
//			System.out
//					.println("INTRODUCE LA NOTA DE INGLES DEL ALUMNO " + alumnos[i].nombre + " " + alumnos[i].apellido);
//			Alumno.setNotaIngles(alumnos[i], sc.nextInt());
//			System.out.println(
//					"INTRODUCE LA NOTA DE FRANCES DEL ALUMNO " + alumnos[i].nombre + " " + alumnos[i].apellido);
//			Alumno.setNotaFrances(alumnos[i], sc.nextInt());
//			System.out
//					.println("INTRODUCE LA NOTA DE ALEMAN DEL ALUMNO " + alumnos[i].nombre + " " + alumnos[i].apellido);
//			Alumno.setNotaAleman(alumnos[i], sc.nextInt());
//
////				alumnos[i].notas[j]=sc.nextInt();
//
//		}

	
		for (int i = 0; i < NUM_ALUMNOS; i++) {

			System.out.println(alumnos[i].toString());

		}
	}
}
