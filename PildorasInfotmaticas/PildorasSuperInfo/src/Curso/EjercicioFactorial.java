package Curso;

import javax.swing.JOptionPane;

public class EjercicioFactorial {

	public static void main(String[] args) {
		/*
		 * 6! = 6x5x4x3x2x1 el factorial = 720 4! = 4x3x2x1 = 24 el factorial 237!= 237
		 * -Desde ventana jOptionpane introduce un numero y en consola te dice cuanto
		 * sale
		 */
		int factorial = 1;
		int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));

		for (int i = num; i > 0; i--) {
			factorial = factorial * i;
			// System.out.println(num + " x " + i + " = " + factorial);
			// System.out.print(num+" x "+i+"\t");
		}

		//System.out.println();
		System.out.println("El factorial de " + num + "! es " + factorial);
	}

}
