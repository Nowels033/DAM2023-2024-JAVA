package reto_4_5;

import java.util.Arrays;

public class Grupo {

//	Crear una clase Grupo que tenga:
	//
//				Atributos:
	//
//				o Nombre
//				o Planta
//				o Alumnos : array de 5 alumnos
	//
//				Constructor de 2 parámetros : el nombre y la planta
//				Métodos toString() y AsignarAlumno(): se le pasa un alumno

	String nombre;
	int planta;
	Alumno[] alumnos = new Alumno[5];

	Grupo(String nombre, int planta) {

		this.nombre = nombre;
		this.planta = planta;

	}

	static void asignarAlumno(Grupo nomGrupo, Alumno alumno) {

		boolean estaLleno = true;

		for (int i = 0; i < nomGrupo.alumnos.length; i++) {

			estaLleno = true;

			if (nomGrupo.alumnos[i] == null) {

				nomGrupo.alumnos[i] = alumno;

				estaLleno = false;
				
				break;

			}

		}
		if (estaLleno) {

			System.out.println("El grupo esta lleno de alumnos");

		}

	}

	void asignarAlumnoNoStatic(Alumno alumno) {

		boolean fin = true;
		for (int i = 0; i < alumnos.length; i++) {

			if (alumnos[i] == null) {

				alumnos[i] = alumno;

				fin = false;
				break;
			}
		}

		if (fin) {

			System.out.println("EL GRUPO ESTA LLENO");

		}

	}

	@Override
	public String toString() {
		return "Grupo [nombre=" + nombre + ", planta=" + planta + ", alumnos=" + Arrays.toString(alumnos) + "]";
	}

}
