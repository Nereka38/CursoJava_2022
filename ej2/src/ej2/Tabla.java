package ej2;

import java.util.Scanner;

public class Tabla {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ingrese un numero para ver su tabla:");
		
		int i = sc.nextInt();
		
		System.out.println("Tabla del número:" + i);
		
		for(int j = 1 ; j<=10; j++) {
			System.out.println(i + "*" + j + "=" + i*j);
		}

	}

}
