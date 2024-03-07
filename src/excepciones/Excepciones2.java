package excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excepciones2 {

	public static void main(String[] args) {

		System.out.println("OPCIONES\n1.Introducir Datos\n2.SALIR");
		Scanner sc = new Scanner(System.in);

		int opcion = sc.nextInt();

		if (opcion == 1) {

			try {
				pedirDatos();
			} catch (InputMismatchException e) {
				System.out.println("debes de ingresar un numero");
			}
		} else {

			System.out.println("ADIOS");
			System.exit(0);
		}

	}

	static void pedirDatos() throws InputMismatchException  {
//		try {
		Scanner sc = new Scanner(System.in);
		System.out.println("NOMBRE");
		String nombre = sc.nextLine();
		System.out.println("EDAD");
		int edad = sc.nextInt();
		System.out.println("HOLA "+nombre+" TIENES "+edad+" AÑOS");
//		}catch(InputMismatchException e) {
//
//			System.out.println("Debes introducir un numero");
//			
//		}
		System.out.println("FIN");
	}

}
