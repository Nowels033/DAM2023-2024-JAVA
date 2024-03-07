package excepciones;


import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.imageio.ImageIO;

public class Excepciones1 {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente

		Scanner sc = new Scanner(System.in);

		int edad;
		boolean correcto = true;

		do {
			
			System.out.println("Introduce tu edad :");
			try {
				edad = sc.nextInt();
				correcto = true;

			} catch (InputMismatchException e) {

				System.out.println("Error en la entrada de datos");
				correcto=false;
				sc.nextLine();
			}
		} while (!correcto);
		System.out.println("FIN");

		
		Image imagen;
		
		try {
			imagen=ImageIO.read(new File("C:\\dir1\\imagen.bmp"));
		} catch (IOException e) {
			System.out.println("Imagen no encontrada");
			e.printStackTrace();
			
		}
		
	}

}
