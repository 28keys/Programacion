package ejercicio_gimnasio;

import java.time.LocalDate;
import java.time.LocalTime;

public abstract class Socio {
	private String nombre;
	private String apellido;
	private String tfno;
	private LocalDate fechaNacimiento;
	protected String codigoSocio;

	public Socio(String nombre, String apellido, String tfno, LocalDate fechaNacimiento) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.tfno = tfno;
		this.fechaNacimiento = fechaNacimiento;

	}

	
	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public String getCodigoSocio() {
		return codigoSocio;
	}

	abstract LocalTime entradaGimnasio(LocalTime horaEntrada);

	abstract LocalTime salirGimnasio();

	abstract double mensualidad();

	@Override
	public String toString() {
		return "Mi codigo de socio: " + codigoSocio + "\n" + "Tu nombre = " + nombre + ", Apellido = " + apellido
				+ ", Telefono = " + tfno + ", Fecha de nacimiento = " + fechaNacimiento;
	}

}