package poo_recursivos;

import java.io.File;

public class ListadoRecursivo {

	public static void main(String[] args) {
		
		File directorio = new File ("C:\\Users\\ALUMNO CCC - TARDE\\Documents\\dir1");
		
		
		listarDirectorio(directorio);
		
		
		
		
	}
	
	static void listarDirectorio(File directorio) {
		
		
		File [] ficheros = directorio.listFiles();
		
		if (ficheros != null) {
			
			for (File fichero : ficheros) {
				
				if (fichero.isDirectory()) {
					
					System.out.println("Directorio:  "+fichero.getAbsolutePath());
					listarDirectorio(fichero);
				}
				else {
					System.out.println("Fichero : "+fichero.getAbsolutePath());
				}
				
			}
			
		}
	}

}
