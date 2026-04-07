package ej4;

public class Externo extends Empleado {
	private String empProcedencia;

	public Externo(String nombre, String dni, String direccion, String tfno, String empProcedencia) {
		super(nombre, dni, direccion, tfno);
		this.empProcedencia = empProcedencia;
	}

	@Override
	public String toString() {
		return "Externo : [Empresa a la cual procede :" + empProcedencia + "] " + super.toString();
	}

}