package ej4;

public class Propio extends Empleado {
	private static int totalPropios = 0;
	double dinero;
	public Propio(String nombre, String dni, String direccion, String tfno) {
		super(nombre, dni, direccion, tfno);
		totalPropios++;
	}

	public static int getTotalPropios() {
		return totalPropios;
	}
	public void dineroRepatido (double dinero) {
			this.dinero = dinero;
		
	}
	@Override
	public String toString() {
		return "Propio : "+"Dinero :"+dinero + super.toString();
	}

	/*
	 * double reparto; reparto = cantidad / ; }
	 */

}