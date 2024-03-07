package arrays1;

public class p1 {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente

		// int [] miArray = new int[5];
//		miArray [0] =55;
//		miArray [1] =11;
//		miArray [2] =-3;
//		miArray [3] =28;
//		miArray [4] =64;
//		

		// System.out.println("miArray [0] = "+miArray [3]);

		int[] miArray = { 22, 43, 64, 55, 99, 15, 33, 72, -8, 0 };

		for (int i = 0; i <= 4; i++) {

			System.out.println("miArray [+" + i + "] = " + miArray[i]);
		}
		System.out.println("la longitud de mi array es " + miArray.length);

		for (int i = 0; i < miArray.length; i++) {

			System.out.println("miArray [+" + i + "] = " + miArray[i]);
		}

	}

}
