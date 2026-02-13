package EJ2;

public class Main {

	public static void main(String[] args) {

		Etiqueta e1 = new Etiqueta(10, 10, "+");
		e1.mostrarEnPantalla();
		
		System.out.println("\n");
		
		e1.modificarCaracter("X");
		
		e1.mostrarEnPantalla();
	}

}
