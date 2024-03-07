package reto5_3;

import java.util.Date;

public class CPersona {
	
	private String psNombre;
	private String psApellido1;
	private Date pdNacimiento;
	private int piDni;
	/**
	 * @param psNombre
	 * @param psApellido1
	 * @param pdNacimiento
	 * @param piDni
	 */
	public CPersona(String psNombre, String psApellido1, Date pdNacimiento, int piDni) {
		super();
		this.psNombre = psNombre;
		this.psApellido1 = psApellido1;
		this.pdNacimiento = pdNacimiento;
		this.piDni = piDni;
	}
	/**
	 * @return el psNombre
	 */
	public String getPsNombre() {
		return psNombre;
	}
	/**
	 * @param psNombre el psNombre a establecer
	 */
	public void setPsNombre(String psNombre) {
		this.psNombre = psNombre;
	}
	/**
	 * @return el psApellido1
	 */
	public String getPsApellido1() {
		return psApellido1;
	}
	/**
	 * @param psApellido1 el psApellido1 a establecer
	 */
	public void setPsApellido1(String psApellido1) {
		this.psApellido1 = psApellido1;
	}
	/**
	 * @return el pdNacimiento
	 */
	public Date getPdNacimiento() {
		return pdNacimiento;
	}
	/**
	 * @param pdNacimiento el pdNacimiento a establecer
	 */
	public void setPdNacimiento(Date pdNacimiento) {
		this.pdNacimiento = pdNacimiento;
	}
	/**
	 * @return el piDni
	 */
	public int getPiDni() {
		return piDni;
	}
	/**
	 * @param piDni el piDni a establecer
	 */
	public void setPiDni(int piDni) {
		this.piDni = piDni;
	}
	@Override
	public String toString() {
		return "Persona [Nombre =" + getPsNombre() + ", Apellido1 =" + getPsApellido1()
				+ ", Nacimiento =" + getPdNacimiento() + ", Dni =" + getPiDni() + "]";
	}
	
	

}
