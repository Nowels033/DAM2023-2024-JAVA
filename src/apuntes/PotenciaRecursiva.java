package apuntes;

public class PotenciaRecursiva {
	public static void main(String[] args) {
        int base = 3;
        int exponente = 4;

        int resultado = calcularPotencia(base, exponente);

        System.out.println(base + " elevado a la " + exponente + " es: " + resultado);
    }

    public static int calcularPotencia(int base, int exponente) {
        if (exponente == 0) {
            return 1;
        } else {
            return base * calcularPotencia(base, exponente - 1);
        }
    }
}
