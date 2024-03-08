package apuntes;

public class ManejoErrores {
	public static void main(String[] args) {
        try {
            // Código que puede lanzar una excepción
            int resultado = dividir(10, 0);
            System.out.println("El resultado de la división es: " + resultado);
        } catch (ArithmeticException e) {
            // Manejo de la excepción ArithmeticException (división por cero)
            System.out.println("Error: División por cero");
            e.printStackTrace(); // Esto muestra la traza del error en la consola
        } catch (Exception e) {
            // Manejo de cualquier otra excepción no capturada anteriormente
            System.out.println("Se ha producido un error inesperado:");
            e.printStackTrace();
        } finally {
            // Bloque finally, se ejecutará siempre, ocurra o no una excepción
            System.out.println("Finalizando programa...");
        }
    }

    public static int dividir(int numerador, int denominador) {
        return numerador / denominador;
    }
}
