package apuntes;

public class SumaRecursiva {
	public static void main(String[] args) {
        int numero = 5;
        int suma = calcularSuma(numero);
        System.out.println("La suma de los números naturales hasta " + numero + " es: " + suma);
    }

    public static int calcularSuma(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + calcularSuma(n - 1);
        }
    }
}
