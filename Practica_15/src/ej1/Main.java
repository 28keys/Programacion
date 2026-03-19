package ej1;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int opc, pos;
		String nombre;
		double nota;
		Scanner sc = new Scanner(System.in);
		ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
		sc.useLocale(Locale.ENGLISH);
		do {
			System.out.println("1./Dar de alta a un alumno , 2./Modificar nota, 3./Sustituir un alumno por otro,"
					+ " 4./Borrar un alumno, 5./Comprobar si está el alumno. 6/.Mostrar, 7./Salir");
			System.out.println("Anota opción");
			opc = sc.nextInt();
			switch (opc) {
			case 1:
				sc.nextLine();
				System.out.println("Anota nuevo nombre");
				nombre = sc.nextLine();
				pos = buscar(alumnos, nombre);
				if (pos != -1)
					System.out.println("El alumno ya existe");
				else {
					System.out.println("Introduce la nota");
					nota = sc.nextDouble();
					alumnos.add(new Alumno(nombre, nota));
				}
				break;

			case 2:
				sc.nextLine();
				System.out.println("Anota nombre");
				nombre = sc.nextLine();
				pos = buscar(alumnos, nombre);

				if (pos == -1)
					System.out.println("El alumno no existe no puedes modificar la nota");
				else {
					System.out.println("Introduce nueva nota");
					nota = sc.nextDouble();
					alumnos.get(pos).setNota(nota);
				}
				break;
			case 3:
				sc.nextLine();
				System.out.println("Anota nombre");
				nombre = sc.nextLine();
				pos = buscar(alumnos, nombre);

				if (pos == -1)
					System.out.println("El alumno no existe no puedo sustituirlo");
				else {
					System.out.println("Introduce nuevo nombre");
					nombre = sc.nextLine();
					System.out.println("Introduce nueva nota");
					nota = sc.nextDouble();
					Alumno a2 = new Alumno(nombre, nota);
					alumnos.set(pos, a2);
				}
				break;

			case 4:
				sc.nextLine();
				System.out.println("Anota nombre");
				nombre = sc.nextLine();
				pos = buscar(alumnos, nombre);

				if (pos == -1)
					System.out.println("No existe el alumno no puedo borrar");
				else {
					alumnos.remove(pos);
				}
				break;
			case 5:
				sc.nextLine();
				System.out.println("Anota nombre");
				nombre = sc.nextLine();
				pos = buscar(alumnos, nombre);

				if (pos == -1)
					System.out.println("El alumno no existe no está en el ArrayList");
				else {
					System.out.println(alumnos.get(pos).toString());

				}
				break;
			}
		} while (opc != 7);

	}

	public static int buscar(ArrayList<Alumno> alumnos, String nombre) {
		for (int i = 0; i < alumnos.size(); i++) {
			if (alumnos.get(i).getNombre().equalsIgnoreCase(nombre))
				return i;

		}
		return -1;
	}
}
