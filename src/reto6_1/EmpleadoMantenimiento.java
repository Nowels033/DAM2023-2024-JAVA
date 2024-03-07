package reto6_1;

public class EmpleadoMantenimiento extends Empleado {

	// Los empleados de mantenimiento. Su sueldo mensual es el número de horas
	// trabajadas en el mes multiplicado por 5

	private double horasTrabajadas;

	public EmpleadoMantenimiento(String nombre, String apellido, int edad) {
		super(nombre, apellido, edad);
		// TODO Esbozo de constructor generado automáticamente
	}

	/**
	 * @return el horasTrabajadas
	 */
	public double getHorasTrabajadas() {
		return horasTrabajadas;
	}

	/**
	 * @param horasTrabajadas el horasTrabajadas a establecer
	 */
	public void setHorasTrabajadas(double horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}

	@Override
	public double calcularSueldo() {
		// TODO Esbozo de método generado automáticamente
		return getHorasTrabajadas() * 5;
	}
	
	@Override
	public String GetNombreCompleto(Empleado empleado) {

		return "Empleado de Mantenimiento : " + empleado.getNombre() + " " + empleado.getApellido();
	}

}
