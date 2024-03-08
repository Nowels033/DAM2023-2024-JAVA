package apuntes;

public class RecursivoMaximoComunDivisor {

    public static void main(String[] args) {
        int num1 = 48;
        int num2 = 36;

        int mcd = calcularMCD(num1, num2);

        System.out.println("El MCD de " + num1 + " y " + num2 + " es: " + mcd);
    }

    public static int calcularMCD(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return calcularMCD(b, a % b);
        }
    }
}
