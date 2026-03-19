package ToaquizaRA_RA6;

public class Pedido {
	
	private int npedido;
	private double precio;
	private String codUsuario, destino;
	
	public Pedido(int npedido, double precio, String codUsuario, String destino) {
		this.npedido = npedido;
		this.precio = precio;
		this.codUsuario = codUsuario;
		this.destino = destino;
	}

	public int getNpedido() {
		return npedido;
	}

	public double getPrecio() {
		return precio;
	}

	public String getCodUsuario() {
		return codUsuario;
	}

	public String getDestino() {
		return destino;
	}

	@Override
	public String toString() {
		return "Pedido [npedido=" + npedido + ", precio=" + precio + ", codUsuario=" + codUsuario + ", destino="
				+ destino + "]";
	}
	
	
	
	
	
	
}
