package Ej1;

public class Satelite {
	
	//1.ATRIBUTOS
	double distancia, meridiano, paralelo;
	
	//2.CONSTRUCTOR
	
	public Satelite (double distancia,  double meridiano,  double paralelo) {
		this.distancia = distancia;
		this.meridiano = meridiano;
		this.paralelo= paralelo;
		
	}
	//3. METODOS
	public boolean estaEnOrbita() {
		if (distancia>0)
			return true;
		return false;
		
	}
	public void variarAltura(double nuevaDistancia) {
			distancia = nuevaDistancia;
	}
	public void variarPosicion(double nuevoMeridiano, double nuevoParalelo) {
			meridiano= nuevoMeridiano;
			paralelo= nuevoParalelo;	
	}
}
