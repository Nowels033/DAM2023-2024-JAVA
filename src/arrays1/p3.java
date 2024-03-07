package arrays1;

public class p3 {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente

		int   [] matrizAleatorios = new int [100];
		
		for (int i =0; i< matrizAleatorios.length;i++) {
			
			matrizAleatorios[i] = (int) Math.round(Math.random()*100);
		}
		
		for (int i =0; i< matrizAleatorios.length;i++) {
			
			System.out.print(matrizAleatorios[i]+" ");
		}
		
		
		
		
		
	}

}
