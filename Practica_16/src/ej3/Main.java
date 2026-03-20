package ej3;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int cantidad, opc, tipo;
		String nombre;
		double saldoCuenta;
		LinkedList<Cuenta> cuentas = new LinkedList<Cuenta> ();
		Scanner sc= new Scanner (System.in);
		do {
		System.out.println("1./Dar de alta, 2./Borrar cuentas, 3./Días, 4./Sorteo de un viaje, 5./Salir");
		opc = sc.nextInt();
		switch (opc) {
		case 1:
			System.out.println("1./Cuenta o 2./Cuenton ?");
			tipo = sc.nextInt();
			System.out.println("¿Numero de titulares?(1,2 o 3)");
			cantidad = sc.nextInt();
				for (int i = 0; i < cantidad ; i++) {
					System.out.println("Introduce nombre del titular");
					nombre = sc.nextLine();
					System.out.println("Introduce saldo");
					saldoCuenta= sc.nextDouble();
					Cuenta 
				}
		
	
				
		}
		} while (opc !=5); 
			
	
			
	}

}
