package Examen1;

public class Examen1 {
	
	public static void billetesViajeros(int codViajero,String nombre,String apellido,int edad,String origen,String destino) {
		if (codViajero>=1&&codViajero<=199999&&nombre.length() <=15 &&apellido.length()<=15&&(origen.equalsIgnoreCase("sevilla")||origen.equalsIgnoreCase("barcelona")||origen.equalsIgnoreCase("Madrid"))&&destino.equalsIgnoreCase("sevilla")||destino.equalsIgnoreCase("barcelona")||destino.equalsIgnoreCase("Madrid"));
		int precio;	
		int descuento;
		if(edad<=3) {
			precio=0;
		}
		if(edad<18&& edad >=4) {
			
		 if (origen.equalsIgnoreCase("madrid")&&destino.equalsIgnoreCase("sevilla")) {
			 
			 
			 System.out.println(" TIENES QUE PAGAR 15 €");
			 
			
		}
		 if(origen.equalsIgnoreCase("madrid")&&destino.equalsIgnoreCase("barcelona")) {
			System.out.println("TIENES QUE PAGAR 22,5 €"); 
		 }
		 
		 if(origen.equalsIgnoreCase("sevilla")&&destino.equalsIgnoreCase("barcelona")) {
			 System.out.println("TIENES QUE PAGAR 27,5 €");
		 }
		}
			
		
		else if(codViajero <=0 &&codViajero>199999 ) {
			System.out.println("ERROR EN CODVIAJERO");
		}
		
		else if(nombre.length()>15||nombre.length()==0) {
			System.out.println("ERROR EN EL NOMBRE");
		}
		
		else if(apellido.length()>15||apellido.length()==0) {
			System.out.println("ERROR EN EL APELLIDO");
		}
		else if(edad<0||edad>99) {
			System.out.println("ERROR EN LA EDAD");
		}
		
		else if(!origen.equalsIgnoreCase("madrid")||!origen.equalsIgnoreCase("sevilla")||!origen.equalsIgnoreCase("barcelona") ){
			System.out.println("ERROR EN EL ORIGEN");
		}
		else if(!destino.equalsIgnoreCase("madrid")||!destino.equalsIgnoreCase("sevilla")||!destino.equalsIgnoreCase("barcelona") ){
			System.out.println("ERROR EN EL ORIGEN");
		}
	}

}
