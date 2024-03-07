package reto_5_1_ejercicio2;

public class Profesor {

	private String nombre;
	private int edad;
	private int añosConsolidado;

	/**
	 * @param nombre
	 * @param edad
	 * @param añosConsolidad
	 */
	public Profesor(String nombre, int edad, int añosConsolidado) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.añosConsolidado = añosConsolidado;
	}

	// double obtenerSalarioBase () que obtendrá el salario base como (1100 + el
	// número de años consolidados multiplicado por 50).

	double obtenerSalarioBase() {
		double salario = 1100;

		salario = salario + (añosConsolidado * 50);

		return salario;

	}

	/**
	 * @return el nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre el nombre a establecer
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return el edad
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * @param edad el edad a establecer
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	/**
	 * @return el añosConsolidad
	 */
	public int getAñosConsolidad() {
		return añosConsolidado;
	}

	/**
	 * @param añosConsolidad el añosConsolidad a establecer
	 */
	public void setAñosConsolidad(int añosConsolidad) {
		this.añosConsolidado = añosConsolidad;
	}

	@Override
	public String toString() {
		return "Profesor [getNombre()=" + getNombre() + ", getEdad()=" + getEdad() + ", getAñosConsolidad()="
				+ getAñosConsolidad() + "]";
	}

}
