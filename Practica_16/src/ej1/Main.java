package ej1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList <Libro> libreria = new ArrayList <>();
		libreria.add(new Libro("El hobbit", "J.R Tolkien","Alfaguara", 30));
		libreria.add(new Texto ("Programacion", "Felix Gómez", "Mac Grawn", 38, "DAW1",10));
		Scanner sc= new Scanner (System.in);
	
		Iterator<Libro> it = libreria.iterator();
		
		while(it.hasNext()) {
			Libro l=it.next();
			System.out.println(l);
		}
		
		System.out.println("Anota precio");
		double precio = sc.nextDouble();
		
		for(Libro l: libreria) {
			if(l.getPrecio()<precio)
				System.out.println(l);
			
			
			
		}
	}

}
