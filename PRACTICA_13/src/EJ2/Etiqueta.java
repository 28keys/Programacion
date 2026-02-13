package EJ2;

public class Etiqueta {

	private String caracter;
	private double altura, anchura;

	public Etiqueta(double anchura, double altura, String caracter) {
		this.altura = altura;
		this.anchura = anchura;
		this.caracter = caracter;

	}

	public void mostrarEnPantalla() {

		for (int i = 1; i <= anchura; i++) // primera linea
			System.out.print(caracter);
			System.out.println();

		for (int f = 2; f < altura; f++) {
			System.out.print(caracter);
			for (int i = 1; i < anchura-1; i++)
				System.out.print(" ");
			System.out.print(caracter);
			System.out.println();

		}
		for (int i = 1; i <= anchura; i++) // última linea
			System.out.print(caracter);
	}

	public void modificarCaracter(String nuevoCaracter) {
		caracter = nuevoCaracter;
	}

}
