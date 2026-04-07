package ej4;

import java.util.Objects;

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

	public Empleado(int nEmple) {
		this.nEmple = nEmple;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleado other = (Empleado) obj;
		return nEmple == other.nEmple;
	}

	public int getnEmple() {
		return nEmple;
	}

	public void fichar(int horas) {
		this.horas = this.horas + horas;
	}

	@Override
	public String toString() {
		return "Empleado [Horas relizadas: " + horas + "nombre= " + nombre + ", dni= " + dni + ", direccion= "
				+ direccion + ", telefono= " + tfno + ", Numero identificatorio = " + nEmple + "]";
	}
}