package apuntes;

public class ManejoErroresBuclesArray {
	public static void main(String[] args) {
        // Array de números
        int[] numeros = { 4, 8, 15, 16, 23, 42 };

        try {
            // Iteramos sobre el array y realizamos alguna operación
            for (int i = 0; i <= numeros.length; i++) {
                System.out.println("Número en la posición " + i + ": " + numeros[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            // Capturamos la excepción ArrayIndexOutOfBoundsException (índice fuera de rango)
            System.out.println("Se ha excedido el límite del array.");
            e.printStackTrace();
        } catch (Exception e) {
            // Capturamos cualquier otra excepción no esperada
            System.out.println("Se ha producido un error inesperado:");
            e.printStackTrace();
        } finally {
            // Bloque finally para realizar acciones de limpieza o finalización
            System.out.println("Finalizando el programa...");
        }
    }
}
