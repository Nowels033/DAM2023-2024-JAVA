package reto_4_2;

import java.util.Scanner;

public class Ejercicio5Version2 {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente

		Scanner sc = new Scanner(System.in);

		final int NOTAS_ALUMNO = 5;
		final int NUMERO_ALUMNOS = 5;

		double[] notas = new double[NOTAS_ALUMNO];
		String[] nombres = new String[NUMERO_ALUMNOS];
		String[] resultados = { "suspenso", "bien", "notable", "sobresaliente" };

		double nota;
		String nombre;
		// boolean fin = true;

		for (int i = 0; i < nombres.length; i++) {

			System.out.println("Introduce el nombre del alumno : " + (i + 1));
			
			nombre = sc.nextLine();
			
			nombres[i] = nombre;

			do {
				System.out.println("Introduce una nota al alumno : " + nombres[i]);
				nota = sc.nextDouble();
				sc.nextLine();
				if (nota < 0 || nota > 10) {
					System.out.println("ERROR NOTA DE : " + nombres[i] + " INFERIOR A 0 O SUPERIOR A 10");
				}

			} while (nota < 0 || nota > 10);

			// fin = false;

			if (nota >= 0 && nota <= 10) {

				notas[i] = nota;

			}

			if (notas[i] < 5) {

				System.out
						.println("El alumno : " + nombres[i] + " con nota : " + notas[i] + ", tiene " + resultados[0]);

			}

			if (notas[i] >= 5 && notas[i] < 7) {

				System.out
						.println("El alumno : " + nombres[i] + " con nota : " + notas[i] + ", tiene " + resultados[1]);

			}

			if (notas[i] >= 7 && notas[i] < 9) {

				System.out
						.println("El alumno : " + nombres[i] + " con nota : " + notas[i] + ", tiene " + resultados[2]);

			}

			if (notas[i] >= 9) {

				System.out
						.println("El alumno : " + nombres[i] + " con nota : " + notas[i] + ", tiene " + resultados[3]);

			}

		}

		sc.close();

	}

}
