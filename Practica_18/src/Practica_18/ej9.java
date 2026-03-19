package Practica_18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class ej9 {

	public static void main(String[] args) {
		/*
		 * 9. Programa que lista los archivos de un directorio (sólo los archivos). Para
		 * cada archivo que puede leer, imprimirá su contenido en pantalla
		 */
		
	
		
		String carpeta;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce nombre de la carpeta con su ruta");
		carpeta = sc.nextLine();
		Path carp= Paths.get(carpeta);
		if (!Files.exists(carp))
			System.out.println("La carpeta no existe");
		else {
			if(!Files.isDirectory(carp))
				System.out.println("No es una carpeta");
		
			else {
				try {
					if (Files.isDirectory(carp)) {
						DirectoryStream<Path> stream = Files.newDirectoryStream(carp);
						for (Path archivo : stream) {
						System.out.println(archivo.getFileName());
					    if (Files.isRegularFile(archivo)) {
							System.out.println("ES UN ARCHIVO, SU CONTENIDO: ");
							
							Charset charset = Charset.forName("UTF-8");
							BufferedReader reader = null;
							reader = Files.newBufferedReader(archivo, charset);
							String linea = null;
							while ((linea = reader.readLine()) != null) {
								System.out.println(linea);
							}
					
						reader.close();
					   }
				       }

			        }
		} catch (IOException x) {
			System.err.format("IOException: %s%n", x);
			}
		}
	} 	

}

}
