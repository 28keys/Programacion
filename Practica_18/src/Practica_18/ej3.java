package Practica_18;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class ej3 {

	public static void main(String[] args) {

		Scanner sc= new Scanner (System.in);
		String ruta= sc.nextLine();
		
		Path carpeta = Paths.get(ruta);
		
		if (!Files.exists(carpeta))
			System.out.println("No existe la carpeta");
		else {
			if (!Files.isDirectory(carpeta))
				System.out.println("No es un carpeta");
			else {
				
			}
		}
	}

}
