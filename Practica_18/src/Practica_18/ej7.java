package Practica_18;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class ej7 {

	public static void main(String[] args) {

		/* 7. Programa que cuenta los caracteres de un archivo */
		Scanner sc = new Scanner(System.in);
		Path entrada = Paths.get("C:\\Programación\\Programacion-main\\Practica_18\\iker.txt");
		InputStream istream = null;
		int c, cont = 0;
		try {
			istream = Files.newInputStream(entrada);
			while ((c = istream.read()) != -1) {
				// if (c!=10 && c!=32) si quiero ignorar espacios blancos y saltos de línea
				cont++;
			}
			istream.close();

			System.out.println("Hay " + cont + " caracteres");

		} catch (IOException io) {
			System.err.println(io);
		}
	}

}
