package es.edu.alter.practica0;

public class Papel extends PiedraPapelTijeraFactory {


	public Papel() {
		this("papel", PAPEL);
	}
	
	public Papel(String nombre, int pNumero) {
		super(nombre, pNumero);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isMe(int pNumero) {
		return pNumero == PAPEL;
	}

	@Override
	public int comparar(PiedraPapelTijeraFactory pPiedraPapelTijera) {
		int result = 0;
		int gana = 1;
		int pierde = -1;
		int numeroRecibido = pPiedraPapelTijera.getNumero();
		
		switch (numeroRecibido) {
		case TIJERA:
			result = pierde;
			descripcionResultado = nombre + " Pierde contra " + pPiedraPapelTijera.getNombre();			
			break;
		case PIEDRA:
			result = gana;
			descripcionResultado = nombre + " Gana contra " + pPiedraPapelTijera.getNombre();			
			break;
		case SPOCK:
			result = gana;
			descripcionResultado = nombre + " Gana contra " + pPiedraPapelTijera.getNombre();			
			break;
		case PAPEL:
			result = pierde;
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
