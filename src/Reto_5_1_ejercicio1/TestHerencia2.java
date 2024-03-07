package Reto_5_1_ejercicio1;

import java.time.LocalDate;

public class TestHerencia2 {

	public static void main(String[] args) {
		
		
		ProductoCongelado p1 = new ProductoCongelado(LocalDate.now(), 1, 32);
		ProductoFresco p2 = new ProductoFresco(LocalDate.now(),2,LocalDate.now(),"España");
		ProductoRefrigerado p3 = new ProductoRefrigerado(LocalDate.now(), 3, 123456);
		
		Producto[] productos = new Producto[3];
		
		productos[0]=p1;
		productos[1]=p2;
		productos[2]=p3;
		
		
		for (int i = 0; i < productos.length; i++) {
			
			System.out.println(productos[i]);
		}
	}

}
