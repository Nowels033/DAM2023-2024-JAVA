package artifacrec_ejercicio1;

import java.util.Scanner;

public class Ejericio3 {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("introduce un numero");
		int numero = sc.nextInt();
		System.out.println(ejercicio3(numero));
		

	}

	static int ejercicio3(int numeroTotal) {

		int sumaTotal = 0;

		if (numeroTotal > 1) {

			int a = 0;
			int b = 1;

			sumaTotal = a + b;
			System.out.println(a);
			System.out.println(b);
			int contador = 1;
			while (contador <= numeroTotal - 2) {

				int actual = a + b;
				sumaTotal = sumaTotal + actual;
				System.out.println(actual);

				a = b;
				b = actual;
				contador = contador + 1;

			}

		} else if(numeroTotal == 1) {
			
			sumaTotal =1;

		}

		return sumaTotal;

	}

}
