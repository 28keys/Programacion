package ej4;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opc;
		String titulo;

		LinkedList<Prestable> prestados = new LinkedList<Prestable>();
		prestados.add(new Serie("Tom y Jerry", 12, false, "Comedia"));
		prestados.add(new Serie("Lost", 2, false, "Ciencia ficción"));
		prestados.add(new Videojuego("Buscaminas", 85, false, "Estrategia", "Microsoft"));
		prestados.add(new Videojuego("Pokemon", 50, false, "RPG & Rol", "Pokemon Company"));

		do {
			System.out.println("1.Prestar?");
			System.out.println("2.Devolver?");
			System.out.println("3.Está entregado?");
			System.out.println("4.Info");
			System.out.println("5.Salir");
			opc = sc.nextInt();
			switch (opc) {
			case 1:
				System.out.println("Introduce titulo");
				sc.nextLine();
				titulo = sc.nextLine();
				for (Prestable p : prestados) { /*
												 * Se puede usar hashmap y asi no haría falta poner getTitulo en el
												 * interface porq tendira una clave donde lo buscaria en el clase serie
												 * o videojuego
												 */

					if (p.getTitulo().equals(titulo)) {
						p.prestar();
					}
				}
				break;
			case 2:
				System.out.println("Introduce titulo");
				titulo = sc.nextLine();
				for (Prestable p : prestados) {
					if (p.getTitulo().equals(titulo)) {
						p.devolver();
					}
				}
				break;
			case 3:
				System.out.println("Introduce titulo");
				titulo = sc.nextLine();
				for (Prestable p : prestados) {
					if (p.getTitulo().equals(titulo)) {
						p.isEntregado();
					}
				}
			case 4:
				System.out.println(prestados.toString());
				break;
			}
		} while (opc != 5);

		System.out.println(prestados.toString());

	}

}





/*Tengo que usar un cast?
 * Tengo que hacer una clase padre Producit? pero entonces como hago para recorrer y llegar a los metdodos de la interfaz
 *De que forma llegoooooooooooo AAAAAAAAA 
 * 
 * 
 * */

 