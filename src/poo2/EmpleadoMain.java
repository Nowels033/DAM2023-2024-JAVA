package poo2;

import java.util.Arrays;

public class EmpleadoMain {

	public static void main(String[] args) {

		Empleado e1 = new Empleado("noel", 2000, 2000, 03, 04);
		Empleado e2 = new Empleado("Brayan", 1000, 2000, 03, 04);
		Empleado e3 = new Empleado("Pablo", 5000, 2000, 03, 04);
		Empleado e4 = new Empleado("Moises");
		Jefatura j1 = new Jefatura("Jefe",3000,2002,2,2);

		Empleado[] empleados = new Empleado[5];

		empleados[0] = e1;
		empleados[1] = e2;
		empleados[2] = e3;
		empleados[3] = e4;
		empleados[4] = j1;

		j1.setIncentivo(1000);
		
		for (Empleado e : empleados) {
			
			if (e instanceof Empleado) {
				
			}
			System.out.println(e);
		}

		for (int i = 0; i < empleados.length; i++) {

			empleados[i].subeSueldo(5);

		}
		
		System.out.println("------------------------------------------------------------------------------");

		for (Empleado e : empleados) {

			System.out.println(e);
		}
		
		System.out.println("-------------------------------------------------------------------------------");
		
		Arrays.sort(empleados);
		
		for (Empleado e : empleados) {

			System.out.println(e);
		}
		
		System.out.println("----------------------------------------------------------------------------------");
		
//		System.out.println(j1.getNombre()+" toma la decision de : "+j1.tomarDecisiones("dar mas dias de vacaciones"));
//		System.out.println("---------------------------------------------------------------------------------");
//		System.out.println("el jefe : "+j1.getNombre()+" tiene un bonus de "+j1.establecerBonus(500));
//		System.out.println(empleados[3].getNombre()+" tiene un bonus de "+empleados[3].establecerBonus(1000));
//		
		for (Empleado empleado : empleados) {
			
			System.out.println(empleado.getNombre()+" tiene un bonus de "+empleado.establecerBonus(1000));
		}
	}

}
