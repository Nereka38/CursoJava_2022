/**
 * 
 */
package figuras;

/**
 * @author nefernan
 *
 */
public class Circulo extends Figura {
	private float radio;
	
	//constructores
	public Circulo( ) {}
	
	public Circulo(String nombre, float pRadio) {
		super(nombre);
		radio = pRadio;
	}

	/**
	 * @return the radio
	 */
	public float getRadio() {
		return radio;
	}

	/**
	 * @param radio the radio to set
	 */
	public void setRadio(float radio) {
		this.radio = radio;
	}

	@Override
	public float calcularPerimetro() {
		return 2* (float)Math.PI * radio;
	}

	@Override
	public float calcularSuperficie() {
		return (float)Math.PI * (float) Math.pow(radio, 2);
	}

	@Override
	public int hashCode() {
		return super.hashCode() + (int)radio;
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj) &&
		obj instanceof Circulo &&
		((Circulo)obj).getRadio() == radio;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(super.toString());
		sb.append(", radio-");
		sb.append(radio);
		return sb.toString();
	}
	
	
}
