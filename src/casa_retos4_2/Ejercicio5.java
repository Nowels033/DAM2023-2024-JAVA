package casa_retos4_2;

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

		double[] numeros = new double[5];
		String[] strings = new String[5];
		String[] resultados = { "suspenso", "bien", "notable", "sobresaliente" };

		double nota;
		String nombre;
		//boolean fin = true;

		for (int i = 0; i < strings.length; i++) {

			System.out.println("Introduce el nombre del alumno : " + (i + 1));
			nombre = sc.nextLine();
			strings[i] = nombre;

		}

		for (int i = 0; i < numeros.length; i++) {

			System.out.println("Introduce una nota al alumno : " + strings[i]);
			nota = sc.nextDouble();

			if (nota < 0 || nota > 10 ) {
				
				do {
					
				System.out.println("ERROR NOTA DE : " + strings[i] + " INFERIOR A 0 O SUPERIOR A 10");
				System.out.println("Introduce una nota al alumno : " + strings[i]);
				nota=sc.nextDouble();
				
				}while (nota < 0 || nota > 10 );

				//fin = false;

			}

			if (nota >= 0 && nota <= 10) {

				numeros[i] = nota;

			}

		}

		for (int i = 0; i < numeros.length; i++) {

			if (numeros[i] < 5) {

				System.out
						.println("El alumno : " + strings[i] + " con nota : " + numeros[i] + ", tiene " + resultados[0]);

			}

			if (numeros[i] >= 5 && numeros[i]<7) {

				System.out
						.println("El alumno : " + strings[i] + " con nota : " + numeros[i] + ", tiene " + resultados[1]);

			}
			
			if (numeros[i] >= 7 && numeros[i]<9) {

				System.out
						.println("El alumno : " + strings[i] + " con nota : " + numeros[i] + ", tiene " + resultados[2]);

			}
			
			if (numeros[i] >=9) {

				System.out
						.println("El alumno : " + strings[i] + " con nota : " + numeros[i] + ", tiene " + resultados[3]);

			}

		}
		
		sc.close();

	}

}
