package reto6_1;

public class EmpleadoProduccion extends Empleado{
	//Los empleados de producción. Su sueldo mensual es el número de unidades producidas en el mes multiplicado por 5
	
	private int unidadesProducidas;
	
	public EmpleadoProduccion(String nombre, String apellido, int edad) {
		super(nombre, apellido, edad);
		// TODO Esbozo de constructor generado automáticamente
	}

	@Override
	public double calcularSueldo() {
		// TODO Esbozo de método generado automáticamente
		return getUnidadesProducidas()*5;
	}

	/**
	 * @return el unidadesProducidas
	 */
	public int getUnidadesProducidas() {
		return unidadesProducidas;
	}

	/**
	 * @param unidadesProducidas el unidadesProducidas a establecer
	 */
	public void setUnidadesProducidas(int unidadesProducidas) {
		this.unidadesProducidas = getUnidadesProducidas()+unidadesProducidas;
	}

	@Override
	public String GetNombreCompleto(Empleado empleado) {

		return "Empleado de Producción : " + empleado.getNombre() + " " + empleado.getApellido();
	}
	
}
