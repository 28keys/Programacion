package Curso;

import javax.swing.JOptionPane;

public class UsoWhile {

	public static void main(String[] args) {

		String clave = "Lunes";
		String pass = "";

		while (clave.equals(pass) == false) {
			pass = JOptionPane.showInputDialog("Introduce contraseña");

			if (clave.equals(pass) == false)
				System.out.println("Contraseña incorrecta");
		}
		System.out.println("Acceso correcto");
	}

}
