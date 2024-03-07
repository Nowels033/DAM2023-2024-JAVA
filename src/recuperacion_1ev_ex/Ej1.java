package recuperacion_1ev_ex;

import java.util.Iterator;
import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente

		factorial();

	}

	static void factorial() {

		Scanner sc = new Scanner(System.in);
		
		//declaramos las variables
		
		boolean fin = true;
		int numero = 0;
		int numero2 = 1;
		int numero3 = 1;
		int factorial = 1;
		boolean prueba = true;

		//Creamos un for para que pida un numero hasta que sea positivo
		
		do {

			System.out.println("Introduce un numero NO NEGATIVO ( >=0)");

			numero = sc.nextInt();

		} while (numero < 0);
		
		// Recorremos todo con un for que el limite es el numero introducido y vamos aumentando la variable 
		// factorial hasta llegar al numero introducido

		for (int i = 0; (i < numero && fin) || numero == 0 ; i++, numero2++, numero3++) {

			if (numero == 0 || numero==1) {

				System.out.println(0 + "! = 1");

				fin = false;
					numero = -3;
				
				

			}

			if(numero >=1) {
				
//				if (prueba) {
//					
//					System.out.println(0 + "! = 1");
//					
//					prueba=false;
//					
//				}

				factorial *= numero3;

				System.out.println(numero2 + "! = " + factorial);
				
				
//				numero3=1;
			}

		}

	}

}
