//Iker Toaquiza Romero
package ToaquizaRA_RA6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.InputMismatchException;
import java.util.LinkedList;

import static java.nio.file.StandardOpenOption.*;

public class Main {
	public static void main(String[] args) {
		Path Iker = Paths.get("Iker");
		Charset charset = Charset.forName("UTF-8");
		if (!Files.exists(Iker))
			System.out.println("La carpeta no existe");
		else {
			if (!Files.isDirectory(Iker))
				System.out.println("No es una carpeta");
			else {
				try {
					DirectoryStream<Path> stream = Files.newDirectoryStream(Iker);
					for (Path path : stream) {
						if (!path.getFileName().toString().equalsIgnoreCase("pedidos.txt")) {
							Files.delete(path);
							System.out.println("Archivos borrados");
						}
					}
				} catch (IOException x) {
					System.err.format("IOException: %s%n", x);
				}
			}
		}
		LinkedList<Pedido> pedidos = new LinkedList<Pedido>();
		BufferedReader reader = null;
		Path file = Paths.get(Iker+"/pedidos.txt");
		try {
			reader = Files.newBufferedReader(file, charset);
			String line = null;
			while ((line = reader.readLine()) != null) {
				String datos [] = line.split(",");
					try {
						if (!datos[2].matches("[a-zA-Z]{5,6}[0-9]{1,2}"))
								System.out.println("Codigo de usuario incorrecto");
						else {
							
						}
					} catch(InputMismatchException e) {
						System.out.println(e.getMessage());
					}
			}
		} catch (IOException x) {
			System.err.format("IOException: %s%n", x);
		}
	}
}
