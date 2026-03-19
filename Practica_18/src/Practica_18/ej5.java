package Practica_18;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class ej5 {
	public static void main(String[] args) {
		/*
		 * 5. Programa que acepta el nombre de una carpeta por teclado y permita
		 * borrarla , tanto si está vacía como si no. Si no está vacía debe pedir
		 * confirmación. Dentro de la carpeta sólo tendremos archivos
		 */
		String respuesta;
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
				try {
					DirectoryStream<Path> stream = Files.newDirectoryStream(carpeta);
					int cont = 0;
					for (Path path : stream) {
						cont++;
					}
					stream.close();
					if (cont > 0) { // en el caso en el q este con archivos dentro
						System.out.println("La carpeta no está vacía, quieres borrarla?(S/N)");
						respuesta = sc.nextLine();
						if (!respuesta.equalsIgnoreCase("S"))
							System.out.println("No se ha borrado");
						else {
							DirectoryStream<Path> stream2 = Files.newDirectoryStream(carpeta); // abre la carpeta
							for (Path path : stream2) { // la recorre
								Files.delete(path); // y borra archivo a achivo
								System.out.println("Archivos borrados");
							}
							stream2.close();
							Files.delete(carpeta);
							System.out.println("Carpeta borrada");
						}
					} else {
						Files.delete(carpeta); // esto es en el caso de que esté vacía
						System.out.println("Carpeta borrada");
					}
				} catch (IOException e) {
					System.out.println(e);
				}

			}
		}

	}

}
