package reto4_8_ArrayList;

//definir una clase Coche con los atributos: matrícula, marca y modelo. Constructor con todos los parámetros. Método toString().

public class Coches {
	
	String matricula;
	String marca;
	String modelo;
	
	Coches (String matricula,String marca,String modelo){
		
		this.matricula=matricula;
		this.marca=marca;
		this.modelo=modelo;
		
	}
	
	Coches(){
		
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

	@Override
	public String toString() {
		return "Coches [Matricula=" + matricula + ", Marca=" + marca + ", Modelo=" + modelo + "]";
	}

}
