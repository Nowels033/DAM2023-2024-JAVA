package arrays1;

public class ArraisBidimensionales {

	public static void main(String[] args) {

		// int [] temperaturas = new int [31];
//		int [] temperaturas =  {1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7,8,9,0,1};
//		
//		for (int i = 0; i < args.length; i++) {
//			
//			System.out.println(temperaturas[i]);
//			
//		}

		int[][][] temperaturas = new int [12][31][24];

		temperaturas[0][0] [0]= 2;
		System.out.println("meses "+temperaturas.length+" dias " + temperaturas[0].length + " horas : " + temperaturas[0][0].length);

//		for (int k = 0; k < temperaturas.length; k++) {
//
//			for (int i = 0; i < temperaturas[0].length; i++) {
//
//				for (int j = 0; j < temperaturas[0][0].length; j++) {
//
//					System.out.print("mes "+(k+1)+" |dias " + (i + 1) + " |horas : " + j + "||");
//
//				}
//				System.out.println();
//
//			}
//			
//		}

	}

}
