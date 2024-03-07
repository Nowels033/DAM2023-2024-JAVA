package Examen1Arrays;

public class Empresa {

	// CREAMOS LOS ATRIBUTOS DEL OBJETO EMPRESA

	String nombre;
	int numeroEmpleados;
	float beneficios;

	// CREAMOS EL CONTRUCTOR DEL OBJETO EMPRESA SIN ATRIBUTOS

	Empresa() {

	}

	// CREAMOS EL CONTRUCTOR DEL OBJETO EMPRESA CON LOS ATRIBUTOS DE NOMBRE
	// NUMEROEMPLEADOS Y BENEFICIOS;

	Empresa(String nombre, int numeroEmpleados, float beneficios) {

		this.nombre = nombre;
		this.numeroEmpleados = numeroEmpleados;
		this.beneficios = beneficios;
	}

	// CREAMOS EL METODO TOSTRING CON LOS ATRIBUTOS DEL OBJETO EMPRESA

	@Override
	public String toString() {
		return "[Nombre=" + nombre.toUpperCase() + ", Número de empleados=" + numeroEmpleados + ", Beneficios=" + beneficios + "€]";
	}

}
