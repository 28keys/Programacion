package Curso;

import java.util.Random;

import javax.swing.JOptionPane;

public class EjRecopilatorioRandom {

	public static void main(String[] args) {

		int[] arraysAleatorios = new int[200];

		for (int i = 0; i < arraysAleatorios.length; i++) {

			arraysAleatorios[i] = (int) (Math.random() * 100);

		}

		for (int elem : arraysAleatorios)
			System.out.print(elem + " ");

	}

}
/*
 * int numeros = Integer.parseInt(
 * JOptionPane.showInputDialog("Cuantos numeros quieres escribir")); int []
 * numerosR = new int [numeros]; Random r = new Random (numeros); for (int i = 0
 * ; i < numerosR.length; i++) { System.out.println(numeros); }
 */