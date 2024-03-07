package eedt2e1;

import java.util.Scanner;

public class Ej2T3 {
	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int numeroLimite;
			
			System.out.println("Introduce el numero limite para restar entre pares y impares");
			numeroLimite=sc.nextInt();
			int par=0,impar=0;
			for (int i =1; i<=numeroLimite;i++) {
				if(i%2==0) {
					par += i;
				}
				else {
					impar += i;
				}
			}
			int resultadoFinal=par-impar;
			
			System.out.println("La resta entre los numeros pares e impares hasta "+numeroLimite+" es : "+resultadoFinal);
			
		
		}
	}

