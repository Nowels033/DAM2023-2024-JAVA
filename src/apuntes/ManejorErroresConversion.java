package apuntes;

public class ManejorErroresConversion {
	public static void main(String[] args) {
        try {
            // Intentamos convertir una cadena a un número entero
            String cadena = "abc";
            int numero = Integer.parseInt(cadena);
            System.out.println("El número convertido es: " + numero);
        } catch (NumberFormatException e) {
            // Capturamos la excepción NumberFormatException (error de conversión)
            System.out.println("No se pudo convertir la cadena a un número entero.");
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
