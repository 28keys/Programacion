package Curso;

public class UsoArrays {

	public static void main(String[] args) {

		/*
		 * O : int [] miArray;
		 *  miArray = new int [5];
		 */
		/*
		int[] miArray = new int[5];
		miArray[0] = 5;
		miArray[1] = 15;
		miArray[2] = 51;
		miArray[3] = 53;
		miArray[4] = 95;
		*/
		int [] miArray = {5, 15, 51, 53, 95, 76, 54, 98, 34, 90, 67, 54, 98, 32 ,1, 0, 98, 97, 105 ,1, 2, 107};
		//System.out.println(miArray.length);
		
		for (int i = 0; i < miArray.length; i++) {
			
			System.out.println("Valor del indice "+i+ " igual a "+miArray[i]);
		}
	
		
	}

} 
