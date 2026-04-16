package ejercicio_gimnasio;

import java.time.LocalDate;
import java.time.LocalTime;

public class Resto extends Socio {
	private static int numeroSocio;

	public Resto(String nombre, String apellido, String tfno, LocalDate fechaNacimiento) {
		super(nombre, apellido, tfno, fechaNacimiento);
		numeroSocio++;
		this.codigoSocio = "N" + numeroSocio;
	}

	@Override
	LocalTime entradaGimnasio(LocalTime horaEntrada) {
		return horaEntrada;
	}

	@Override
	LocalTime salirGimnasio() {
		return null;
	}

	@Override
	double mensualidad() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		return "\n" + "Socio Resto : " + "\n" + super.toString();
	}

}