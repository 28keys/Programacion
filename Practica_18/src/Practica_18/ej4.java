package Practica_18;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class ej4 {

	public static void main(String[] args) {
		/*
		 * 4. Modifica el programa anterior para que sólo borre los ficheros que
		 * empiecen por una letra anotada desde teclado
		 */

		String letra;
		String nombre;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce ruta de la carpeta");
		String ruta = sc.nextLine();

		Path carpeta = Paths.get(ruta);

		if (!Files.exists(carpeta))
			System.out.println("No existe la carpeta");
		else {
			if (!Files.isDirectory(carpeta))
				System.out.println("No es un carpeta");
			else {
				System.out.println("Introduce la primera letra de los archivos a borrar: ");
				letra = sc.nextLine();
				// Recorro la carpeta
				try {
					DirectoryStream<Path> stream = Files.newDirectoryStream(carpeta);
					for (Path path : stream) {
						if (!Files.isDirectory(path)) {
							nombre = path.getFileName().toString(); // Saco el nombre del archivo
							if (nombre.toLowerCase().startsWith(letra.toLowerCase())) { // Compruebo si empieza por la
																						// letra introducida // letra
																						// introducida
								Files.delete(path);
								System.out.println("Archivo borrado");
							}

						}
					}
					stream.close();

				} catch (IOException e) {
					System.out.println(e);

				}

			}
		}
	}

}
