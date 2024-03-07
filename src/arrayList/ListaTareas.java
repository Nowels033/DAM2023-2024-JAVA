package arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ListaTareas {

	public static void main(String[] args) {
		
		ArrayList<String> tareasPendientes = new ArrayList <>();
		
		tareasPendientes.add("Pan");
		tareasPendientes.add("Ir al banco");
		//tareasPendientes.add("Cafe");
		tareasPendientes.remove("Pan");
		tareasPendientes.add(0,"cafe");
		System.out.println("contiene Ir al banco :"+tareasPendientes.contains("Ir al banco"));
		tareasPendientes.add("donuts");
		tareasPendientes.add("arroz");
		
		//Collections.sort(tareasPendientes);
		
		
		for (int i = 0; i < tareasPendientes.size(); i++) {
			
			System.out.println((i+1)+". "+tareasPendientes.get(i));
		}

	}

}
