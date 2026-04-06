package Curso;

import java.util.*;

public class CondicionalIf_1 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduce tu edad, por favor ");

		int edad = entrada.nextInt();

		if (edad <= 18) System.out.println("Eres muy joven");
		
		else if (edad <= 35) System.out.println("Eres joven");
		
		else if (edad <= 60) System.out.println("Eres maduro");
		
		else if (edad <= 90) System.out.println("Cuídate");
		
		else System.out.println("Dónde vas con esas edad !!");
		
		

	}

}
