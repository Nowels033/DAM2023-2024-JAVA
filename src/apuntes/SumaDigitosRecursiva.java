package apuntes;

public class SumaDigitosRecursiva {
	public static void main(String[] args) {
        int numero = 12345;
        int suma = sumaDigitos(numero);

        System.out.println("La suma de los dígitos de " + numero + " es: " + suma);
    }

    public static int sumaDigitos(int num) {
        if (num < 10) {
            return num;
        } else {
            return num % 10 + sumaDigitos(num / 10);
        }
    }
}
