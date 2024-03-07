package reto5_2;

public class Jefe extends Empleado{

	//Jefes: prima, getSueldo(), getPrima()
	
	
	private double prima;

	/**
	 * @param nombre
	 * @param sueldo
	 */
	public Jefe(String nombre, double sueldo) {
		super(nombre, sueldo);
		
	}
	
	
	
	/**
	 * @return el prima
	 */
	public double getPrima() {
		return prima;
	}



	/**
	 * @param prima el prima a establecer
	 */
	public void setPrima(double prima) {
		this.prima = prima;
	}



	public double getSueldo() {
		
		return super.getSueldo()+getPrima();
	}



	@Override
	public String toString() {
		return "Jefe [Prima =" + getPrima() + ", Sueldo =" + getSueldo() + ", Nombre =" + getNombre() + "]";
	}
	
	
	
}
