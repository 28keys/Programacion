package Curso;

import javax.swing.JOptionPane;

public class EjRecopilatorioArrays {

	public static void main(String[] args) {
		int pais = Integer.parseInt(JOptionPane.showInputDialog("¿Cúantos países vas a esribir?"));
		/*Primero creamos el tamaño del array como cuando hacemos String [] paises = new String[8]*/
		
		String [] paises = new String [pais];
		/*Aqui empiezo a crear mi array de paises y en new String el tamaño sera lo que escriba
		 por teclado, es decir, creo primero el numero de indices/cuadraditos y despues escribo en cada uno de ellos*/
		
		for (int i = 0 ; i < paises.length; i ++) {
			String nombre = JOptionPane.showInputDialog("Introduce el nombre del país "+i);
			/*Aqui la i recorre cada indice en donde escribiré el país así hasta el tamaño que yo ha introducido por teclado :)*/
			
			JOptionPane.showMessageDialog(null, nombre);
			System.out.println(nombre);
		}

	}

}
