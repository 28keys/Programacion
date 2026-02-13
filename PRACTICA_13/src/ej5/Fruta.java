package ej5;

public class Fruta {

	private String nombreFruta, procedencia;
	private double nKilos, precioCoste, precioVenta;

	public Fruta(String nombreFruta, String procedencia, double nKilos, double precioCoste, double precioVenta) {
		this.nombreFruta = nombreFruta;
		this.procedencia = procedencia;
		this.nKilos = nKilos;
		this.precioCoste = precioCoste;
		this.precioVenta = precioVenta;
	}

	@Override
	public String toString() {
		return "Fruta [nombreFruta=" + nombreFruta + ", procedencia=" + procedencia + ", nKilos=" + nKilos
				+ ", precioCoste=" + precioCoste + ", precioVenta=" + precioVenta + "]";
	}

	public boolean rebajarPrecioVenta(double rebaja) {
		if (precioVenta - rebaja < precioCoste)
			return false;
		precioVenta -= rebaja;
		return true;

	}

	public double vender(double kilosVender) {
		double importe;
		if (nKilos < kilosVender)
			importe = 0;

		else {
			nKilos = nKilos - kilosVender;
			importe = kilosVender * precioVenta;
		}
		return importe;

	}

}
