package Reto_5_1_ejercicio1;

import java.time.LocalDate;

public class ProductoRefrigerado extends Producto{
	
	private int codigoSupervisionAlimentaria;

	/**
	 * @param fechaDeCaducidad
	 * @param numeroDeLote
	 * @param codigoSupervisionAlimentaria
	 */
	public ProductoRefrigerado(LocalDate fechaDeCaducidad, int numeroDeLote, int codigoSupervisionAlimentaria) {
		super(fechaDeCaducidad, numeroDeLote);
		this.codigoSupervisionAlimentaria = codigoSupervisionAlimentaria;
	}

	/**
	 * @return el codigoSupervisionAlimentaria
	 */
	public int getCodigoSupervisionAlimentaria() {
		return codigoSupervisionAlimentaria;
	}

	/**
	 * @param codigoSupervisionAlimentaria el codigoSupervisionAlimentaria a establecer
	 */
	public void setCodigoSupervisionAlimentaria(int codigoSupervisionAlimentaria) {
		this.codigoSupervisionAlimentaria = codigoSupervisionAlimentaria;
	}

	@Override
	public String toString() {
		return "Producto Refrigerado [Codigo De Supervision Alimentaria=" + getCodigoSupervisionAlimentaria()
				 + super.toString() + "]";
	}

	
}
