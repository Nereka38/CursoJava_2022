package modulo1;

import java.util.Scanner;

/**
 * 
 * @author nefernan
 * Este es un ejemplo del ingreso de datos y ver como se utiliza parad diferentes operaciones
 */
public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = new String("Hola");
		
		System.out.println("ingrese un numero");
		
		int i = sc.nextInt();
		
		int nro = (int)(Math.random()*100);
		System.out.println("loteria...;" + nro);
		if(nro==i)
			System.out.println("¡Ganaste!");
		else
			System.out.println("¡No has ganado!");
		

	}

}
