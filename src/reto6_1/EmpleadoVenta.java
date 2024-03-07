package reto6_1;

public class  EmpleadoVenta extends Empleado{

	/**
	 * @param nombre
	 * @param apellido
	 * @param edad
	 */
	
	//Los empleados que se dedican a la venta. Su sueldo mensual es el 20% de las ventas que han hecho en el mes más 400 euros
	
	private double Ventas;
	
	public EmpleadoVenta(String nombre, String apellido, int edad) {
		super(nombre, apellido, edad);
		// TODO Esbozo de constructor generado automáticamente
	}

	
	@Override
	public double calcularSueldo() {
		// TODO Esbozo de método generado automáticamente
		return 400+(getVentas()*20/100);
	}


	/**
	 * @return el numeroVentas
	 */
	public double getVentas() {
		return Ventas;
	}
	
	@Override
	public String GetNombreCompleto(Empleado empleado) {

		return "Empleado de Ventas : " + empleado.getNombre() + " " + empleado.getApellido();
	}

	/**
	 * @param numeroVentas el numeroVentas a establecer
	 */
	public void setVentas(double numeroVentas) {
		this.Ventas=getVentas()+numeroVentas;
	}

	
	
}
