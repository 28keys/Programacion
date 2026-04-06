package Curso;

import javax.swing.JOptionPane;

public class EjercicioRecopilatorio2 {

	public static void main(String[] args) {

		int altura = 0;
		String genero;
		int peso = 0;

		try {	
			altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu altura"));
		} catch (NumberFormatException n) {
			JOptionPane.showMessageDialog(null, "Error,  no has puesto la altura");
			System.exit(altura);
		}
		do {
			genero = JOptionPane.showInputDialog("¿Cuál es tu género? (H/M)");
			switch (genero) {
			case "H", "h":
				peso = altura - 110;
				break;
			case "M", "m":
				peso = altura - 120;
				break;
			default:
				JOptionPane.showMessageDialog(null, "Genero invalido");
				break;
			}
		} while (!genero.equalsIgnoreCase("H") && !genero.equalsIgnoreCase("M"));
		/*
		 * Este while quiere decir que el bucle se repetirá mientras el genero sea
		 * distinto de H o h y distinto de M o m ya que se utiliza ignorecase para que
		 * se entienda que puede ser mayusculuas o minusculas
		 */

		JOptionPane.showMessageDialog(null, "Tu peso ideal es de "+peso+" kg");

		/*
		 * String genero = "";
		 * 
		 * do { genero = JOptionPane.showInputDialog("Introduce tu genero (H/M)");
		 * 
		 * } while (!genero.equalsIgnoreCase("H") && !genero.equalsIgnoreCase("M")); int
		 * altura =
		 * Integer.parseInt(JOptionPane.showInputDialog("Introduce altura en cm")); int
		 * pesoIdeal = 0;
		 * 
		 * if (genero.equalsIgnoreCase("H")) pesoIdeal = altura - 110; else if
		 * (genero.equalsIgnoreCase("M")) pesoIdeal = altura - 120;
		 * 
		 * System.out.println("Tu peso ideal es : "+ pesoIdeal);
		 */
	}

}
