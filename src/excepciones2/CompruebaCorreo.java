package excepciones2;

import java.io.IOException;

import javax.swing.JOptionPane;

public class CompruebaCorreo {

	public static void main(String[] args) {

		String correo = JOptionPane.showInputDialog("Introducir correo-e");

		try {
			compruebaCorreo(correo);
		} catch (LongitudCorreoErroneaException e) {
			
			e.printStackTrace();
		}

	}

	static void compruebaCorreo(String correo)throws LongitudCorreoErroneaException {

		int arroba = 0;
		boolean punto = false;

		if (correo.length() <= 3) {
			
//			Exception miExcepion = new Exception();
//			throw miExcepion;
			
			throw new LongitudCorreoErroneaException("LONGITUD DE CORREO ERRONEA");

		}

		for (int i = 0; i < correo.length(); i++) {

			if (correo.charAt(i) == '@') {

				arroba++;
			}

			if (correo.charAt(i) == '.') {

				punto = true;
			}

		}

		if (arroba == 1 && punto) {

			System.out.println("Correo electronico-e :" + correo + " Correcto");

		} else {

			System.out.println("CORREO : " + correo + " INCORRECTO");
			throw new LongitudCorreoErroneaException("REVISA LAS @'s Y PUNTOS");
		}

	}
	
	

}

class LongitudCorreoErroneaException extends RuntimeException{
	
	public LongitudCorreoErroneaException() {
		
		
	}
	
	public LongitudCorreoErroneaException(String mensaje) {
		
		super(mensaje);
	}
}
