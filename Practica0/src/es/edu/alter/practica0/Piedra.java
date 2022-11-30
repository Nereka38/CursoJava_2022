package es.edu.alter.practica0;

public class Piedra extends PiedraPapelTijeraFactory {

	public Piedra() {
		this("piedra", PIEDRA);
	}
	
	public Piedra(String nombre, int pNumero) {
		super(nombre, pNumero);
	}

	@Override
	public boolean isMe(int pNumero) {
		return pNumero == PIEDRA;
	}

	@Override
	public int comparar(PiedraPapelTijeraFactory pPiedraPapelTijera) {
		int result = 0;
		int gana = 1;
		int pierde = -1;
		int numeroRecibido = pPiedraPapelTijera.getNumero();
		
		switch (numeroRecibido) {
		case PAPEL:
			result = pierde;
			descripcionResultado = nombre + " Pierde contra " + pPiedraPapelTijera.getNombre();			
			break;
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
