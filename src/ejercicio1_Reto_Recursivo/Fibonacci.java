package ejercicio1_Reto_Recursivo;

public class Fibonacci {

	public static void main(String[] args) {
		
		int iteraciones = 15; 
        System.out.println("Secuencia Fibonacci de " + iteraciones + " iteraciones:");
        for (int i = 0; i < iteraciones; i++) {
            System.out.print(metodoFibonacci(i) + " ");
        }
		

	}
	
	static int metodoFibonacci(int numero) {
	
		if (numero<=1) {
			return numero;
		}
		
		else {
			return metodoFibonacci(numero-2)+metodoFibonacci(numero-1);
		}
	
	
	}

}
