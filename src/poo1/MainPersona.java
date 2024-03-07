package poo1;

public class MainPersona {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		
		
		
		Persona p1 = new Persona("noel","dominguez",5943232);
		Persona p2 = new Persona("rocio","dominguez",5943231);
		
		System.out.println(p1);
		System.out.println(p2);
		
		Informatico p3 = new Informatico ("noel","dominguez",456,"PROGRAMADOR");
		
		System.out.println(p3);
		
		AlumnoInformatico p4 = new AlumnoInformatico("noel", "dominguez", 456, "Tecnisian","CCC");
		
		System.out.println(p4);
		
		ProfesorInformatico p5 = new ProfesorInformatico("paco", "garcia", 123, "Base de datos", "Recreo");
		
		System.out.println(p5);
		
		
		Persona [] personas = new Persona[5];
		
		personas[0]=p1;
		personas[1]=p2;
		personas[2]=p3;
		personas[3]=p4;
		personas[4]=p5;
		
		for (int i = 0; i < personas.length; i++) {
			
			System.out.println(personas[i]);
		}
		
		
	}

}
