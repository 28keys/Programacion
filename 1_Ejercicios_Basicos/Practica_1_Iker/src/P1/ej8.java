package P1;

import java.util.Scanner;

public class ej8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*8. Programa que dada una variable t que contiene un tiempo en segundos, nos
		muestre dicho tiempo expresado en horas, minutos y segundos.*/
		
		int t; //2 horas
		int calcularHora, calcularMinuto, calcularSegundo;
		int restoHora, restoMinuto;
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce el numero de segundos a convertir");
		t = sc.nextInt();
		
		calcularHora = t / 3600;
		restoHora = t % 3600;
		
		calcularMinuto = restoHora / 60;
		restoMinuto = restoHora % 60;
		
		calcularSegundo = restoMinuto;
		
		System.out.println("t equivalen a: "+calcularHora+" horas "+calcularMinuto+" minutos "+calcularSegundo+" segundos");
	
		
				
		
		// está perfect hahhaha me enorgullece haberlo hecho por mis propios metodos :p
	
	}

}
