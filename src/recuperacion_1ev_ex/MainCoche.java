package recuperacion_1ev_ex;

import java.util.Scanner;

public class MainCoche {

	
	//CREAMOS LOS OBJETOS COCHE
	static Coche coche1 = new Coche("BMW", "Serie3", "4411FRB");
	static Coche coche2 = new Coche("Mercedes", "Clase A", "1234WRX");
	static Coche coche3 = new Coche("Toyota", "CHR", "9876ABC");

	public static void main(String[] args) {

		menu2(menu());
	}
//CREAMOS EL METODO DE MENU QUE DEVUELVE UNA OPCION
	static int menu() {

		Scanner sc = new Scanner(System.in);

		int opcion = 1;
		

		do {
			System.out.println();
			System.out.println();
			System.out.println("MENÚ ALQUILER DE COCHES AUTOSNOWELS");
			System.out.println("-----------------------------------");
			System.out.println("1.-Alquilar un coche---------------");
			System.out.println("2.-Devolver un coche---------------");
			System.out.println("0.-Salir---------------------------");
			System.out.println("-----------------------------------");
			opcion = sc.nextInt();

		} while (opcion != 0 && opcion != 1 && opcion != 2);

		return opcion;
	}
//CREAMOS EL METODO MENU2 QUE RECOGE LA OPCION DEL OTRO METODO Y DEPENDIENDO DE LA OPCION ENTRA EN UN SWITCH
	static void menu2(int opcion) {

		Scanner sc = new Scanner(System.in);
		int coche;
		int dias;

		if (opcion == 1) {
			// do {
			System.out.println("Que coche deseas alquilar");
			System.out.println("-------------------------");
			System.out.println("Coche numero 1.");
			System.out.println(coche1.toString());
			System.out.println("Coche numero 2.");
			System.out.println(coche2.toString());
			System.out.println("Coche numero 3.");
			System.out.println(coche3.toString());
			coche = sc.nextInt();

			System.out.println("-------------------------");
			System.out.println("-----------¿Cuantos dias?");
			System.out.println("-------------------------");
			dias = sc.nextInt();
			
			//MOSTRAMOS LOS COCHES Y PEDIMOS QUE OBJETO Y LOS DIAS PARA ALQUILAR

			switch (coche) {

			case 1:
				Coche.alquilarCoche(coche1, dias);
				break;

			case 2:
				Coche.alquilarCoche(coche2, dias);
				break;
			case 3:
				Coche.alquilarCoche(coche3, dias);
				break;

			default:
				System.out.println("COCHE INCORRECTO");
				;

			}
			menu2(menu());
			// } while (coche != 1 || coche != 2 || coche != 3);

		}

		else if (opcion == 2) {

			// do {
			System.out.println("¿Que coche deseas entregar?");
			System.out.println("-------------------------");
			System.out.println("Coche numero 1.");
			System.out.println(coche1.toString());
			System.out.println("Coche numero 2.");
			System.out.println(coche2.toString());
			System.out.println("Coche numero 3.");
			System.out.println(coche3.toString());
			
			coche = sc.nextInt();
			
			//MOSTRAMOS LOS COCHES Y RECOGEMOS LA OPCION DEL COCHE A DEVOLVER 
			
			switch (coche) {

			case 1:
				Coche.devolverCoche(coche1);
				;
				break;

			case 2:
				Coche.devolverCoche(coche2);
				;
				break;
			case 3:
				Coche.devolverCoche(coche3);
				;
				break;

			default:
				System.out.println("COCHE INCORRECTO");
				;

			}

			menu2(menu());

			// } while (coche != 1 || coche != 2 || coche != 3);

		}
	}

}
