package P1;

import java.util.Locale;
import java.util.Scanner;

public class ej5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		final double pi = 3.1416;
		double radio;
		double calcularLongitud;

		System.out.println("Introduce radio a elegir");
		radio = sc.nextDouble();

		calcularLongitud = 2 * pi * radio;
		System.out.println("El area de la circunferencia es de " + calcularLongitud);

	}

}
