package Ejemplos;

import java.util.Scanner;

public class EntradaDatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduce tu edad, por favor");
		
		int edad = entrada.nextInt();
		entrada.nextLine();
		
		System.out.println("Introduce tu nombre, por favor");
		String nombre_usuario = entrada.nextLine();

		System.out.println("Hola " + nombre_usuario + " tienes " + edad + " años");

		entrada.close();
	}

}