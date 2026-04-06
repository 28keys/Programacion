package P1;

import java.util.Scanner;

public class ej7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a , b , c; // o memoria
		/*
		c = b;
		b = a;
		a = c;
		*/
		System.out.println("Introduce valor de a");
		a = sc.nextInt();
		System.out.println("Introduce valor de b");
		b = sc.nextInt();
		//tmb se puede hacer así:
		c = a;
		a = b;
		b = c;
		
		
		System.out.println("La a es : "+a); //4
		System.out.println("Y la b es: "+b); //3
	}

}
