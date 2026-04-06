package Curso;

import javax.swing.JOptionPane;

public class EjercicioRecopilatorio {

	public static void main(String[] args) {
		int respuesta = 0;
		int nAleatorio = (int) (Math.random() * 100) + 1; // numero que tengo que adivinar
		int nEleccion = 0; // numero del usuario
		int cont = 0; // intentos

		do {
			nEleccion = Integer
					.parseInt(JOptionPane.showInputDialog("Introduce el numero que has elegido entre 1 y 100"));
			cont++; // son los intentos que yo hago
			if (nEleccion > nAleatorio)
				JOptionPane.showMessageDialog(null, "El nº es mas bajo, tu numero es alto");
			// System.out.println("El nº es mas bajo, tu numero es alto");
			else
				JOptionPane.showMessageDialog(null, "El nº es mas alto, tu numero es bajo");

			if (cont >= 5) {
				JOptionPane.showMessageDialog(null, "Lo siento has llegado al limite de intentos :(");
				respuesta = JOptionPane.showConfirmDialog(null, "¿Quieres volver a empezar?");
				if (respuesta == 0)
					cont = 0;
				else
					System.exit(respuesta = 1);
			}
		} while (nAleatorio != nEleccion || respuesta == 0);

		System.out.println(
				"¡¡MUY BIEN!!, el numero es " + nAleatorio + " has realizado un total de " + cont + " intentos :)");
	}
}
