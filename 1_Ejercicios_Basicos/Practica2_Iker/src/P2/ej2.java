package P2;

import java.util.Scanner;

public class ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1, n2;
		int opc;
		int suma = 0, resta = 0, producto = 0 ,modulo = 0;
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce el numero 1");
		n1 = sc.nextInt();
		System.out.println("Introduce el numero 2");
		n2 = sc.nextInt();
		
		do {
		System.out.println("------------");
		System.out.println(" 1 = ¿Sumar?");
		System.out.println(" 2 = ¿Restar?");
		System.out.println(" 3 = ¿Producto?");
		System.out.println(" 4 = ¿Módulo?");
		System.out.println(" 5 = Salir");
		System.out.println("------------");
		opc = sc.nextInt();
		
		
			switch (opc) {
			case 1:
				suma = n1 + n2;
				System.out.println("El valor de la suma es: "+suma);
			break;
			
			case 2:
				resta = n1 - n2;
				System.out.println("El valor de la resta es: "+resta );
				break;
				
			case 3:
				producto = n1 * n2;
				System.out.println("El valor del producto es :"+producto);
				break;
				
			case 4:
				modulo = n1 % n2;
				System.out.println("El valor del modulo es: "+modulo);
				break;
			}
		} while (opc !=5);
		System.out.println("Suma = "+suma+" Resta = "+resta+" Producto = "+producto+" Modulo = "+modulo);
	}

}
