package excepciones;

import java.util.Scanner;

public class Excepciones3 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner (System.in);
		
		int num1=0,num2=0;
		
		System.out.println("Ingresar numerador");
		try {
		num1=sc.nextInt();

		System.out.println("Ingresar Denominador");
		num2=sc.nextInt();
		
		}catch (java.util.InputMismatchException e) {
			System.out.println("Debes introducir un numero");
			System.out.println("Mensaje :" +e.getMessage().toString());
			System.out.println(" Error de tipo: "+e.getClass().getName());
		}
		try {
		System.out.println(num1+" / "+num2+" = "+dividir(num1,num2));
		}catch (ArithmeticException e){
			System.out.println("division por 0");
			
			System.out.println("Mensaje :" +e.getMessage().toString());
			System.out.println(" Error de tipo: "+e.getClass().getName());
		}finally {
			System.out.println("Esto se ejecuta siempre");
		}
		
		
		
	}
	static double dividir(int num1,int num2) throws ArithmeticException  {
//		try {
//		return num1/num2;
//		}catch( java.lang.ArithmeticException e) {
//			return 0;
//		}
		return num1/num2;
	}

}
