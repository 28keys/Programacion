package modelos;

import java.time.LocalDate;
import java.util.ArrayList;

public class Tarjeta {
	private int numero;
	private int numeroTarjeta;
	private String titular;
	private double limite;
	private String tipo;
	private LocalDate fechaCaducidad;
	private String clave;
	private int bloqueada;

	// Tarjeta de credito

	public Tarjeta(int numeroTarjeta, int numero, String titular, double limite, String clave) {
		super();
		this.titular = titular;
		this.numero = numero;
		this.numeroTarjeta = numeroTarjeta;
		this.limite = limite;
		tipo = "C";
		this.fechaCaducidad = fechaCaducidad.now().plusYears(1);
		this.clave = clave;
		this.bloqueada = 0;
	}

	public Tarjeta(int numeroTarjeta, int numero, String titular, String clave) {
		super();
		this.numero = numero;
		this.numeroTarjeta = numeroTarjeta;
		this.titular = titular;
		this.clave = clave;
		tipo = "D";
		fechaCaducidad = LocalDate.now().plusMonths(6);
		bloqueada = 0;
	}

	public int getNumeroTarjeta() {
		return numeroTarjeta;
	}

	public void setNumeroTarjeta(int numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public int getBloqueada() {
		return bloqueada;
	}

	public void setBloqueada(int bloqueada) {
		this.bloqueada = bloqueada;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public LocalDate getFechaCaducidad() {
		return fechaCaducidad;
	}

	public void setFechaCaducidad(LocalDate fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}

}
