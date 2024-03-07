package poo3_interfaces;

public class Rectangulo implements Forma{

	private double base;
	private double altura;
	
	
	/**
	 * @param base
	 * @param altura
	 */
	public Rectangulo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}

	@Override
	public double calcularArea() {
		
		return base*altura;
	}

	@Override
	public double calcularPerimetro() {
		
		return 2*(base+altura);
	}

}
