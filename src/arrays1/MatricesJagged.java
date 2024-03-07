package arrays1;

import java.util.Scanner;

public class MatricesJagged {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int[][]alumnos = new int[4][];
		int numAsignaturas;
		
		for (int i = 0; i < alumnos.length; i++) {
			
			System.out.println("Numero de Asiganturas :");
			
			numAsignaturas=sc.nextInt();
			
			alumnos [i] = new int[numAsignaturas];
			
			for (int j = 0; j < alumnos[i].length; j++) {
				
				System.out.println("Introucir nota : "+(j+1));
				
				alumnos[i][j]=sc.nextInt();
				
			}
			
		}
		
		for (int i = 0; i < alumnos.length; i++) {
			
			System.out.println("alumno: "+(i+1));
			for (int j = 0; j < alumnos[i].length; j++) {
				System.out.print("\tNota : "+alumnos[i][j]+" ");
			}
			
			System.out.println();
		}
		
	}
	
}
