package es.edu.alter.practica0;

import java.util.ArrayList;
import java.util.List;

public abstract class PiedraPapelTijeraFactory {
	public static final int PIEDRA =1;
	public static final int PAPEL =2;
	public static final int TIJERA =3;
	public static final int LAGARTIJA =4;
	public static final int SPOCK =5;
	
	protected String descripcionResultado;
	private static List<PiedraPapelTijeraFactory> elementos;
	protected String nombre;
	protected int numero;
	
	//constructor
	public PiedraPapelTijeraFactory(String nombre, int pNumero) {
		super();
		this.nombre = nombre;
		this.numero = pNumero;
	}
	
	//getter and setter

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	

	public String getDescripcionResultado() {
		return descripcionResultado;
	}
	
	//métodos de negocio
	public abstract boolean isMe(int pNumero);
	
	public abstract int comparar(PiedraPapelTijeraFactory pPiedraPapelTijera);
	
	public static PiedraPapelTijeraFactory getInstance(int pNumero) {
		elementos = new ArrayList<PiedraPapelTijeraFactory>();
		elementos.add(new Piedra());
		elementos.add(new Papel());
		elementos.add(new Tijera());
		elementos.add(new Lagartija());
		elementos.add(new Spock());
		
		for (PiedraPapelTijeraFactory piedraPapelTijeraFactory : elementos) {
			if(piedraPapelTijeraFactory.isMe(pNumero))
				return piedraPapelTijeraFactory;
		}
		
		return null;
		
	}
}
	
