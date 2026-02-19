package ej5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Fruta f1 = new Fruta("Pomelo"/* nombreFruta */, "Berlín" /* procedencia */, 5 /* nkilos */, 4 /* precioKilo */,
				5 /* precioVentaKilo */);
		Fruta f2 = new Fruta("Pera", "España", 8, 5, 7);
		Fruta f3 = new Fruta("Coco", "Portugal", 10, 7, 11);

		System.out.println(f1.toString());
		System.out.println(f2.toString());

		if (Fruta.mismaProcedencia(f1, f2))
			System.out.println("Tienen la misma procedencia");
		else
			System.out.println("No tienen la misma procedencia");
		
		f2.vender(4);
		
		System.out.println("La rebaja del precio del tercer cargamento es de :"+f3.rebajarPrecioVentaKilo(2));

		System.out.println("El beneficio total obtenido por el almacén es de: "+ Fruta.getBeneficioAlm());

	}

}
