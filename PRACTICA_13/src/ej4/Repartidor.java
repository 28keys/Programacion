package ej4;

public class Repartidor {

	private int codigo;
	private int nPedidos;
	private double ganancias;

	private static int totalRepartidores;
	private static int totalPedidos;

	public Repartidor() {
		totalRepartidores++;
		codigo = totalRepartidores;
		nPedidos = 0;
		ganancias = 0;

	}

	public double realizarPedido(double importe, double propina) {
		double gananciaPedido = importe * 0.20 + propina;
		ganancias = ganancias + gananciaPedido; // ganancia+= gananciaPedido
		nPedidos++;
		totalPedidos++;
		return ganancias;	
	}

	public static int getTotalPedidos() {
		return totalPedidos;
	}

	public double getGanancias() {
		return ganancias;
	}

	@Override
	public String toString() {
		return "Repartidor [codigo=" + codigo + ", nPedidos=" + nPedidos + ", ganancias=" + ganancias + "]";
	}
	
	
	
}
