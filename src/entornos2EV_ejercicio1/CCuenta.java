package entornos2EV_ejercicio1;
public class CCuenta {

	protected String nombre;
	protected String cuenta;
	protected double saldo;
	protected double tipoInteres;

	public CCuenta() {
	}

	public CCuenta(String nom, String cue, double sal, double tipo) {
		nombre = nom;
		cuenta = cue;
		saldo = sal;
		tipoInteres = tipo;
	}

	public void ingresar(double cantidad) throws Exception {
		if (cantidad < 0) {
			throw new Exception("No se puede ingresar una cantidad negativa");
		}
		saldo = saldo + cantidad;
	}

	public void retirar(double cantidad) throws Exception {
		if (cantidad < 0) {
			throw new Exception("No se puede retirar una cantidad negativa");
		}
		if (saldo < cantidad) {
			throw new Exception("No se hay suficiente saldo");
		}
		saldo = saldo - cantidad;
	}


}