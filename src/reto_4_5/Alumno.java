package reto_4_5;

import java.time.LocalDate;
import java.util.Arrays;

public class Alumno {
	
//	Crear una clase Alumnos que tenga :
//
//		Atributos:
//
//		o Nombre
//		o Apellido
//		o Fecha de nacimiento
//		o Notas: array de 3 notas (inglés, francés, alemán)
//
//
//		Constructor de 3 parámetros (los tres primeros) y de 0 parámetros
//		Métodos toString() y calcularMedia()
//		Métodos setNotaIngles(), setNotaFrances(), setNotaAleman(). En los tres casos se pasa la nota como parámetro.


	
 String nombre;
 String apellido;
 LocalDate fechaNacimiento;
 int [] notas = new int [3];  
 String[] asignatura = {"ingles","frances","aleman"};
 
 
 Object [][] prueba;
 
 public Alumno(String nombre,String apellido,LocalDate fechaNacimiento){
	 ;
	 
	 this.nombre=nombre;
	 this.apellido=apellido;
	 this.fechaNacimiento=fechaNacimiento;
	 //this.notas= 
	 
	 
 }
 
public Alumno(){
	 

 }

public static int calcularMedia(Alumno alumno) {
	int suma=0;
	
	for (int i = 0; i < alumno.notas.length; i++) {
		
		suma += alumno.notas[i];
	}
	
	return suma/alumno.notas.length;
	
	
	
}

public static void setNotaIngles(Alumno alumno,int nota) {
	
	alumno.notas[0]=nota;
	
	

}
public static void setNotaFrances(Alumno alumno,int nota) {
	
	alumno.notas[1]=nota;

}
public static void setNotaAleman(Alumno alumno,int nota) {
	
	
	alumno.notas[2]=nota;

}



@Override
public String toString() {
	return "Alumno [Nombre=" + nombre + ", Apellido=" + apellido + ", Fecha de Nacimiento=" + fechaNacimiento + 
			", Notas de Ingles,Frances y Aleman="+ Arrays.toString(notas) + "]";
}


	
	
}
