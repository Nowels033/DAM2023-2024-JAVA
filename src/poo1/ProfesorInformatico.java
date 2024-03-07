package poo1;

public class ProfesorInformatico extends Informatico{
	
	private String asignatura;

	public ProfesorInformatico(String nombre, String apellidos, int identificacion, String especialidad,
			String asignatura) {
		super(nombre, apellidos, identificacion, especialidad);
		this.asignatura = asignatura;
	}

	/**
	 * @return el asignatura
	 */
	public String getAsignatura() {
		return asignatura;
	}

	/**
	 * @param asignatura el asignatura a establecer
	 */
	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}

	@Override
	public String toString() {
		return "ProfesorInformatico [getAsignatura()=" + getAsignatura() + ", toString()=" + super.toString() + "]";
	}

	
	
	
	

}
