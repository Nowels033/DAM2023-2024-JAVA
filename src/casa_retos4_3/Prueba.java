package casa_retos4_3;

import java.util.Scanner;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Crear un array bidimensional de 4 filas por 5 columnas
		int[][] matriz = new int[5][6];

		// Pedir al usuario que ingrese 20 números enteros
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese 20 números enteros:");

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("Número en la posición [" + (i + 1) + "][" + (j + 1) + "]: ");
				matriz[i][j] = scanner.nextInt();
			}
		}

//        // Calcular las sumas parciales de filas y columnas
//        for (int i = 0; i < 4; i++) {
//            for (int j = 0; j < 5; j++) {
//                matriz[i][4] += matriz[i][j]; // Suma de filas
//                matriz[3][j] += matriz[i][j]; // Suma de columnas
//            }
//        }
//
//        // Calcular la suma total
//        matriz[3][4] = 0;
//        for (int i = 0; i < 4; i++) {
//            matriz[3][4] += matriz[i][4];
//        }

		// Mostrar la matriz con las sumas parciales y la suma total
		int fila1 = 0;
		System.out.println("\nMatriz con sumas parciales y suma total:");
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {

				System.out.print(matriz[i][j] + "\t");
				matriz[i][5] += matriz[i][j];
			}
			System.out.print(matriz[i][5]);
			matriz[i][5] = 0;
			System.out.println();
		}

		int j;
		for (int i = 0; i < 5; i++) {
			for ( j = 0; j < 5; j++) {

				matriz[4][j] += matriz[i][j];

				// matriz[4][j]=0;
				// matriz[4][0]=0;
			}

			System.out.print(matriz[4][j] + "\t");

		}

	}

}
