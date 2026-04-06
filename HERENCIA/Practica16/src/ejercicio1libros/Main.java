package ejercicio1libros;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Libro> libreria=new ArrayList<>();
		libreria.add(new Libro("El hobbit","J.R. Tolkien","Alfaguara",30));
		libreria.add(new Texto("Programacion","Felix Gómez","Mac Grawn",38,"DAW1",10));
		
		Iterator<Libro> it=libreria.iterator();
		
		while(it.hasNext()) {
			Libro l=it.next();
			System.out.println(l);
		}

	}

}
