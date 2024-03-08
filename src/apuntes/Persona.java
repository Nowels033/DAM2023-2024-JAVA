package apuntes;

class Persona implements Comparable<Persona> {
    private String nombre;
    private int edad;
    
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public int getEdad() {
        return edad;
    }
    
    @Override
    public String toString() {
        return nombre + " - Edad: " + edad;
    }
    
    @Override
    public int compareTo(Persona otraPersona) {
        // Comparamos las edades para la ordenación
        return Integer.compare(this.edad, otraPersona.getEdad());
    }
    
//    @Override
//    public int compareTo(Persona otraPersona) {
//        // Comparamos los nombres para la ordenación
//        return this.nombre.compareTo(otraPersona.getNombre());
//    }
    
//    @Override
//    public int compareTo(Persona otraPersona) {
//        // Comparamos las notas para la ordenación
//        return Integer.compare(otraPersona.getNota(), this.nota);
//    }
}