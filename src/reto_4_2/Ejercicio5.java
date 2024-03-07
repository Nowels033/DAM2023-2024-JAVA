package reto_4_2;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		5. Crear un array de números y otro de strings de 5 posiciones. 
//		En el array de números se insertarán notas entre 0 y 10 (habrá que controlar que se inserte una nota correcta), 
//		la nota puede tener decimales, en el array de strings se insertarán los nombres de los alumnos.
//
//		Después, crear un array de strings donde se insertarán los resultados de la notas con palabras.
//
//		    Si la nota está entre 0 y 4,99 , será un suspenso
//		    Si está entre 5 y 6,99 , será un bien.
//		    Si está entre 7 y 8,99 será un notable.
//		    Si está entre 9 y 10 será un sobresaliente.
//
//		Mostrar por pantalla, el alumno, su nota y su resultado en palabras. 
//		Crear los métodos que se consideren convenientes.

		Scanner sc = new Scanner(System.in);

		double[] notas = new double[5];
		String[] nombres = new String[5];
		String[] resultados = { "suspenso", "bien", "notable", "sobresaliente" };

		double nota;
		String nombre;
		// boolean fin = true;

		for (int i = 0; i < nombres.length; i++) {

			System.out.println("Introduce el nombre del alumno : " + (i + 1));
			nombre = sc.nextLine();
			nombres[i] = nombre;

		}

		for (int i = 0; i < notas.length; i++) {

//			System.out.println("Introduce una nota al alumno : " + nombres[i]);
//			nota = sc.nextDouble();

			do {
				System.out.println("Introduce una nota al alumno : " + nombres[i]);
				nota = sc.nextDouble();
				
				if (nota<0 || nota>10) {
					System.out.println("ERROR NOTA DE : " + nombres[i] + " INFERIOR A 0 O SUPERIOR A 10");
				}

			} while (nota < 0 || nota > 10);

			// fin = false;

			if (nota >= 0 && nota <= 10) {

				notas[i] = nota;

			}

		}

		for (int i = 0; i < notas.length; i++) {

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
