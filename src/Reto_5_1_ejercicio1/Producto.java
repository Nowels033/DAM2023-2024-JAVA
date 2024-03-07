package Reto_5_1_ejercicio1;

import java.time.LocalDate;

public class Producto {

	private LocalDate fechaDeCaducidad;
	private int numeroDeLote;
	
	
	


	public Producto(LocalDate fechaDeCaducidad, int numeroDeLote) {
		super();
		this.fechaDeCaducidad = fechaDeCaducidad;
		this.numeroDeLote = numeroDeLote;
	}


	/**
	 * @return el fechaDeCaducidad
	 */
	public LocalDate getFechaDeCaducidad() {
		return fechaDeCaducidad;
	}


	/**
	 * @param fechaDeCaducidad el fechaDeCaducidad a establecer
	 */
	public void setFechaDeCaducidad(LocalDate fechaDeCaducidad) {
		this.fechaDeCaducidad = fechaDeCaducidad;
	}


	/**
	 * @return el numeroDeLote
	 */
	public int getNumeroDeLote() {
		return numeroDeLote;
	}


	/**
	 * @param numeroDeLote el numeroDeLote a establecer
	 */
	public void setNumeroDeLote(int numeroDeLote) {
		this.numeroDeLote = numeroDeLote;
	}


	@Override
	public String toString() {
		return "Producto [FechaDeCaducidad=" + getFechaDeCaducidad() + ", NumeroDeLote=" + getNumeroDeLote()
				+ "]";
	}
	
	
	
}
