package apuntes;

public class RecursivoFibonacci {
	public static void main(String[] args) {
        int n = 10;
        System.out.println("Serie de Fibonacci hasta el término " + n + ":");
        for (int i = 0; i < n; i++) {
            System.out.print(calcularFibonacci(i) + " ");
        }
    }

    public static int calcularFibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return calcularFibonacci(n - 1) + calcularFibonacci(n - 2);
        }
    }
}
