package Curso;

import java.util.Scanner;

public class UsoSwitch2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduce dia de la semana, por favor ");

		String dia_semana = entrada.nextLine();
		
		String resultado = switch (dia_semana) {
			
		case "Lunes", "Martes", "Miercoles", "Jueves", "Viernes" -> "Laborable";
				
		case "Sabado", "Domingo" -> "Festivo";
		
		default ->{ 
			System.out.println("Procesando.......");
			yield "Día no vallido";
		}
		
		};
		System.out.println(resultado);
	}

}
