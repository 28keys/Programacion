package Practica_18;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class ej8 {
	/*
	 * 8. Programa que lee un archivo y cuenta las veces que se repite una letra
	 * anotada desde teclado.
	 */

	public static void main(String[] args) {
		char letra;
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Qué letra quieres que se repita?");
		letra = sc.next().toLowerCase().charAt(0);
		Path entrada = Paths.get("/home/inf1/Desktop/DAW 1/Programación/DAW_Programacion/Practica_18/pruebas/uno.txt");
		InputStream istream = null;
		int c, cont = 0;
		try {
			istream = Files.newInputStream(entrada);
			while ((c = istream.read()) != -1) {
				if (c == letra)
				cont++;
			}
			istream.close();

			System.out.println("Hay " + cont + " caracteres");

		} catch (IOException io) {
			System.err.println(io);
		}
	}

}
