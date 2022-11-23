package ej6;

public class Silla extends ItemInventario {
	
	public boolean conRueditas;
	public int lote;
	public int numeroDentroDeLote;
	
	Silla(int lote, int numeroDentroDeLote, boolean conRueditas) {
		this.lote = lote;
		this.numeroDentroDeLote = numeroDentroDeLote;
		this.conRueditas = conRueditas;
	}
	
	public int getID () {
			return lote * 1000 + numeroDentroDeLote;
		}
}
