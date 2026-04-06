package P2;

import java.util.Locale;
import java.util.Scanner;

public class ej6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*6. Programa que lee el precio de tarifa de un producto y el precio final pagado por
		el mismo y nos calcula el descuento (%) realizado*/
		Scanner sc = new Scanner (System.in);
		sc.useLocale(Locale.US);
		int opc;
		double tarifa;
		double descuento;
		System.out.println("Introduce tarifa");
		tarifa = sc.nextDouble();
		System.out.println("La tarifa de Disney plus es de: "+tarifa+"€");
		
		do {
		System.out.println("¿Que descuento deseas aplicar?");
		System.out.println("1 = 10%");
		System.out.println("2 = 20%");
		System.out.println("3 = 30%");
		System.out.println("4 = 40%");
		System.out.println("5 = 50%");
		System.out.println("6 = 60%");
		System.out.println("7 = 70%");
		System.out.println("8 = 80%");
		System.out.println("9 = 90%");
		System.out.println("10 = 100%");
		System.out.println("11 = SALIR");
		opc = sc.nextInt();
		
		switch (opc) {
		case 1:
			descuento = tarifa * 0.10;
			System.out.println("Precio final :"+ descuento);
			break;
		case 2:
			descuento = tarifa * 0.20;
			System.out.println("Precio final :"+ descuento);
			break;
		case 3:
			descuento = tarifa * 0.30;
			System.out.println("Precio final :"+ descuento);
			break;
		case 4:
			descuento = tarifa * 0.40;
			System.out.println("Precio final :"+ descuento);
			break;
		case 5:
			descuento = tarifa * 0.50;
			System.out.println("Precio final :"+ descuento);
			break;
		case 6:
			descuento = tarifa * 0.60;
			System.out.println("Precio final :"+ descuento);
			break;
		case 7:
			descuento = tarifa * 0.70;
			System.out.println("Precio final :"+ descuento);
			break;
		case 8:
			descuento = tarifa * 0.80;
			System.out.println("Precio final :"+ descuento);
			break;
		case 9:
			descuento = tarifa * 0.90;
			System.out.println("Precio final :"+ descuento);
			break;
		case 10:
			descuento = tarifa * 1.00;
			System.out.println("Precio final :"+ descuento);
			break;
		}
	} while (opc !=11);
	
	}

}
