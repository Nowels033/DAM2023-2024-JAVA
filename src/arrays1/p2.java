package arrays1;

import java.util.Scanner;

import javax.swing.JOptionPane;



public class p2 {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente

		String[] paises = new String[7];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < paises.length; i++) {

			System.out.println("introuduce el pais " + i);

			//paises[i] = sc.nextLine();
			
			paises[i] = JOptionPane.showInputDialog("Pais: ");
		}

		for (int i = 0; i < paises.length; i++) {

			System.out.println("pais " + i + " : " + paises[i]);

		}
		sc.close();

	}

}
