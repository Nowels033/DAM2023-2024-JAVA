package poo_recursivos;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
	
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un numero entero :");
		int numero = sc.nextInt();
		
		System.out.println(numero+"! = "+calculaFactorialRecursivo(numero));
		
		

	}

	static float calculaFactorial(int numero) {
		
		float resultado=1;
		
		for (int i = numero; i >= 2; i--) {
			
			resultado *= i;
			
		}
		
		return resultado;
	}
	
	static int calculaFactorialRecursivo(int numero) {
		
		if (numero==0) {
			return 1;
		}
		else {
			return numero*calculaFactorialRecursivo(numero-1);
		}
		
	}
	
}
