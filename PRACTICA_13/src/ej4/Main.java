package ej4;

public class Main {

	public static void main(String[] args) {
	
		Repartidor r1 = new Repartidor();		
		Repartidor r2 = new Repartidor();
		
		r1.realizarPedido(35, 2);
		r2.realizarPedido(80, 10);
		r1.realizarPedido(555, 6);
		r2.realizarPedido(100, 0);
		r1.realizarPedido(2.30, 0);
		r2.realizarPedido(25, 5);
		
		System.out.println(r1.toString());
		System.out.println(r2.toString());
		
		System.out.println("El total de pedidos son de "+Repartidor.getTotalPedidos());
		
		System.out.println("El total de ganancias de r1 es "+ r1.getGanancias());
	}

}
