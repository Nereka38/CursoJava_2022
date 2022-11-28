package com.capgemini.training.java.ej2;

public class Pila {
	
	
	public static void main(String[] args) {
		MiPila pila = new MiPila();
		pila.pop();
		pila.push("Tardes");
		pila.peek();
		pila.reverse();
		System.out.println(pila);
	}
	
}
