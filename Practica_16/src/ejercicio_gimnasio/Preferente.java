package ejercicio_gimnasio;

import java.time.LocalDate;
import java.time.LocalTime;

public class Preferente extends Socio {
	private int numeroSocio;

	public Preferente(String nombre, String apellido, String tfno, LocalDate fechaNacimiento) {
		super(nombre, apellido, tfno, fechaNacimiento);
		numeroSocio++;
		this.codigoSocio = "P" + numeroSocio;
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

		return 0;
	}

	@Override
	public String toString() {
		return "\n" + "Socio Preferente  : " + "\n" + super.toString();
	}

}