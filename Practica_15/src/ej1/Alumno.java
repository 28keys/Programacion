package ej1;

public class Alumno {

	private String nombre;
	private double nota;

	public Alumno(String nombre, double nota) {

		this.nota = nota;
		this.nombre = nombre;
	}

	public Alumno(String nombre) {

		this.nombre = nombre;
	}

	public Alumno(double nota) {

		this.nota = nota;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", nota=" + nota + "]";
	}

	
}
