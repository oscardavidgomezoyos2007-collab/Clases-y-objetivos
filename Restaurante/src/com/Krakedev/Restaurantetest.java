package com.Krakedev;

public class Restaurantetest {

	public static void main(String[] args) {
		
		
		Restastaurante v;
		
		  v = new Restastaurante();
		  
		  System.out.println("====================Restastaurante 1 : Creado========================");
		  
		  System.out.println("Año:" + v.anion);
		  System.out.println("Marca:" + v.marca);
		  System.out.println("Modelo:" + v.modelo);
		  
		  System.out.println("====================Restastaurante 1 : Menu===========================");
		  v.anion = "2023";
		  v.marca = "ASAO";
		  v.modelo = "Casi viejo";
		  
		  System.out.println("Año:" + v.anion);
		  System.out.println("Marca:" + v.marca);
		  System.out.println("Modelo:" + v.modelo);
		  
		  System.out.println("====================Restastaurante 2 : Creado========================");
		  
		  Restastaurante v2 = new  Restastaurante();
		  
		  System.out.println("Año:" + v2.anion);
		  System.out.println("Marca:" + v2.marca);
		  System.out.println("Modelo:" + v2.modelo);
		
		  System.out.println("====================Restastaurante 2 : Creado========================");
		  
		  v2.anion = "2011";
		  v2.marca = "Restaurante Casa Gangotena ";
		  v2.modelo = "El mas popular";
		  		
		  System.out.println("Año:" + v2.anion);
		  System.out.println("Marca:" + v2.marca);
		  System.out.println("Modelo:" + v2.modelo);
		  
	}

}
