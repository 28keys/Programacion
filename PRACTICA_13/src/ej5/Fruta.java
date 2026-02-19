package ej5;

public class Fruta {

	private String nombreFruta, procedencia;
	private double nKilos, precioKilo, precioVentaKilo;
	private static double beneficioAlm;

	// Constructor
	public Fruta(String nombreFruta, String procedencia, double nKilos, double precioKilo, double precioVentaKilo) {
		this.nombreFruta = nombreFruta;
		this.procedencia = procedencia;
		this.nKilos = nKilos;
		this.precioKilo = precioKilo;
		this.precioVentaKilo = precioVentaKilo;
	}

	// Información cargamento fruta
	@Override
	public String toString() {
		return "Fruta [nombreFruta=" + nombreFruta + ", procedencia=" + procedencia + ", nKilos=" + nKilos
				+ ", precioKilo=" + precioKilo + ", precioVentaKilo=" + precioVentaKilo + "]";
	}

	// Método rebajar

	public boolean rebajarPrecioVentaKilo(double rebaja) {
		if (precioVentaKilo - rebaja < precioKilo)
			return false; // return precioVentaKilo ??
		precioVentaKilo -= rebaja;
		return true; // return precioVentaKilo ??

	}

	// Método vender

	public double vender(double kilosVender) {
		double importe;
		if (nKilos < kilosVender)
			importe = 0;

		else {
			nKilos = nKilos - kilosVender;
			importe = kilosVender * precioVentaKilo;
			beneficioAlm += kilosVender * (precioVentaKilo-precioKilo);
		}
		return importe;
		

	}
	// Método cargamentos

	public static boolean mismaProcedencia(Fruta f1, Fruta f2) {
		if (f1.procedencia.equalsIgnoreCase(f2.procedencia))
			return true;
		return false;

	}

	public static double getBeneficioAlm() {
		return beneficioAlm;
	}

	
}
