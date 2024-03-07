package reto4_1;

public class ejercicio4 {

//	Ejercicio 4:
//
//	Escribir un método max() al que se le pase como argumento el array números y devuelva el valor máximo.

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente

		int[] numeros = { 12, 15, 13, 10, 8, 20, 13, 14 };
		
		max(numeros);
	}

	public static void max(int[] array) {
		int valorMax = 0;
		for (int i = 0; i < array.length; i++) {
			
		
		if (array[i]>valorMax) {
			
			valorMax=array[i];
		
			
		}
	}
		
	System.out.println("El valor maximo de la array es : "+valorMax);	
	
	}

}
