package poo1;

public class AlumnoInformatico extends Informatico {
	
	private String centro;

	public AlumnoInformatico(String nombre, String apellidos, int identificacion, String especialidad, String centro) {
		super(nombre, apellidos, identificacion, especialidad);
		this.centro = centro;
	}

	/**
	 * @return el centro
	 */
	public String getCentro() {
		return centro;
	}

	/**
	 * @param centro el centro a establecer
	 */
	public void setCentro(String centro) {
		this.centro = centro;
	}

	@Override
	public String toString() {
		return "AlumnoInformatico [getCentro()=" + getCentro() + ", toString()=" + super.toString() + "]";
	}

	
	
	
	
	
	

}
