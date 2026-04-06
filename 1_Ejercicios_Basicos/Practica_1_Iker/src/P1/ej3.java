package P1;

import java.util.Locale;
import java.util.Scanner;

public class ej3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double n1;
		double n2;
		Scanner sc = new Scanner(System.in); 
		System.out.println("Introduce numero 1");
		n1 = sc.nextDouble();
		System.out.println("Introduce numero 2");
		n2 = sc.nextDouble();
		double resultado = n1+ n2;
		System.out.println(n1+" + "+n2+"= "+resultado);
	}

}
