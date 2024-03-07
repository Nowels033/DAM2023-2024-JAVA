package poo2;

public class Jefatura extends Empleado implements Jefes{

	private double incentivo;

	/**
	 * @param nombre
	 * @param sueldo
	 * @param anno
	 * @param mes
	 * @param dia
	 */
	public Jefatura(String nombre, double sueldo, int anno, int mes, int dia) {
		super(nombre, sueldo, anno, mes, dia);
		// TODO Esbozo de constructor generado automáticamente
	}

	/**
	 * @return el incentivo
	 */
	public double getIncentivo() {
		return incentivo;
	}

	/**
	 * @param incentivo el incentivo a establecer
	 */
	public void setIncentivo(double incentivo) {
		this.incentivo = incentivo;
	}
	
	public double getSueldo() {
		double sueldoJefe=super.getSueldo();
		
		return sueldoJefe+incentivo;
	}

	@Override
	public String tomarDecisiones(String decision) {
		
		return "El jefe toma la de decision de "+decision;
	}

	@Override
	public double establecerBonus(double gratificacion) {
		double prima=2000;
		return Trabajadores.bonusBase+gratificacion+prima;
	}

	
}
