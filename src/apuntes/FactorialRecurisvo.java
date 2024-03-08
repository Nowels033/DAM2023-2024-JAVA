package apuntes;

public class FactorialRecurisvo {
	public static void main(String[] args) {
        int numero = 5;
        int factorial = calcularFactorial(numero);
        System.out.println("El factorial de " + numero + " es: " + factorial);
    }

    public static int calcularFactorial(int n) {
        // Caso base: factorial de 0 es 1
        if (n == 0) {
            return 1;
        }
        // Caso recursivo: n! = n * (n - 1)!
        return n * calcularFactorial(n - 1);
    }
}
