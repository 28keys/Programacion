package Practica_18;

import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class ej9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String carpeta;
		Scanner sc = new Scanner(System.in);

		
		System.out.println("Introduce el nombre de la carpeta");
		carpeta = sc.nextLine();
		Path carp = Paths.get(carpeta);
		if (!Files.exists(carp))
			System.out.println("No existe esa carpeta");
		else {
			if (!Files.isDirectory(carp))
				System.out.println("No es una carpeta");
			else {
				try {
					DirectoryStream<Path> stream = Files.newDirectoryStream(carp);
					for (Path path : stream) {
						System.out.println(path.getFileName().toString()+"-----");
					}
				}
				
				
				
			}
		}
				
		
		
		
		
		
		
		
		
		
		
	}
}