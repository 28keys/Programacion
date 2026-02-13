package EJ3;

public class Alumno {

	private String matricula;
	private double notaBases, notaPro, notaSis, notaMedia;
	
	
	public Alumno(String matricula, double notaBases, double notaPro, double notaSis) {
		this.matricula = matricula;
		this.notaBases = notaBases;
		this.notaPro = notaPro;
		this.notaSis = notaSis;
		this.notaMedia=(this.notaBases+this.notaPro+this.notaSis)/3;
		
	}


	public double getNotaMedia() {
		return notaMedia;
	}
	
	public String getMatricula() {
	    return matricula;
	}

	
	


	
	

	
	
	
}
