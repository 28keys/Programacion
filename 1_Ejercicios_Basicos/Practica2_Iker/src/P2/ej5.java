package P2;

import java.util.Locale;
import java.util.Scanner;

public class ej5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		double base, altura;
		double areaTriangulo;
		System.out.println("Introduce base");
		base = sc.nextDouble();
		System.out.println("Introduce altura");
		altura = sc.nextDouble();

		areaTriangulo = (base * altura) / 2;

		System.out.println("El area del triangulo es : "+areaTriangulo);
	}

}
