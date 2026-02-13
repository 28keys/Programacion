package Ej1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		//1.Crear un satelite
		
		Satelite s1  = new Satelite (1000,20,30); 
	
		//2. Comprobar si está en orbita
		
		if(s1.estaEnOrbita()) {
			System.out.println("El satélite está en órbita");
		}	else { 
				System.out.println("El satélite no está en orbita");
		}
		
		//3. Cmabiar la altura
		s1.variarAltura(1200);
		
		//4. Cambiar la posición
		
		s1.variarPosicion(40,50);

		 System.out.println("Altura final: " + 1200);
	     System.out.println("Meridiano final: 40");
	     System.out.println("Paralelo final: 50");
		
	
	
		
		
		
	}

}
