package es.edu.alter.practica0;

public class Tijera extends PiedraPapelTijeraFactory {


	public Tijera() {
		this("tijera", TIJERA);
	}
	
	public Tijera(String nombre, int pNumero) {
		super(nombre, pNumero);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isMe(int pNumero) {
		return pNumero == TIJERA;
	}

	@Override
	public int comparar(PiedraPapelTijeraFactory pPiedraPapelTijera) {
		int result = 0;
		int gana = 1;
		int pierde = -1;
		int numeroRecibido = pPiedraPapelTijera.getNumero();
		
		switch (numeroRecibido) {
		case PIEDRA:
			result = pierde;
			descripcionResultado = nombre + " Pierde contra " + pPiedraPapelTijera.getNombre();			
			break;
		case LAGARTIJA:
			result = pierde;
			descripcionResultado = nombre + " Pierde contra " + pPiedraPapelTijera.getNombre();			
			break;
		case PAPEL:
			result = gana;
			descripcionResultado = nombre + " Gana contra " + pPiedraPapelTijera.getNombre();			
			break;
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
