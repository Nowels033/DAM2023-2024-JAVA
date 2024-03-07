package casa_retos4_5;

import java.time.LocalDate;
import java.util.Scanner;

public class MainAlumnoV3 {

	public static void main(String[] args) {

//		Ejercicio 3: modificación del ejercicio 1
//		Atributos:
//		o Nombre
//		o Apellido
//		o Fecha de nacimiento
//		o Notas: array de 3 notas (inglés, francés, alemán)
//		Constructor de 3 parámetros (los tres primeros) y de 0 parámetros
//		Métodos toString() y calcularMedia()
//		Métodos setNotaIngles(), setNotaFrances(), setNotaAleman(). En los tres casos se pasa la nota como parámetro.
//
//		Crear una clase Grupo que tenga:
//
//		Atributos:
//
//		o Nombre
//		o Planta
//		o Alumnos : array de 5 alumnos
//
//		Constructor de 2 parámetros : el nombre y la planta
//		Métodos toString() y AsignarAlumno(): se le pasa un alumno
//
//
//		En el programa principal:
//
//		• Crear dos grupos, crear 5 alumnos
//		• Asignar los alumnos a los grupos (3 a uno y 2 al otro)
//		• Poner las notas de los alumnos con los métodos set.
//		• Imprimir la información de los dos grupos

		final int NUM_ALUMNOS = 5;

		Scanner sc = new Scanner(System.in);

//		String fecha;
//		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

		// CREAR LOS 2 GRUPOS

		Grupo[] clase = new Grupo[2];

		clase[0] = new Grupo("DAM", 1);
		clase[1] = new Grupo("DAW", 2);

		Alumno[] alumnos = new Alumno[NUM_ALUMNOS];
		// CREAR LOS ALUMNOS DEL 0 AL 4
		alumnos[0] = new Alumno("Noel", "Dominguez", LocalDate.now());
		alumnos[1] = new Alumno("Pablo", "Rivas", LocalDate.now());
		alumnos[2] = new Alumno("Brayan", "Simancas", LocalDate.now());
		alumnos[3] = new Alumno("Cristian", "Crack", LocalDate.now());
		alumnos[4] = new Alumno("Javier", "Profesor", LocalDate.now());

		// METER LOS ALUMNOS EN LOS GRUPOS

		clase[0].asignarAlumnoNoStatic(alumnos[0]);
		clase[0].asignarAlumnoNoStatic(alumnos[1]);
		clase[0].asignarAlumnoNoStatic(alumnos[2]);
		clase[1].asignarAlumnoNoStatic(alumnos[3]);
		clase[1].asignarAlumnoNoStatic(alumnos[4]);

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
		
		System.out.println(clase[0].toString());
		System.out.println(clase[1].toString());
		
		

	}

}
