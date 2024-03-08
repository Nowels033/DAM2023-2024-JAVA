package apuntes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EjemploSortCompare {
    public static void main(String[] args) {
        // Creamos una lista de personas
        List<Persona> personas = new ArrayList<>();
        
        // Añadimos algunas personas a la lista
        personas.add(new Persona("Juan", 25));
        personas.add(new Persona("María", 30));
        personas.add(new Persona("Carlos", 20));
        
        // Mostramos la lista sin ordenar
        System.out.println("Lista de personas sin ordenar:");
        for (Persona persona : personas) {
            System.out.println(persona);
        }
        
        // Ordenamos la lista de personas por edad
        Collections.sort(personas);
        
        // Mostramos la lista ordenada
        System.out.println("\nLista de personas ordenada por edad:");
        for (Persona persona : personas) {
            System.out.println(persona);
        }
    }
}

