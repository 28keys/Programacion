package Curso;

public class UsoArrayBidimensional2 {

	public static void main(String[] args) {

		int[][] numeros = new int[4][5];
		// Pildoras informaticas lo ve como [Columna][Fila]

		numeros[0][0] = 15;
		numeros[0][1] = 21;
		numeros[0][2] = 18;
		numeros[0][3] = 9;
		numeros[0][4] = 15;

		numeros[1][0] = 10;
		numeros[1][1] = 52;
		numeros[1][2] = 17;
		numeros[1][3] = 19;
		numeros[1][4] = 2;

		numeros[2][0] = 19;
		numeros[2][1] = 4;
		numeros[2][2] = 2;
		numeros[2][3] = 6;
		numeros[2][4] = 7;

		numeros[3][0] = 6;
		numeros[3][1] = 44;
		numeros[3][2] = 25;
		numeros[3][3] = 68;
		numeros[3][4] = 70;

		for (int i = 0; i < 4; i++) { // for padre

			for (int j = 0; j < 5; j++) { // for hijo
				System.out.print(numeros[i][j]+" ");
			}
			System.out.println();
		}

	}

}
