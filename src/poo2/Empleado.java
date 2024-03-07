package poo2;

import java.util.Date;
import java.util.GregorianCalendar;

public class Empleado implements Comparable,Trabajadores {

	private String nombre;
	private double sueldo;
	private Date altaContrato;
	private int id;
	private static int idSiguiente = 1;

	/**
	 * @param nombre
	 * @param sueldo
	 * @param altaContrato
	 */
	public Empleado(String nombre, double sueldo, int anno, int mes, int dia) {
		super();
		this.nombre = nombre;
		this.sueldo = sueldo;
		GregorianCalendar calendario = new GregorianCalendar(anno, mes, dia);
		this.altaContrato = calendario.getTime();
		this.id = idSiguiente++;

	}

	/**
	 * @param nombre
	 */
	public Empleado(String nombre) {
		this(nombre, 1000, 2000, 0, 1);
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
	 * @return el sueldo
	 */
	public double getSueldo() {
		return sueldo;
	}

	/**
	 * @param sueldo el sueldo a establecer
	 */
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	/**
	 * @return el altaContrato
	 */
	public Date getAltaContrato() {
		return altaContrato;
	}

	/**
	 * @param altaContrato el altaContrato a establecer
	 */
	public void setAltaContrato(Date altaContrato) {
		this.altaContrato = altaContrato;
	}

	public void subeSueldo(double porcentaje) {

		double aumento = getSueldo() * porcentaje / 100;
		setSueldo(getSueldo() + aumento);

	}

	/**
	 * @return el id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id el id a establecer
	 */
	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Empleado [Nombre()=" + getNombre() + ", Sueldo=" + getSueldo() + ", Alta Contrato=" + getAltaContrato()
				+ ", Id=" + getId() + "]";
	}

	@Override
	public int compareTo(Object o) {

		Empleado otroEmpleado = (Empleado) o;
		if (this.sueldo < otroEmpleado.sueldo) {

			return 1;
		}
		if (this.sueldo > otroEmpleado.sueldo) {

			return -1;
		}

		return 0;
	}


	@Override
	public double establecerBonus(double gratificacion) {
		
		return Trabajadores.bonusBase+gratificacion;
	}

}
