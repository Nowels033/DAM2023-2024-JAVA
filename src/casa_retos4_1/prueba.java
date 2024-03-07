package casa_retos4_1;

import java.util.Scanner;

public class prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("INTRODUCE EL TAMAÑO DE LA ARRAY");
		int tamaño=sc.nextInt();
		
		int [] array = new int [tamaño];
		
		for (int i = 0; i < array.length; i++) {
			
			System.out.println("Introduce el numero de posicion "+i);
			array[i]=sc.nextInt();
			
		}
		
		for (int i = 0; i < array.length; i++) {
			
			System.out.println("En la posicion de la array "+i+" tiene el entero : "+array[i]);
			
		}

	}

}
