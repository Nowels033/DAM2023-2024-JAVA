package poo1;

public class Informatico extends Persona{
	
	 private String especialidad;

	public Informatico(String nombre, String apellidos, int identificacion, String especialidad) {
		super(nombre, apellidos, identificacion);
		this.especialidad = especialidad;
	}

	/**
	 * @return el especialidad
	 */
	public String getEspecialidad() {
		return especialidad;
	}

	/**
	 * @param especialidad el especialidad a establecer
	 */
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	@Override
	public String toString() {
		return "Informatico [getEspecialidad()=" + getEspecialidad() + ", getNombre()=" + getNombre()
				+ ", getApellidos()=" + getApellidos() + ", getIdentificacion()=" + getIdentificacion() + "]";
	}
	
	

	
	
	

}
