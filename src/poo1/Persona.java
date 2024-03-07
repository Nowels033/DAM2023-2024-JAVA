package poo1;

public class Persona {
	
	private String nombre;
	private String apellidos;
	private int identificacion;
	
	
	
	public Persona(String nombre, String apellidos, int identificacion) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.identificacion = identificacion;
	}
	
	
	
	public Persona() {
		super();
		// TODO Esbozo de constructor generado automáticamente
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
	 * @return el apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}
	/**
	 * @param apellidos el apellidos a establecer
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	/**
	 * @return el identificacion
	 */
	public int getIdentificacion() {
		return identificacion;
	}
	/**
	 * @param identificacion el identificacion a establecer
	 */
	public void setIdentificacion(int identificacion) {
		this.identificacion = identificacion;
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", identificacion=" + identificacion + "]";
	}
	
	
	
	

}
