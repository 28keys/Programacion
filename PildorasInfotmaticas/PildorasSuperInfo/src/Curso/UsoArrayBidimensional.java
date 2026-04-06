package Curso;

import java.util.Scanner;

public class UsoArrayBidimensional {

	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		//String[][] nombres = new String[3][3];
		// [filas][columnas];
		/*
		nombres[0][0] = "Iker";
		nombres[0][1] = "Juan";
		nombres[0][2] = "Marcos";
		nombres[1][0] = "Ernesto";
		nombres[1][1] = "Derek";
		nombres[1][2] = "Ezequiel";
		nombres[2][0] = "Patrick";
		nombres[2][1] = "Lara";
		nombres[2][2] = "Rosa";
	
		for (int i = 0 ; i < nombres.length; i ++) {
				for (int j = 0 ; j < nombres[i].length; j++) {
						System.out.println(nombres [i][j]+"");
				}
				System.out.println();
		}
		*/
		/*
	char [][] telephone =  {{'1', '2', '3'},
							    {'4', '5', '6'},
							    {'7', '8', '9'},
								{'*','0', '#'}};
			for (char[]row : telephone) {
				for (char number : row) {
					System.out.print(number + " ");
					
				}
				System.out.println();
			}	
		*/
		
		int [][] numeros = new int [3][5];
		
		numeros [0][0] = 67;
		numeros [0][1] = 8;
		numeros [0][2] = 45;
		numeros [0][3] = 47;
		numeros [0][4] = 20;
		
		numeros [1][0] = 33;
		numeros [1][1] = 12;
		numeros [1][2] = 90;
		numeros [1][3] = 88;
		numeros [1][4] = 92;
		
		numeros [2][0] = 36;
		numeros [2][1] = 4;
		numeros [2][2] = 2;
		numeros [2][3] = 6;
		numeros [2][4] = 7;
		
		/*
		for (int i = 0; i < numeros.length; i ++) {
			
			for (int j = 0 ; j < numeros[i].length; j ++) {
				System.out.print(numeros[i][j]+" ");
			}
			System.out.println();
		}
		*/
		
		for (int [] fila : numeros) {
			for (int num: fila) {
				System.out.print(num+ " ");
			}
			
			System.out.println();
		}
		
		
		/*Resumen
		 * 1.) Creo el array bidimemnsional con cada posicion |fila|columna|
		 * 
		 * 2.) Primero con un for-each o un for normal recorro todo lo que hay dentro del
		 * array de numeros en el que sería las filas
		 * Si hago for each no hace falta poner numeros.length porque con poner el nombre del objeto ya recorro todo
		 * int [] fila : numeros
		 * 
 		 * 3.) dentro del for con otro for recorro las columnas, creo otra variable
		 * j o elemento (depende si hago for o for each) y recorro cada columna de la fila, como?
		 * pues desde la j hasta numeros[i].length o de int elemento : fila . basicamente con la j o con elemento estoy recorriendo
		 * dentro de cada fila porque con el primer for estaba "recorriendolo todo", entonces...
		 * 
		 * 4.) una vez recorro cada uno pues lo muestro por pantalla
		 * For-each
		 * -En este ejemplo solo hago int num : fila porque la fila ya tiene guardado todos los numeros en el primer for
		 * lo que hago en este segundo for es recorrer columnas
		 * 
		 * For
		 * -En este ejemplo se puede ver mas claro que i = fila , j = columna, siguiendo ese orden por pantalla
		 * muestro el array = numeros y las posiciones fila y columna --> numeros[i][j]+" "
		 * Pongo un espacio para que en pantalla se vea como una tabla....
		 *
		 * */
		
 	}

}
