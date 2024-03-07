package clase;

import java.util.Scanner;

public class AlumnoDamNotas {
	
	public static void main(String[] args) {
		
		final int NUM_ALUMNOS=4;
		final int NUM_ASIGNATURAS=3;
		
		
		Scanner sc = new Scanner(System.in);
		
		String nombre;
		
		AlumnoDam [] alumnos =new AlumnoDam[NUM_ALUMNOS];
		
		alumnos[0] = new AlumnoDam("noel");
		
		
		
		for (int i = 0; i < NUM_ALUMNOS; i++) {
			
			
			
			System.out.println("NOMBRE DEL ALUMNO :");
			alumnos[i]= new AlumnoDam(sc.nextLine());
			alumnos[i].notas=new int [NUM_ASIGNATURAS];
			
			for (int j = 0; j < NUM_ASIGNATURAS; j++) {
				
				System.out.println("NOTAS DEL ALUMNO :"+alumnos[i].nombre);
				alumnos[i].notas[j]=sc.nextInt();
				
			}
			sc.nextLine();
			
		}
		
		for (AlumnoDam alu: alumnos) {
			
			System.out.println("NOTAS DE :"+alu.nombre);
			
			for (int i = 0; i < NUM_ASIGNATURAS; i++) {
				
				System.out.print(alu.notas[i] +" ");
				
			}
			System.out.println();
		}
		
	}

}
