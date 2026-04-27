package colegio;

import java.io.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;
import java.sql.*;

import bbdd.*;
import modelos.Cuenta;
import modelos.Tarjeta;

public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		int opc = 0;
		ArrayList<Cuenta> cuentas;
		BD_Tarjetas bd = new BD_Tarjetas("mysql-properties.xml");

		do {
			System.out.println("\n\nGESTIÓN COLEGIO");
			System.out.println("***************");
			System.out.println(
					"1.Nueva Tarjeta Crédito\n" + "2.Nuevo Curso\n3.Borrar Alumno\n4.Listado alumnos por curso\n"
							+ "5.Listado de cursos\n" + "6.Consultar alumno\n" + "7.Consultar tutor de un curso\n"
							+ "8.Listado alumnos por tutor\n" + "9.Listado alumnos por curso");
			System.out.print("\tTeclea opciÓn: ");
			try {
				opc = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Debes introducir n�mero 1-5");
				opc = 0;
			}
			sc.nextLine();
			switch (opc) {
			case 1:
				System.out.println("Alta tarjeta credito");
				System.out.println("Introduce dni");
				String dni = sc.nextLine();

				try {
					cuentas = bd.buscarCuentasPorTitular(dni);
					if (cuentas.size() == 0)
						System.out.println("No existen cuentas con ese titular");
					else {
						System.out.println(cuentas.toString());
						System.out.println("Elige la cuenta introduciendo el numero de la cuenta");
						int numeroCuenta = sc.nextInt();
						System.out.println("Introduce el numero de la tarjeta (max 4 digitos)");
						int numeroTarjeta = sc.nextInt();
						System.out.println("Introduce nombre del titular");
						sc.nextLine();
						String titular = sc.nextLine();
						System.out.println("Introduce el limite de importe");
						double importe = sc.nextDouble();
						sc.nextLine();
						System.out.println("Introduce clave (max 4 digitos)");
						String clave = sc.nextLine();

						int filas = bd.añadir_tarjeta_credito(
								new Tarjeta(numeroTarjeta, numeroCuenta, titular, importe, clave));
						switch (filas) {
						case 1:
							System.out.println("Tarjeta añadida");
							break;
						case 0:
							System.out.println("No se ha podido añadir la tarjeta");
							break;

						}
					}
				} catch (ErrorBaseDatos e) {
					System.out.println("Hablé con sistemas " + e.getMessage());
				}
				break;
			case 2:
				System.out.println("Introduce numero de la cuenta");
				int numeroCuenta = sc.nextInt();
				try {
					Cuenta cu = bd.buscarCuenta(numeroCuenta);
					if (cu == null)
						System.out.println("La cuenta no existe");
					else {
						int numeroTarjeta = bd.BuscarUltimoNumTarjeta() + 1;
						sc.nextLine();
						System.out.println("Introduce el titular: ");
						String titular = sc.nextLine();
						System.out.println("Introduce la clave: ");
						String clave = sc.nextLine();
						int filas = bd.añadir_tarjeta_credito(new Tarjeta(numeroTarjeta, numeroCuenta, titular, clave));
						switch (filas) {
						case 1:
							System.out.println("Tarjeta dada de alta correctamente");
							break;
						case 0:
							System.out.println("Error al dar de alta la tarjeta");
							break;
						}
					}

				} catch (ErrorBaseDatos e) {
					e.printStackTrace();
				}
				break;
			}
		} while (opc != 10);

	}

}
