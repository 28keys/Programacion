package Practica_18;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import static java.nio.file.StandardCopyOption.*;
public class Ej2 {

		

	public static void main(String[] args) {

		/*
		 * 2. Programa que lee la ruta y el nombre de dos ficheros y copia el primero en
		 * el segundo. Si el segundo existe pide confirmación.
		 */
		String respuesta;
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce ruta 1:");
		String ruta1 = sc.nextLine();
		System.out.println("Introduce nombre del fichero 1:");
		String nombre1 = sc.nextLine();

		Path fichero1 = Paths.get(ruta1 + "/" + nombre1);

		if (!Files.exists(fichero1))
			System.out.println("No existe el fichero 1, se acaba el programa");
		else {

			System.out.println("Introduce ruta 2:");
			String ruta2 = sc.nextLine();
			System.out.println("Introduce nombre del fichero 2:");
			String nombre2 = sc.nextLine();
			Path fichero2 = Paths.get(ruta1 + "/" + nombre1);

			try {
				if (Files.exists(fichero2)) {
					System.out.println("Existe, ¿quieres sobrescribirlo? 'S'");
					respuesta = sc.nextLine();
				
				if (!respuesta.equalsIgnoreCase("S"))
					System.out.println("Copia no realizada");
				else
					Files.copy(fichero1, fichero2, REPLACE_EXISTING);
				}
				
				else  {
					Files.copy(fichero1, fichero2);
					System.out.println("Copia realizada");
				}
				
			} catch (IOException e) {
				System.out.println("Error al copiar");
			}

		}

	}

}
