package ej5;

import java.util.ArrayList;

public class Orquesta {
	
	private static ArrayList<Instrumento> instrumentos = new ArrayList<Instrumento> ();

	public static void main(String[] args) {
		instrumentos.add(new Guitarra());
		instrumentos.add(new Piano());
		
		for(int i=0; i<instrumentos.size(); i++) {
			System.out.println(instrumentos.get(i).sonar());
		}
	}

}
