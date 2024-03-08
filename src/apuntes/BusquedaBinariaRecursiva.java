package apuntes;

public class BusquedaBinariaRecursiva {
	  public static void main(String[] args) {
	        int[] arreglo = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
	        int elementoABuscar = 12;

	        int indice = busquedaBinaria(arreglo, elementoABuscar, 0, arreglo.length - 1);

	        if (indice != -1) {
	            System.out.println("El elemento " + elementoABuscar + " está en el índice " + indice + ".");
	        } else {
	            System.out.println("El elemento " + elementoABuscar + " no está en el arreglo.");
	        }
	    }

	    public static int busquedaBinaria(int[] arreglo, int elemento, int inicio, int fin) {
	        if (inicio <= fin) {
	            int medio = inicio + (fin - inicio) / 2;

	            if (arreglo[medio] == elemento) {
	                return medio;
	            }

	            if (arreglo[medio] < elemento) {
	                return busquedaBinaria(arreglo, elemento, medio + 1, fin);
	            } else {
	                return busquedaBinaria(arreglo, elemento, inicio, medio - 1);
	            }
	        }

	        return -1;
	    }
}
