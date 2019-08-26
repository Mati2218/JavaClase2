package com.senati.ddw04;



public class Implementopersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Persona gerente = new Persona(1, "Alfredo", "Gallardo","masculino","03/12/2000");

		System.out.println("GERENTE");
		System.out.println(gerente.toString());
		
		
		
		Persona obrero = new Persona(1, "Daniel", "Ramos", "masculino", "22/09/2000");
		
		
		System.out.println("OBRERO");
		System.out.println(obrero.toString());
		
		
		

		Persona obrero1 = new Persona(2, "Jeampier", "Matos", "masculino", "22/09/2000");
		
		
		System.out.println("OBRERO");
		System.out.println(obrero1.toString());
		
		

		Persona obrero2 = new Persona(3, "Carla", "More", "femenino", "20/09/2000");
		
		
		System.out.println("OBRERO");
		System.out.println(obrero2.toString());
		
		
		
		
		

		Persona obrero3 = new Persona(4, "Wilmer", "Rivas", "masculino", "15/07/2000");
		
		System.out.println("DOBRERO");
		System.out.println(obrero3.toString());
		
		
		
		
		

	}

}