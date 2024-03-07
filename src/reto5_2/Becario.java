package reto5_2;

import java.util.Date;

public class Becario extends Empleado{

	//Becarios: contrato, getContrato(), toString()
	
	private Date contrato;

	/**
	 * @param nombre
	 * @param sueldo
	 */
	public Becario(String nombre, double sueldo) {
		super(nombre, sueldo);
		this.contrato=new Date();
	}

	/**
	 * @return el contrato
	 */
	public Date getContrato() {
		return contrato;
	}

	/**
	 * @param contrato el contrato a establecer
	 */
	public void setContrato(Date contrato) {
		this.contrato = contrato;
	}

	@Override
	public String toString() {
		return "Becario [Contrato =" + getContrato() + ", Nombre=" + getNombre() + ", Sueldo="
				+ getSueldo() + "]";
	}


	
	
	
	}
	
	

