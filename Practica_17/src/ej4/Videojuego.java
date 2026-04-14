package ej4;

public class Videojuego implements Prestable {
	private String titulo;
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
		return "Videojuego [titulo=" + titulo + ", horasEstimadas=" + horasEstimadas + ", prestado=" + prestado
				+ ", genero=" + genero + ", compañia=" + compañia + "]";
	}

}
