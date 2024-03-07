package Examen1Arrays;

import java.util.Scanner;

public class MainEmpresa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numeroDeEmpresas = 0;
		do {

			System.out.println("INTRODUCE EL NUMERO DE EMPRESAS QUE QUIERES RECOGER");
			numeroDeEmpresas = sc.nextInt();
			if (numeroDeEmpresas <= 0) {
				System.out.println("EL NUMERO DE EMPRESAS QUE INTRODUZCAS TIEME QUE SER MAYOR QUE = (0)");
				System.out.println();
			}

		} while (numeroDeEmpresas <= 0);
//CREAMOS LA MATRIZ DE OBJETOS EMPRESA CON EL NUMERO INTRODUCIDO ANTERIORMENTE
		Empresa[] empresas = new Empresa[numeroDeEmpresas];

//CREAMOS LAS VARIABLES NECESARIAS PARA EL EXAMEN;
		String nombreDeEmpresa;
		int numeroDeEmpleados;
		float totalBeneficios;
		float beneficiosMax = 0;
		double sumaEmpleados = 0;

//REINICIAMOS EL SCANNER PORQUE INTRODUCIMOS UN NUMERO Y AHORA VAMOS A INTRODUCIR STRINGS
		sc.nextLine();

//CREAMOS EL BUCLE DONDE RELLENAREMOS LAS VARIABLES Y LAS METEREMOS EN LOS ATRIBUTOS DEL OBJETO EMPRESAS CADA VEZ QUE SE EJECUTE
		for (int i = 0; i < empresas.length; i++) {
			empresas[i] = new Empresa();
			System.out.println("INTRODUCE EL NOMBRE DE EMPRESA " + (i + 1));
			nombreDeEmpresa = sc.nextLine();
			empresas[i].nombre = nombreDeEmpresa;
			System.out.println("INTRODUCE EL Nº DE EMPLEADOS DE LA EMPRESA : " + empresas[i].nombre.toUpperCase());
			numeroDeEmpleados = sc.nextInt();
			empresas[i].numeroEmpleados = numeroDeEmpleados;
			System.out.println("INTRODUCE LOS BENEFICIOS TOTALES DE LA EMPRESA : " + empresas[i].nombre.toUpperCase());
			totalBeneficios = sc.nextFloat();
			empresas[i].beneficios = totalBeneficios;

			// VOLVEMOS A REINICIAR EL SCANNER
			sc.nextLine();

			// SUMAMOS LOS EMPLEADOS DE CADA EMPRESA QUE VAYAMOS INTRODUCIENDO EN LA
			// MATRIZ(PARA AHORRAR UN BUCLE FOR)
			sumaEmpleados += empresas[i].numeroEmpleados;

			// HACEMOS UN IF PARA RECOGER EL BENEFICIO MAX PARA LUEGO CALCULAS QUE EMPRESAS
			// TIENEN EL BENEFICIO MAX(AHORRA UN FOR)
			if (empresas[i].beneficios >= beneficiosMax) {

				beneficiosMax = empresas[i].beneficios;
			}

			// MOSTRAMOS LAS EMPRESA CON SUS ATRIBUTOS RELLENADOS ANTERIORMENTE
			System.out.println(empresas[i].toString());
		}

		System.out.println();

		// CALCULAMOS Y MOSTRAMOS LA MEDIA DE EMPEADOS DE LAS EMPRESAS DE LA MATRIZ
		System.out.println("LA MEDIA DE EMPLEADOS ES DE : " + sumaEmpleados / empresas.length);

		// MOSTRAMOS LAS EMPRESAS QUE TENGAN EL BENEFICIO MAXIMO
		System.out.print("EL MAYOR BENEFICIO ES DE : " + beneficiosMax + "€ DE LA(S) EMPRESA(A) : ");

		for (int i = 0; i < empresas.length; i++) {

			if (empresas[i].beneficios >= beneficiosMax) {

				System.out.print(empresas[i].nombre.toUpperCase()+"| ");
			}

		}
	}

}
