package cochesElectricosExamen;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Coche coches [];
		int cont, opc, pos;
		String mat, cod;
		Scanner sc=new Scanner(System.in);
		do {
		System.out.println("Introduce número de coches (2-10)");
		cont= sc.nextInt();
		} while (cont < 2 || cont > 10);
		
		
		coches=new Coche[cont];
		
		for (int i=0; i<cont; i++) {
			System.out.println("Introduce matrícula:");
			mat=sc.nextLine();
			if (mat.matches("[0-9]{4}[A-Z]{3}"))
				coches[i]=new Coche(mat);
			else {
				System.out.println("Matrícula incorrecta");
				i--;
			
				}
			}
		
		do {
			System.out.println("Elige una opción:\n1.Reservar\n2.Alquilar\n3.Estacionar\n4.Liberar");
			opc=sc.nextInt();
			switch(opc) {
			case 1:
				for(int i=0;i<cont;i++)
					if(coches[i].getEstado()==0)
						System.out.println(coches[i].toString()+ " "+ i);
				try {
				System.out.println("Anota la posición del coche a reservar:");
				pos=sc.nextInt();
				if (coches[pos].reservar()==null)
						System.out.println("No se ha podido reservar, estado incorrecto");
					}catch(InputMismatchException e) {
						System.out.println("No has anotado un número");
					}catch(IndexOutOfBoundsException e) {
						System.out.println("Posición incorrecta");
					}
					break;
					
			case 2:
				System.out.println("Introduce matrícula: ");
				mat= sc.nextLine();
				pos= buscar(coches,mat);
				if(pos==-1)
					System.out.println("No existe ningún coche con esa matrícula");
				else {
					System.out.println("Anota código del vehículo: ");
					cod=sc.nextLine();
					if(coches[pos].alquilar(cod))
						System.out.println("Coche alquilado con éxito");
					else
						System.out.println("No he podido alquilar");
				}
				break;
				
			case 3:
				System.out.println("Introduce matrícula: ");
				mat= sc.nextLine();
				pos= buscar(coches,mat);
				if(pos==-1) 
					System.out.println("El coche no existe");
					else {
						double imp = coches[pos].estacionar();
						if(imp==0)
							System.out.println("No se ha podido estacionar");
						else
							System.out.println("Tienes que pagar:"+ imp +"euros");
					}
					break;
					
			case 4:
				liberarCoches(coches);
				break;
			}
				} while(opc!=5);
		System.out.println("Actualmente:"+ Coche.getAlquilados() + "alquilados,"+ Coche.getReservados()+ "reservados");
	
	}

	public static void liberarCoches(Coche coches[]) {
		for (int i=0; i<coches.length;i++) {
			coches[i].liberar();
			}
		}
	
	
	public static  int buscar(Coche coches [], String mat) {
		for (int i=0; i<coches.length; i++) {
			if(coches[i].getMatricula().equalsIgnoreCase(mat))
				return i;
	}
		
	return -1;
	}	
}
