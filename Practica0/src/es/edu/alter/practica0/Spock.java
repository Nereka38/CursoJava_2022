package es.edu.alter.practica0;

public class Spock extends PiedraPapelTijeraFactory {
	
	public Spock() {
		this("spock", SPOCK);
	}

	public Spock(String nombre, int pNumero) {
		super(nombre, pNumero);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isMe(int pNumero) {
		return pNumero == SPOCK;
	}

	@Override
	public int comparar(PiedraPapelTijeraFactory pPiedraPapelTijera) {
		int result = 0;
		int gana = 1;
		int pierde = -1;
		int numeroRecibido = pPiedraPapelTijera.getNumero();
		
		
		switch (numeroRecibido) {
		case PAPEL:
		case LAGARTIJA:
			result = pierde;
			descripcionResultado = nombre + " Pierde contra " + pPiedraPapelTijera.getNombre();			
			break;
		case PIEDRA:
		case TIJERA:
			result = gana;
			descripcionResultado = nombre + " Gana contra " + pPiedraPapelTijera.getNombre();			
			break;

		default:
			result = 0;
			descripcionResultado = nombre + " Empata contra " + pPiedraPapelTijera.getNombre();			
			break;
		}
		
		return result;
	}

}
