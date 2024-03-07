package reto6_1;

import java.time.LocalDate;
import java.util.Date;

public abstract class  Empleado {

//	La clase empleado será una clase abstracta y tendrá :
//
//		el método abstracto calcularSueldo, que será diferente en función del tipo de empleado
//		un método getNombreCompleto que devolverá la concatenación de “El empleado :” y del nombre y del apellido
//		un constructor	
	
	
	//Un empleado tiene un nombre, un apellido, una edad y una fecha de entrada en la empresa.
	
	private String nombre;
	private String Apellido;
	private int edad;
	private LocalDate entradaEmpresa;
	
	/**
	 * @param nombre
	 * @param apellido
	 * @param edad
	 * @param entradaEmpresa
	 */
	public Empleado(String nombre, String apellido, int edad) {
		super();
		this.nombre = nombre;
		Apellido = apellido;
		this.edad = edad;
		this.entradaEmpresa = LocalDate.now();
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
	 * @return el apellido
	 */
	public String getApellido() {
		return Apellido;
	}



	/**
	 * @param apellido el apellido a establecer
	 */
	public void setApellido(String apellido) {
		Apellido = apellido;
	}



	/**
	 * @return el edad
	 */
	public int getEdad() {
		return edad;
	}



	/**
	 * @param edad el edad a establecer
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}



	/**
	 * @return el entradaEmpresa
	 */
	public LocalDate getEntradaEmpresa() {
		return entradaEmpresa;
	}



	/**
	 * @param entradaEmpresa el entradaEmpresa a establecer
	 */
	public void setEntradaEmpresa(LocalDate entradaEmpresa) {
		this.entradaEmpresa = entradaEmpresa;
	}



	public abstract double calcularSueldo();
	
	public String GetNombreCompleto(Empleado empleado) {
		
		return "Empleado : "+empleado.getNombre()+" "+empleado.getApellido();
	}




	
	
	
}
