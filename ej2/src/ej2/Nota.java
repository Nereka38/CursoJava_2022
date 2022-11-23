package ej2;

import java.util.Scanner;

public class Nota {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ingrese nota del alumno:");
		
		int i = sc.nextInt();
		
		if (i<50) {
			System.out.println("Suspenso");
		}
		
		if (i>=50 && i<=75) {
			System.out.println("Recuperar");
		}
		
		if (i>=76 && i<=90) {
			System.out.println("Aprobado");
		}
		
		if (i>=91 && i<=100) {
			System.out.println("Aprobado con Mérito");
		}
		
		System.out.println("Puntuación inválida");
	}

}
