package ejercicio_gimnasio;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opc, tipoSocio;
		String nombre, apellido, telefono, codigoSocio;
		String fechaNacimiento;
		DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LinkedList<Socio> socios = new LinkedList<Socio>();
		do {
			System.out.println("--------------");
			System.out.println("1. Dar de alta");
			System.out.println("2. Entrar al gym");
			System.out.println("3. Salir del gym");
			System.out.println("4. Informacion visitas y horas al gym");
			System.out.println("5. Cobrar mensualidad");
			System.out.println("6. Salir");
			System.out.println("--------------");
			opc = sc.nextInt();
			switch (opc) {
			case 1:
				System.out.println("1 = Socio preferente 2 = Socio normal");
				tipoSocio = sc.nextInt();
				sc.nextLine();
				System.out.println("Introduce tu nombre");
				nombre = sc.nextLine();
				System.out.println("Introduce tu apellido");
				apellido = sc.nextLine();
				try {
					buscarSocio(socios, nombre, apellido);

					System.out.println("Introduce tu telefono");
					telefono = sc.nextLine();

					System.out.println("Introduce tu fecha de nacimiento(dd/MM/yyyy)");
					try {
						fechaNacimiento = sc.nextLine();
						LocalDate fecha = LocalDate.parse(fechaNacimiento, formatoFecha);
						if (tipoSocio == 1)
							socios.add(new Preferente(nombre, apellido, telefono, fecha));
						else
							socios.add(new Resto(nombre, apellido, telefono, fecha));
					} catch (DateTimeParseException e) {
						System.out.println(e);
					}
				} catch (ExcepcionSocioRepetido e) {
					System.out.println("Este socio ya existe");
				}
				break;
			case 2:
				sc.nextLine();
				System.out.println("Introduce tu codigo de socio ");
				codigoSocio = sc.nextLine();
				System.out.println("Tu codigo es " + codigoSocio);
				boolean encontrado = false;
				for (Socio s : socios) {
					if (s.getCodigoSocio().equals(codigoSocio)) {
						System.out.println("Tu codigo es correcto");
						System.out.println("Estas entrando al gimnasio");
						LocalTime horaEntrada = LocalTime.now();
						System.out.println("Has entrado a las " + s.entradaGimnasio(horaEntrada));
						encontrado = true;
					}
				}
				if (encontrado == false) {
					System.out.println("Socio no encontrado");
				}
				break;
			case 3:
				sc.nextLine();
				System.out.println("Introduce tu codigo de socio");
				try {
					codigoSocio = sc.nextLine();
					buscarCodigo(socios, codigoSocio);
				} catch (CodigoNoEsta e) {
					System.out.println("No se encuentra el código");
				}
				
				break;
			case 4:
				System.out.println(socios.toString());

				break;
			}
		} while (opc != 6);
	}

	public static void buscarSocio(LinkedList<Socio> socios, String nombre, String apellido)
			throws ExcepcionSocioRepetido {
		for (Socio s : socios) {
			if (s.getNombre().equalsIgnoreCase(nombre) && s.getApellido().equalsIgnoreCase(apellido))
				throw new ExcepcionSocioRepetido("Este socio ya existe");
		}
	}

	public static void buscarCodigo(LinkedList<Socio> socios, String codigoSocio) throws CodigoNoEsta {
		for (Socio s : socios) {
			if (!s.getCodigoSocio().equalsIgnoreCase(codigoSocio))
				throw new CodigoNoEsta("El codigo no está");
		}

	}
}