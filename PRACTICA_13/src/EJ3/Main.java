package EJ3;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) {

		Alumno a1 = new Alumno("A", 10, 10, 7.8);
		Alumno a2 = new Alumno("B", 9, 6, 7);
		Alumno a3 = new Alumno("C", 0, 3, 10);
		
		  Alumno[] alumnos = { a1, a2, a3 };

	        Arrays.sort(alumnos,
	            Comparator.comparingDouble(Alumno::getNotaMedia).reversed()
	        );

	        System.out.println("Ordenados de mayor a menor:");

	        for (Alumno a : alumnos) {
	            System.out.println(a.getMatricula() + " → " + a.getNotaMedia());
	        }
	    }
	
		
		/*
		double media;

		System.out.println("La nota media del alumno 1 es: " + a1.getNotaMedia());
		System.out.println("La nota media del alumno 2 es: " + a2.getNotaMedia());
		System.out.println("La nota media del alumno 3 es: " + a3.getNotaMedia());

		media = (a1.getNotaMedia() + a2.getNotaMedia() + a3.getNotaMedia()) / 3;
		System.out.println("La media de clase es: " + media);
		*/
		
	
}