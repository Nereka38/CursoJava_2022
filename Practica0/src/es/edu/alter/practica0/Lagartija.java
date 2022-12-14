package es.edu.alter.practica0;

public class Lagartija extends PiedraPapelTijeraFactory {
	
	public Lagartija() {
		this("lagartija", LAGARTIJA);
	}
	
	
	public Lagartija(String nombre, int pNumero) {
		super(nombre, pNumero);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isMe(int pNumero) {
		return pNumero == LAGARTIJA;
	}

	@Override
	public int comparar(PiedraPapelTijeraFactory pPiedraPapelTijera) {
		int result = 0;
		int gana = 1;
		int pierde = -1;
		int numeroRecibido = pPiedraPapelTijera.getNumero();
		

		switch (numeroRecibido) {
		case TIJERA:
		case PIEDRA:
			result = pierde;
			descripcionResultado = nombre + " Pierde contra " + pPiedraPapelTijera.getNombre();			
			break;
		case PAPEL:
		case SPOCK:
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
