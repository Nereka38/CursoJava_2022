package ej6;

public class Pc extends ItemInventario implements BarcodeReadable{
	
	public int nroSerie;
	public boolean esNotebook;
	public int barcode;
	
	Pc(int nroSerie, boolean esNotebook, int barcode) {
		this.esNotebook = esNotebook;
		this.nroSerie = nroSerie;
		this.barcode = barcode;
	}
	
	public int getID () {
		return nroSerie;
	}
	
	public int getBarcode() {
		return barcode;
	}
}
