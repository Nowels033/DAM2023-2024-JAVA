package Reto_5_1_ejercicio1;

import java.time.LocalDate;

public class ProductoFresco extends Producto{

	 private LocalDate laFechaDeEnvasado;
	 private String paisOrigen;
	 
	public ProductoFresco(LocalDate fechaDeCaducidad, int numeroDeLote, LocalDate laFechaDeEnvasado,
			String paisOrigen) {
		super(fechaDeCaducidad, numeroDeLote);
		this.laFechaDeEnvasado = laFechaDeEnvasado;
		this.paisOrigen = paisOrigen;
	}

	/**
	 * @return el laFechaDeEnvasado
	 */
	public LocalDate getLaFechaDeEnvasado() {
		return laFechaDeEnvasado;
	}

	/**
	 * @param laFechaDeEnvasado el laFechaDeEnvasado a establecer
	 */
	public void setLaFechaDeEnvasado(LocalDate laFechaDeEnvasado) {
		this.laFechaDeEnvasado = laFechaDeEnvasado;
	}

	/**
	 * @return el paisOrigen
	 */
	public String getPaisOrigen() {
		return paisOrigen;
	}

	/**
	 * @param paisOrigen el paisOrigen a establecer
	 */
	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}

	@Override
	public String toString() {
		return "ProductoFresco [LaFecha De Envasado=" + getLaFechaDeEnvasado() + ", Pais De Origen()="
				+ getPaisOrigen() + super.toString() + "]";
	}
	
	
	
}
