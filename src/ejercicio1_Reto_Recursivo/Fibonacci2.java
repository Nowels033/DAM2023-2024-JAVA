package ejercicio1_Reto_Recursivo;

public class Fibonacci2 {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente

		System.out.println(metodoFibonacciV2(0));
		
		
	}
	
	static int metodoFibonacciV2(int limite) {
		int numero =1;
		
		if (limite<=1) {
			
			return 1;
		}
		
		else {
			
			limite--;
			numero+numero;
		
			
			
		}
		
		
	
	}

}
