package cochesElectricosExamen;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Random;

public class Coche {

	private String matricula, codigo;
	private double ganancias;
	private int estado;
	private LocalTime horaReserva;
	private static final double precioSegundo=0.8;
	private static int alquilados, reservados;
	
	
	
	public Coche(String matricula) {
		this.matricula = matricula;
		
	}

	@Override
	public String toString() {
		return "Coche [matricula=" + matricula + ", codigo=" + codigo + ", ganancias=" + ganancias + ", estado="
				+ estado + ", horaReserva=" + horaReserva + "]";
	}

	public String getMatricula() {
		return matricula;
	}

	public int getEstado() {
		return estado;
	}
	
	public String reservar() {
		Random r=new Random();
		if(estado!=0)
			return null;
		estado=1;
		codigo=matricula.substring(4, 7).toLowerCase()+(r.nextInt(10)+1);
		horaReserva=LocalTime.now();
		reservados++;
		return codigo;
		
	}
	public boolean alquilar (String cod) {
		if (estado!=1)
			return false;
		
		if(!cod.equals(codigo)) {
			estado=0;
			reservados --;
			return false;
		}
		reservados --;
		alquilados++;
		estado=2;
		return true;
	}
	
	public double estacionar() {
		double importe;
		if (estado!=2)
			return 0;
		Random r=new Random();
		int n=r.nextInt(191)+10;
		importe=n*precioSegundo;
		ganancias+=importe;
		alquilados --;
		estado=0;
		return importe;
	}

	public static int getAlquilados() {
		return alquilados;
	}

	public static int getReservados() {
		return reservados;
	}
	public void liberar() {
		if (estado !=1)
			return;
		long seg=ChronoUnit.SECONDS.between(horaReserva, LocalTime.now());
		if(seg > 20) {
			estado = 0 ;
			reservados--;
		}
		
	}
	
	
	
}
