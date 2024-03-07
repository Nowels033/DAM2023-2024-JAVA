package arrays1;

public class P4 {

	public static void main(String[] args) {

		int[] miArray = new int[5];
		miArray[0] = 55;
		miArray[1] = 11;
		miArray[2] = -3;
		miArray[3] = 28;
		miArray[4] = 64;

		for (int num : miArray) {

			System.out.println("mi array " + num);

		}

		String[] pais = { "españa", "andorra", "italia" };

		for (String pais1 : pais) {

			System.out.println(pais1);
		}

		int[] matrizAleatorios = new int[100];

		for (int i = 0; i < matrizAleatorios.length; i++) {

			matrizAleatorios[i] = (int) Math.round(Math.random() * 100);

		}
		for (int ale : matrizAleatorios) {
			System.out.print(ale + " ");
		}

	}
}
