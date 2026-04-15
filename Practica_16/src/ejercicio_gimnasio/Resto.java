package ejercicio_gimnasio;

import java.time.LocalDate;
import java.time.LocalTime;

public class Resto extends Socio {

	public Resto(String nombre, String apellido, String tfno, LocalDate fechaNacimiento) {
		super(nombre, apellido, tfno, fechaNacimiento);
		this.codigoSocio = "N" + numero;
	}

	@Override
	LocalTime entradaGimnasio(LocalTime horaEntrada) {
		return horaEntrada;
	}

	@Override
	LocalTime salirGimnasio() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	double mensualidad() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		return "\n" + "Socio Resto = " + "\n" + super.toString();
	}

}
