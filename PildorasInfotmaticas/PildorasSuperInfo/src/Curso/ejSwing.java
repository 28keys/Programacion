package Curso;

import javax.swing.*;

public class ejSwing{

	public static void main(String[] args) {
		
		String nombre = JOptionPane.showInputDialog("Introduce tu nombre, por favor");

		int edad =  Integer.parseInt(JOptionPane.showInputDialog("Introduce la edad"));
		
		double salario = Double.parseDouble(JOptionPane.showInputDialog("Introduce tu salario"));
		System.out.println("Te llamas " + nombre + " y el año que viene tendrás " + (edad+1) +
				" años , y tienes un salario de "+salario);

	}

}

