package ej4;

import java.util.Objects;

public class Serie implements Prestable {

	private String titulo;
	private int nTemporadas = 3;
	private boolean prestado;
	private String genero;

	public Serie(String titulo, int nTemporadas, boolean prestado, String genero) {
		super();
		this.titulo = titulo;
		this.nTemporadas = nTemporadas;
		this.prestado = prestado;
		this.genero = genero;
	}

	public String getTitulo() {
		return titulo;
	}

	@Override
	public boolean prestar() {

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
		return "Serie [titulo=" + titulo + ", nTemporadas=" + nTemporadas + ", prestado=" + prestado + ", genero="
				+ genero + "]";
	}

}