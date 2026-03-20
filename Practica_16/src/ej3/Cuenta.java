package ej3;

import java.util.HashSet;

public class Cuenta {
	private static int totalCuentas = 5000;
	private static final double interesCuenta = 0.03;
	private double saldo;
	private int nCuenta;
	HashSet <String> titulares = new HashSet <String>();
	public Cuenta(HashSet<String> titulares, double saldo ) {
		totalCuentas ++;
		this.saldo = saldo;
		this.nCuenta = totalCuentas;
		this.titulares = titulares;
	}
	
	
	
}
