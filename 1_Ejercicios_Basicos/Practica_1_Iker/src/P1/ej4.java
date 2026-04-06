package P1;

import java.util.Scanner;

public class ej4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double pi = 3.1416;
		double radio;
		double calcularLongitud;
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce radio a elegir");
		radio = sc.nextDouble();
		
		calcularLongitud = 2 * pi * radio;
		System.out.println("La longitud de la circunferencia es "+ calcularLongitud);
		
		
		
		
	}

}
