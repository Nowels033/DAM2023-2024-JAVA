package reto6_1;

public class EmpleadoRepresentante extends Empleado{

	//Los representantes. Su sueldo mensual es el 20% de las ventas que han hecho en el mes más 800 euros.
	
	private double ventas;

	/**
	 * @param nombre
	 * @param apellido
	 * @param edad
	 */
	public EmpleadoRepresentante(String nombre, String apellido, int edad) {
		super(nombre, apellido, edad);
		// TODO Esbozo de constructor generado automáticamente
	}

	
	
	/**
	 * @return el ventas
	 */
	public double getVentas() {
		return ventas;
	}



	/**
	 * @param ventas el ventas a establecer
	 */
	public void setVentas(double ventas) {
		this.ventas = ventas;
	}



	@Override
	public double calcularSueldo() {
		
		return 800+(getVentas()*20/100);
	}
	


}
