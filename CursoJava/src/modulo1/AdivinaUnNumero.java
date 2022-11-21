package modulo1;

import java.util.Scanner;

public class AdivinaUnNumero {

	public static void main(String[] args) {
		// 1- consigna es el ordenador elige un numero entre 0 y 100
		// 2- El participante ingresa un numero
		// 3- El sistema debe indicar si es mayor o menor al numero elegido por el ordenador
		// 4- Se deberan contar los intentos
		//nota debera utilizarse algun tipo de ciclo
		// al finalizar debera felicitar y decir en cuantos intentos lo logro
		
		
		
		Scanner sc= new Scanner (System.in);
		System.out.println("Ingrese un número: ");
		int i = sc.nextInt();
		
		int nro =(int)(Math.random()*100);
		System.out.println(nro);
		
		int index = 0;
		
		while (i != nro) {
			
			if(i>nro) {
				System.out.println("El numero ingresado es mayor al asignado por el ordenador. Sigue intentandolo");
				System.out.println("Ingrese un número: ");
				i = sc.nextInt();
				index++;
				
			}
			
			if(i<nro) {
				System.out.println("El numero ingresado es menor al asignado por el ordenador. Sigue intentandolo");
				System.out.println("Ingrese un número: ");
				i = sc.nextInt();
				index++;
			}
			
			else {
				break;
			}
			
		}
		if (i == nro) {
			System.out.println("¡Número correcto! Número de intentos: " + index);
		}
		
	}

}
