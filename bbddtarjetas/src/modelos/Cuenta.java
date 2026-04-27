package modelos;

import java.time.LocalDate;
import java.util.ArrayList;

public class Cuenta {
	private int numeroCuenta;
	private String titular1;
	private String titular2;
	private String titular3;
	private double saldo;
	private LocalDate fecha;
	public Cuenta(int numeroCuenta, String titular1, String titular2, String titular3, double saldo, LocalDate fecha) {
		super();
		this.numeroCuenta = numeroCuenta;
		this.titular1 = titular1;
		this.titular2 = titular2;
		this.titular3 = titular3;
		this.saldo = saldo;
		this.fecha = fecha;
	}
	@Override
	public String toString() {
		return "Cuenta [numeroCuenta=" + numeroCuenta + ", titular1=" + titular1 + ", titular2=" + titular2
				+ ", titular3=" + titular3 + ", saldo=" + saldo + ", fecha=" + fecha + "]";
	}



}
