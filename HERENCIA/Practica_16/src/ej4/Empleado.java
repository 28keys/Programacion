package ej4;

public class Empleado {
	private String nombre, dni, direccion, tfno;
	private int nEmple, horas;
	private static int totalnEmple = 1000;
	public Empleado(String nombre, String dni, String direccion, String tfno) {
		totalnEmple++;
		this.nEmple = totalnEmple;
		this.nombre = nombre;
		this.dni = dni;
		this.direccion = direccion;
		this.tfno = tfno;
	}
	
	public Empleado(int horas) { /*Dudas para begoña: aqui si solo construyo horas en empleado y en los demas
	 							   no, lo heredan las demas clases o tengo que ponerlo en las demas clases tambien?*/
		this.horas = horas;
	}

	@Override
	public String toString() {
		return "Empleado [Horas relizadas: " +horas+ "nombre= " + nombre + ", dni= " + dni + ", direccion= " + direccion + ", telefono= " + tfno
				+ ", Numero identificatorio = " + nEmple + "]";
	}
	public String nEmple() {
		return "Tu numero es el : "+totalnEmple;
	}
	
}
