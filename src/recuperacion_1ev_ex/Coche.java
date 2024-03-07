package recuperacion_1ev_ex;

import java.time.LocalDate;

public class Coche {

	// CREAMOS LOS ATRIBUTOS DEL OBJETO COCHE

	protected String marca;
	protected String modelo;
	protected String matrícula;
	protected boolean disponible;
	protected LocalDate fechaDisponible;

	// CREAMOS LOS CONTRUCTORES PARA EL OBJETO COCHE

	Coche(String marca, String modelo, String matrícula, boolean disponible, LocalDate fechaDisponible) {

		this.marca = marca;
		this.modelo = modelo;
		this.matrícula = matrícula;
		this.disponible = true;
		this.fechaDisponible = null;
	}

	Coche(String marca, String modelo, String matrícula) {

		this.marca = marca;
		this.modelo = modelo;
		this.matrícula = matrícula;
		this.disponible = true;
		this.fechaDisponible = null;

	}

	Coche() {
		
		

	}

	// CREAMOS EL METODO PARA ALQUILAR UN COCHE

	protected static void alquilarCoche(Coche coche, int nºdias) {

		if (coche.disponible == true) {

			coche.disponible = false;

			coche.fechaDisponible = LocalDate.now().plusDays(nºdias);

			// SI EL COCHE ESTA DISPONIBLE PASA A DISPONIBLE = FALSE
			// Y SE CAMBIA LA FECHA EN QUE ESTARA DISPONIBLE CON LOS Nº DE DIAS INTRODUCIDOS

			System.out.println("El coche con matrícula : " + coche.matrícula + " lo tiene alquilado hasta : "
					+ coche.fechaDisponible);
		}

		else {

			System.out.println("El coche con matrícula " + coche.matrícula + " no esta disponible para alquilar");
		}
	}

	// CREAMOS EL METODO PARA DEVOLVER UN COCHE

	protected static void devolverCoche(Coche coche) {

		if (coche.disponible == false) {

			coche.disponible = true;

			coche.fechaDisponible = null;

			// SI EL COCHE ESTA ALQUILADO (DISPONIBLE=FALSE) PASA A ESTAR DISPONIBLE Y SE
			// PONE LA FECHA DE DISPONIBILIDAD A NULL

			coche.toString();

			System.out.println("¡¡Coche con matricula " + coche.matrícula + " correctamente entregado!!");
			System.out.println();
			System.out.println("¡¡¡¡¡¡Gracias por confiar en AutosNowels!!!!!!!");

		}

		else {

			System.out.println("El coche con matricula : " + coche.matrícula
					+ " no esta alquilado por lo tanto no se puede devolver");

			// SI EL COCHE NO ESTA A ALQUILADO
		}

	}

	@Override
	public String toString() {
		return "Coche [marca=" + marca + ", modelo=" + modelo + ", matrícula=" + matrícula + ", disponible="
				+ disponible + ", fechaDisponible=" + fechaDisponible + "]";
	}

	/**
	 * @return el marca
	 */
	protected String getMarca() {
		return marca;
	}

	/**
	 * @param marca el marca a establecer
	 */
	protected void setMarca(String marca) {
		this.marca = marca;
	}

	/**
	 * @return el modelo
	 */
	protected String getModelo() {
		return modelo;
	}

	/**
	 * @param modelo el modelo a establecer
	 */
	protected void setModelo(String modelo) {
		this.modelo = modelo;
	}

	/**
	 * @return el matrícula
	 */
	protected String getMatrícula() {
		return matrícula;
	}

	/**
	 * @param matrícula el matrícula a establecer
	 */
	protected void setMatrícula(String matrícula) {
		this.matrícula = matrícula;
	}

	/**
	 * @return el disponible
	 */
	protected boolean isDisponible() {
		return disponible;
	}

	/**
	 * @param disponible el disponible a establecer
	 */
	protected void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	/**
	 * @return el fechaDisponible
	 */
	protected LocalDate getFechaDisponible() {
		return fechaDisponible;
	}

	/**
	 * @param fechaDisponible el fechaDisponible a establecer
	 */
	protected void setFechaDisponible(LocalDate fechaDisponible) {
		this.fechaDisponible = fechaDisponible;
	}

}
