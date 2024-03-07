package arrays1;

import java.util.Scanner;

public class RegistroCalificaciones {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente

		Scanner sc = new Scanner(System.in);

		final int NESTUDIANTES = 3;
		final int NNOTAS = 4;

		double[][] calificaciones = new double[NESTUDIANTES][NNOTAS];
		String[] nombre = new String[NESTUDIANTES];
		String[] asignatura = {"SISTEMAS","ENTORNOS","PROGRAMACION","BASE DE DATOS"};

		for (int i = 0; i < NESTUDIANTES; i++) {
			
			System.out.println("introduce el nombre del alumno : "+(i+1));
			nombre[i]=sc.nextLine();

			System.out.println("Ingresar calificaciones para el estudiante : " + nombre[i] + " :");
			

			for (int j = 0; j < NNOTAS; j++) {

				System.out.println(
						"Calificacion del estudiante : " + nombre[i] + " en la asignatura : " + asignatura[j] + " :");

				calificaciones[i][j] = sc.nextDouble();
				sc.nextLine();

			}

		}

		for (int i = 0; i < NESTUDIANTES; i++) {

			double suma = 0;

			for (int j = 0; j < NNOTAS; j++) {

				suma += calificaciones[i][j];

			}

			System.out.println("Media del alumno : " + nombre[i] + " = " + (suma / NNOTAS));

		}

	}

}
