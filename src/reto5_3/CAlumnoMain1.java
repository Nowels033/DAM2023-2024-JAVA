package reto5_3;

import java.util.Date;

public class CAlumnoMain1 {

	public static void main(String[] args) {
//		
//		Y en la clase CAlumnoMain1 crear los alumnos, asignaturas y profesores siguientes:
//

		// ALUMNOS
//			Pedro, Santana,   03/12/2001, 1234, [Java, Marcas],           [0,0]
//			María, Ruiz,      04/11/2000, 2345, [Java, Entornos, Marcas], [1,1,7]
//			Esther Rodríguez, 05/10/1999, 3456, [Marcas],                 [5]
//ASIGNATURAS
//			11, Java, Manuel,     8
//			22, Marcas, Carolina, 4
//			33, Entornos, Javier, 3
//PROFESORES
//			Manuel, Santana,   01/01/1980, 4567, 1000, Informática
//			Carolina, Ruiz,    02/02/1981, 5678, 2000, Informática
//			Javier, Rodríguez, 03/03/1982, 6789, 3000, CiberSeguridad
//
//			Luego, imprimir por orden todos los datos de los alumnos, por ejemplo:
//			Pedro--Santana--03/12/2001--1234--[Java, Marcas]--[0,0]
//			Se debe comprobar que los nombres y apellidos no sean mayores de 20 caracteres y que los dni no sean superiores al 10000.
//		
		Date fechaJavier = new Date(1982, 02, 03);
		Date fechaCarolina = new Date(1981, 01, 02);
		Date fechaManuel = new Date(1980, 0, 01);
		Date fechaPedro = new Date(2001, 03, 11);
		Date fechaMaria = new Date(2000, 04, 10);
		Date fechaEsther = new Date(1999, 05, 9);

		// OBJETOS DE PROFESOR
		CProfesor pro1 = new CProfesor("Manuel", "Santana", fechaManuel, 4567, 1000, "Informática");
		CProfesor pro2 = new CProfesor("Carolina", "Ruiz", fechaCarolina, 5678, 2000, "Informatica");
		CProfesor pro3 = new CProfesor("Javier", "Rodriguez", fechaJavier, 6789, 3000, "CiberSeguridad");

		// OBJETOS DE ASIGNATURAS
		CAsignatura java = new CAsignatura(11, "Java", pro1, 8);
		CAsignatura marcas = new CAsignatura(22, "Lenguaje de Marcas", pro2, 4);
		CAsignatura entornos = new CAsignatura(33, "Entornos de Desarrollo", pro3, 3);
		// Array de asignaturas

		CAsignatura[] asignaturas = new CAsignatura[3];
		asignaturas[0] = java;
		asignaturas[1] = marcas;
		asignaturas[2] = entornos;

		// ALUMNOS
//		Pedro, Santana,   03/12/2001, 1234, [Java, Marcas],           [0,0]
//		María, Ruiz,      04/11/2000, 2345, [Java, Entornos, Marcas], [1,1,7]
//		Esther Rodríguez, 05/10/1999, 3456, [Marcas],                 [5]

		// OBJETOS DE ALUMNOS
		// creamos el objeto y añadimos las asignaturas y notas a sus arrays
		CAlumno pedro = new CAlumno("Pedro", "Santana", fechaPedro, 1234);
		pedro.setPaoAsignaturaAñadir1(java);
		pedro.setPaoAsignaturaAñadir1(marcas);
		pedro.setPaiNotaAñadir1(0);
		pedro.setPaiNotaAñadir1(0);

		// creamos el objeto y añadimos las asignaturas y notas a sus arrays
		CAlumno maria = new CAlumno("Maria", "Ruiz", fechaMaria, 2345);
		maria.setPaoAsignatura(asignaturas);
		maria.setPaiNotaAñadir1(1);
		maria.setPaiNotaAñadir1(7);
		maria.setPaiNotaAñadir1(1);

		// creamos el objeto y añadimos las asignaturas y notas a sus arrays
		CAlumno esther = new CAlumno("Esther", "Rodriguez", fechaEsther, 3456);
		esther.setPaoAsignaturaAñadir1(marcas);
		esther.setPaiNotaAñadir1(5);


		
		CPersona[] ccc = new CPersona[6];
		ccc[0] = pedro;
		ccc[1] = maria;
		ccc[2] = esther;
		ccc[3] = pro1;
		ccc[4] = pro2;
		ccc[5] = pro3;
		
//		Luego, imprimir por orden todos los datos de los alumnos, por ejemplo:
//		Pedro--Santana--03/12/2001--1234--[Java, Marcas]--[0,0]
		
		for (int i = 0; i < ccc.length; i++) {
			if (ccc[i] instanceof CAlumno) {
				
				System.out.println(ccc[i].getPsNombre()+"--"+ccc[i].getPsApellido1()+"--"+ccc[i].getPdNacimiento()+"--");
				for (int j = 0; j < ((CAlumno)(ccc[i])).getPaoAsignatura().length; j++) {
					
				//	System.out.print(((CAlumno)(ccc[i])).getPaoAsignatura(j));
				}
			}
		}
		// Se debe comprobar que los nombres y apellidos no sean mayores de 20
		// caracteres y que los dni no sean superiores al 10000.

		for (int i = 0; i < ccc.length; i++) {

			if (ccc[i].getPsNombre().length() <= 20) {

				System.out.println("El nombre de : " + ccc[i].getPsNombre() + " es correcto, no supera 20 caracteres");

			}
			if (ccc[i].getPsNombre().length() > 20) {

				System.out.println("El nombre de : " + ccc[i].getPsNombre() + " es incorrecto, supera 20 caracteres");
			}

			if (ccc[i].getPsApellido1().length() <= 20) {

				System.out.println("El Apellido de : " + ccc[i].getPsNombre() + " es correcto, no supera 20 caracteres");

			}

			if (ccc[i].getPsApellido1().length() > 20) {

				System.out.println("El Apellido de : " + ccc[i].getPsNombre() + " es incorrecto, supera 20 caracteres");
			}

			if (ccc[i].getPiDni() > 10000) {

				System.out.println("El DNI de : " + ccc[i].getPsNombre() + " es incorrecto, supera el numero 10000");
			}
			if (ccc[i].getPiDni() <= 10000) {

				System.out.println("El DNI de : " + ccc[i].getPsNombre() + " es correcto, es inferior o igual al numero 10000");
			}
			
			System.out.println("------------------------------------------------------------------------------------------------");
		}

	}

}
