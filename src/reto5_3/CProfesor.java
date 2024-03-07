package reto5_3;

import java.util.Date;

public class CProfesor extends CPersona{

	//CProfesor: psNombre, psApellido1, pdNacimiento, piDni, piSueldo, psTitulo;
	
	
	private double pdSueldo;
	private String psTitulo;
	/**
	 * @param psNombre
	 * @param psApellido1
	 * @param pdNacimiento
	 * @param piDni
	 */
	public CProfesor(String psNombre, String psApellido1, Date pdNacimiento, int piDni,double pdSueldo,String psTitulo) {
		super(psNombre, psApellido1, pdNacimiento, piDni);
		this.pdSueldo=pdSueldo;
		this.psTitulo=psTitulo;
	}
	/**
	 * @return el pdSueldo
	 */
	public double getPdSueldo() {
		return pdSueldo;
	}
	/**
	 * @param pdSueldo el pdSueldo a establecer
	 */
	public void setPdSueldo(double pdSueldo) {
		this.pdSueldo = pdSueldo;
	}
	/**
	 * @return el psTitulo
	 */
	public String getPsTitulo() {
		return psTitulo;
	}
	/**
	 * @param psTitulo el psTitulo a establecer
	 */
	public void setPsTitulo(String psTitulo) {
		this.psTitulo = psTitulo;
	}
	@Override
	public String toString() {
		return "Profesor [Sueldo =" + getPdSueldo() + ", Titulo =" + getPsTitulo() + ", Nombre ="
				+ getPsNombre() + ",  Apellido1 =" + getPsApellido1() + ", Nacimiento =" + getPdNacimiento()
				+ ", Dni =" + getPiDni() + "]";
	}
	
	
	
	
}
