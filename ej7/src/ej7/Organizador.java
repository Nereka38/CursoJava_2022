package ej7;

public class Organizador {

	public static void main(String[] args) {
		
		int [] input = new int[] {2,4,76,5,8,1};
		output(input);

	}
	
	private static int[] output (int[] input) {
		int auxiliar;
		for (int i = 0; i < input.length-1; i++) {
	        for (int j = 1; j < input.length; j++) {
	            if (input[j-1] > input[j]) {
	                auxiliar = input[j-1];
	                input[j-1] = input[j];
	                input[j] = auxiliar;
	            }
	        }

	    }
	    return input;
	}
}
