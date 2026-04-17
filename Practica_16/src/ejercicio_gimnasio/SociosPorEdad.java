package ejercicio_gimnasio;

import java.util.Comparator;

public class SociosPorEdad implements Comparator<Socio> {
	@Override
	public int compare(Socio o1, Socio o2) {
		if (o1.getFechaNacimiento().isAfter(o2.getFechaNacimiento()))
			return -1;
		if (o1.getFechaNacimiento().isBefore(o2.getFechaNacimiento()))
			return 1;
		else
			return 0;
	}

}
