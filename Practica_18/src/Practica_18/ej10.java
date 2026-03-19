package Practica_18;

import java.nio.charset.Charset;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class ej10 {

	public static void main(String[] args) {
		/*10. Dado un fichero de texto (creado con cualquier editor de texto plano), crear
		otro fichero en el que se han eliminado las vocales.*/

		String carpeta;
		Charset charset = Charset.forName("UTF-8");
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce nombre de la carpeta con su ruta:");
		carpeta = sc.nextLine();
		Path carp = Paths.get(carpeta);
		
		
		
	}

}
