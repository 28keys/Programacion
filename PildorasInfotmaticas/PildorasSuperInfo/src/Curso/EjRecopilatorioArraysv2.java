package Curso;

import javax.swing.JOptionPane;

public class EjRecopilatorioArraysv2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] paises = new String [9];
		
		for (int i = 0 ; i < 9 ; i++) {
			paises[i] = JOptionPane.showInputDialog("Introduce país");
		}
		
		for (String elemento : paises) System.out.println("Pais : "+ elemento);
	}

}
