package Curso;

import javax.swing.JOptionPane;

public class UsoFor {

	public static void main(String[] args) {
		String mail = JOptionPane.showInputDialog("Introduce email");
		int arroba = 0;
		boolean punto = false;
		for (int i = 0; i < mail.length(); i++) {
			
			if (mail.charAt(i) == '@')
				arroba++;
			if (mail.charAt(i) == '.') 
				punto = true;
		}
		if (arroba == 1 && punto == true) // o arroba == true tambien vale si es true
			System.out.println("Mail correcto");
		else
			System.out.println("Mail incorrecto");
	}

}
