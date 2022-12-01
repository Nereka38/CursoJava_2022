package com.capgemini.training.java.ej2;


public class PilaGeneric {
	
	public static void main(String[] args) {
		MiPila pila = new MiPila();
		pila.push("Hola");
		pila.push("Adios");
		pila.push("Buenas");
		System.out.println("Lista original");
		System.out.println(pila.toString());
		
		pila.pop();
		pila.push("tal");
		pila.reverse();
		System.out.println("Lista invertida");
		System.out.println(pila.toString());

		System.out.println("Ultimo elemento; " + pila.peek());
	}

}