package reto4_1;

public class ejercicio3 {

//	Ejercicio 3:
//
//		Escribir un método alternar() al que se le pase como argumento el array números y dos índices del array. 
//		El método alternará los valores contenidos en los dos índices. Se deberá comprobar que los índices están dentro del rango del array.

	public static void main(String[] args) {
	
		int[] numeros = {12, 15, 13, 10, 8, 9, 13, 14};
		
		alternar(numeros, 1, 4);
		

	}
	
	public static  void alternar(int [] array,int numero1, int numero2) {
		
		int arrayValor;
		
		for (int i = 0; i < array.length; i++) {
			
			System.out.println("array en la posicion "+(i+1)+" con valor de : "+array[i]);
		}
			
			if (numero1 <= array.length && numero1>0 && numero2 <= array.length && numero2>0) {
				arrayValor= array[numero1-1];
				array[numero1-1]=array[numero2-1];
				array[numero2-1]=arrayValor;
				

			}
			
			else {
				
				System.out.println("Uno de las 2 posciones no se encuentra en el array");
				
			}
			
			for (int i = 0; i < array.length; i++) {
				
				System.out.println("ahora los valores de la array en posicio "+(i+1)+" son valor de : "+array[i]);
			}
			
		
		
	}

}
