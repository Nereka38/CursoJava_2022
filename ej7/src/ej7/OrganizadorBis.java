package ej7;

/**
 * @author Nerea
 *
 *Ordena un array de manera ascendente
 *
 */
public class OrganizadorBis {
	
	public static void main(String[] args) {
		
		int [] array = new int[] {2,4,76,5,8,1};
		ordenar(array);
		System.out.println("");

	}
	
	public static int[] ordenar (int [] input) {
		ordenar(input, input.length);
		return input;
	}
	
	private static int[] ordenar(int [] input, int i) {
		
		if (i > 1)
		    ordenar(input,i-1);

		  int j = i-1;
		  int auxiliar = input[j];

		  while ((j>0) && (input[j-1] > auxiliar)) {
		    input[j] = input[j-1];
		    j--;
		  }
		  input[j] = auxiliar;
		  
		  return input;
		}
	
}
