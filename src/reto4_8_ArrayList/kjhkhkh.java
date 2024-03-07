package reto4_8_ArrayList;

public class kjhkhkh {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		

			public static void main(String[] args) {

		// - Tarea 2(1) crear Clase principal CajeroEletronico con un método main de ejecución que muestre un menú de estados solicitando:

		//   - Identificador de cliente

		//   - Password de cliente

		//   tras lo que mostrará un mensaje saludando al identificador.

				Cliente[] clientes = new Cliente[5];

				clientes[0] = new Cliente("Cliente1", "A");

				clientes[1] = new Cliente("Cliente2", "B");

				clientes[2] = new Cliente("Cliente3", "C");

				clientes[3] = new Cliente("Cliente4", "D");

				clientes[4] = new Cliente("Cliente5", "E");

				Scanner sc = new Scanner(System.in);

				String cliente = "";

				String password = "";

				boolean para = true;

				System.out.println("---------------------------------------");

				System.out.println("-----------CAJERO AUTOMATICO-----------");

				System.out.println("---------------------------------------");

				System.out.println("---------------------------------------");

				for (int i = 0; i < clientes.length; i++) {

					do {

						System.out.println("INTRODUCE EL IDENTIFICADOR DE CLIENTE :");

						cliente = sc.nextLine();

						if (clientes[i].verificarIdentidicador(cliente)) {

						} else {

							System.out.println("Error: el usuario no existe");

						}

						System.out.println("---------------------------------------");

						System.out.println("INTRODUCE LA CONTRASEÑA DEL IDENTIFICADOR " + cliente + " :");

						password = sc.nextLine();

						if (clientes[i].verificarPassword(password)) {

							System.out.println("Acceso Concedido");

						} else {

							System.out.println("Error: credenciales incorrectas");

						}

					} while (para);

				}

				System.out.println("---------------------------------------");

				System.out.println("--------- SALUDOS : " + cliente + " ---------------");

				System.out.println("---------------------------------------");

			

		
	}

}
