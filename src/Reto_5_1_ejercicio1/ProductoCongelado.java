package Reto_5_1_ejercicio1;

import java.time.LocalDate;

public class ProductoCongelado extends Producto{
	
	private int temperaturaCongelacionRecomendada;

	/**
	 * @param fechaDeCaducidad
	 * @param numeroDeLote
	 * @param temperaturaCongelacionRecomendada
	 */
	public ProductoCongelado(LocalDate fechaDeCaducidad, int numeroDeLote, int temperaturaCongelacionRecomendada) {
		super(fechaDeCaducidad, numeroDeLote);
		this.temperaturaCongelacionRecomendada = temperaturaCongelacionRecomendada;
	}

	/**
	 * @return el temperaturaCongelacionRecomendada
	 */
	public int getTemperaturaCongelacionRecomendada() {
		return temperaturaCongelacionRecomendada;
	}

	/**
	 * @param temperaturaCongelacionRecomendada el temperaturaCongelacionRecomendada a establecer
	 */
	public void setTemperaturaCongelacionRecomendada(int temperaturaCongelacionRecomendada) {
		this.temperaturaCongelacionRecomendada = temperaturaCongelacionRecomendada;
	}

	@Override
	public String toString() {
		return "Producto Congelado [Temperatura De Congelacion Recomendada =" + getTemperaturaCongelacionRecomendada()
				+  super.toString() + "]";
	}
	
	

}
