package ejercicio1_Reto_Recursivo;

public class CalculoDePotencia {

	
//		Cálculo de la Potencia:
//		Un método recursivo para calcular la potencia de un número base elevado a un exponente:
	
	
	 public static double potencia(double base, int exponente) {
	        if (exponente == 0) {
	            return 1;
	        } else if (exponente > 0) {
	            return base * potencia(base, exponente - 1);
	        } else {
	            return (1 / base) * potencia(base, exponente + 1);
	        }
	    }

	    public static void main(String[] args) {
	        double base = 2;
	        int exponente = 3;
	        System.out.println(base + " elevado a la " + exponente + " es: " + potencia(base, exponente));

	    }
	    
	   
	
}
