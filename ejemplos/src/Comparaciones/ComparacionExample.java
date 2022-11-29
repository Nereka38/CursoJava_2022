package Comparaciones;

import java.util.Set;
import java.util.TreeSet;

import figuras.Circulo;
import figuras.Cuadrado;
import figuras.Figura;
import figuras.Triangulo;
import figuras.exceptions.FiguraException;

public class ComparacionExample {

	public static void main(String[] args) throws FiguraException {
		Set<String> listNombres = new TreeSet<String>();
		listNombres.add(new String("Pepe"));
		listNombres.add(new String("Pipo"));
		listNombres.add(new String("Pepa"));
		listNombres.add(new String("Pape"));
		listNombres.add(new String("Popi"));
		
		int i = 1;
		
		for(String nombre : listNombres)
			System.out.println(i++ + " nombre = " + nombre);
		
		Set<Figura> figuras = new TreeSet<Figura>();
		figuras.add(new Cuadrado("Cuadrado",10));
		figuras.add(new Cuadrado("Cuadradito",30));
		figuras.add(new Circulo("Circulo",20));
		figuras.add(new Circulo("Circulito",45));
		
		int f = 1;
		
		for(Figura nombre : figuras)
			System.out.println(f++ + " figura-" + nombre);
		
	}

}
