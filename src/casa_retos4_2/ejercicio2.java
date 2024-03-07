package casa_retos4_2;

import java.util.Scanner;

public class ejercicio2 {
	public static void main(String[] args) {
		
		char [] abc = new char [26];
		
		ejercicio2(abc);
		
	}
	static void ejercicio2(char [] array) {
		
		Scanner sc = new Scanner(System.in);
		int ascii=65;
		boolean fin=true;
		int dato;
		String cadena="";
		
		for (int i = 0; i < array.length; i++,ascii++) {
			
			array[i]=(char) ascii;
			
		}
		do {
			System.out.println("Introduce una posicion de la array para sacar el caracter");
			dato=sc.nextInt();
			
			if (dato<0) {
				
				System.out.println("Saliendo del programa al introducir un numero negativo");
				fin=false;
			}
			
			if (dato>25) {
				
				System.out.println("Introduce un valor valido dentro de la array");
			}
			
			if (dato>=0 && dato<=25) {
				
				System.out.println("El valor introducido corresponde al caracter en la tabla ascii : "+array[dato]);
				cadena += array[dato]+" ";
				System.out.println("La cadena de caracteres introducidos es : "+cadena);
				
			}
			
			
		} while (fin);
		sc.close();
	}

}
