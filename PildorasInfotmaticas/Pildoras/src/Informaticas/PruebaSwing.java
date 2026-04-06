package Informaticas;

import javax.swing.*;

public class PruebaSwing {

	public static void main(String[] args) {
		
		String nombre = JOptionPane.showInputDialog("Introduce tu nombre, por favor");

		String edad = JOptionPane.showInputDialog("Introduce la edad");

		System.out.println("Te llamas " + nombre + " y tienes " + edad +
				" años");

	}

}
