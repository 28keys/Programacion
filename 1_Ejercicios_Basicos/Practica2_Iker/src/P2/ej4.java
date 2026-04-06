package P2;

import java.util.Scanner;

public class ej4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int notas;
		double nota, cont = 0;
		double media;
		System.out.println("Introduce la cantidad de notas");
		notas = sc.nextInt();

		for (int i = 0; i < notas; i++) {
			System.out.println("Introduce la nota: " + i + " para la nota numero " + i);
			nota = sc.nextDouble();
			cont = cont + nota;

		}
		media = cont / notas;
		System.out.println("La media es de :" + media);

	}

}
