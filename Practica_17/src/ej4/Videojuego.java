package ej4;

import java.util.Objects;

public class Videojuego implements Prestable {
	private String titulo;
	private int cont;
	private int horasEstimadas = 10;
	private boolean prestado;
	private String genero;
	private String compañia;

	public Videojuego(String titulo, int horasEstimadas, boolean prestado, String genero, String compañia) {
		super();
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.prestado = prestado;
		this.genero = genero;
		this.compañia = compañia;
	}
	
	public double getHoras (double horas){
		return horas+=horasEstimadas+horas;
	}
		
	public double prestamoRecaudado (double horasTotales) {
		double recaudado;
		recaudado = horasTotales*0.5;
		return recaudad
	}
	
	public String getTitulo() {
		return titulo;
	}

	@Override
	public boolean prestar() {
		cont++;
		return prestado = true;
	}

	@Override
	public boolean devolver() {
		return prestado = false;
	}

	@Override
	public boolean isEntregado() {
		return prestado = true;
	}

	@Override
	public String toString() {
		return "Videojuego [titulo=" + titulo + ", horasEstimadas=" + horasEstimadas + ", prestado=" + prestado
				+ ", genero=" + genero + ", compañia=" + compañia + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(titulo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Videojuego other = (Videojuego) obj;
		return Objects.equals(titulo, other.titulo);
	}

	
}