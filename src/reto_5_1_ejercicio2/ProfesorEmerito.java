package reto_5_1_ejercicio2;

public class ProfesorEmerito extends Profesor {

	private int añosEmerito;

	/**
	 * @param nombre
	 * @param edad
	 * @param añosConsolidado
	 * @param añosEmerito
	 */
	public ProfesorEmerito(String nombre, int edad, int añosConsolidado, int añosEmerito) {
		super(nombre, edad, añosConsolidado);
		this.añosEmerito = añosEmerito;
	}

	@Override
	double obtenerSalarioBase() {

		double salarioBaseProfesor = super.obtenerSalarioBase();

		return salarioBaseProfesor + (60 * añosEmerito);
	}

	/**
	 * @return el añosEmerito
	 */
	public int getAñosEmerito() {
		return añosEmerito;
	}

	/**
	 * @param añosEmerito el añosEmerito a establecer
	 */
	public void setAñosEmerito(int añosEmerito) {
		this.añosEmerito = añosEmerito;
	}

	@Override
	public String toString() {
		return "ProfesorEmerito [AñosEmerito=" + getAñosEmerito() + super.toString() + "]";
	}

}
