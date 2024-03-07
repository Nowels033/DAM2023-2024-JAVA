package ejercicio1_Reto_Recursivo;

public class RecursivoNumerosNaturales {
	public static int sumaNaturales(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + sumaNaturales(n - 1);
        }
    }

    public static void main(String[] args) {
        int num = 10;
        System.out.println("La suma de los primeros " + num + " números naturales es: " + sumaNaturales(num));
    }
}
