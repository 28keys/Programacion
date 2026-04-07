package ej4;

public class Propio extends Empleado {
	private static int totalPropios = 0;

	public Propio(String nombre, String dni, String direccion, String tfno) {
		super(nombre, dni, direccion, tfno);
		totalPropios++;
	}

	public static int getTotalPropios() {
		return totalPropios;
	}

	@Override
	public String toString() {
		return "Propio : " + super.toString();
	}

	/*
	 * double reparto; reparto = cantidad / ; }
	 */

}
