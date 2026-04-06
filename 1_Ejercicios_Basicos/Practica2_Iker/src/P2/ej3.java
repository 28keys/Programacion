package P2;

import java.util.Locale;
import java.util.Scanner;

public class ej3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		double importe;
		double nuevoImporte;
		double descuento = Math.random();
		double descuentoR = Math.round(descuento * 100.0) / 100.0;
		System.out.println("Introduce tu importe");
		importe = sc.nextDouble();
		System.out.println("El descuento de hoy va a ser de : " + descuentoR);

		nuevoImporte = importe * descuentoR;
		System.out.println("Tu nuevo importe con el descuento " + descuentoR + " dado, es de " + nuevoImporte);

		/*
		 * Yo lo he hecho así porque quería que el descuento sea random pero lo unico
		 * que no he podido dejarlo en 2 decimales
		 */
	}

}
