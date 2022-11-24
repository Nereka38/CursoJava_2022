/**
 * 
 */
package figuras;

import figuras.exceptions.FiguraException;

/**
 * @author Nerea
 *
 */
public class Cuadrado extends Figura {
	private float lado;

	/**
	 * @return the lado
	 */
	public float getLado() {
		return lado;
	}

	/**
	 * @param lado the lado to set
	 * @throws FiguraException
	 */
	public void setLado(float lado) throws FiguraException {
		if (lado < 0)
			throw new FiguraException("El valor del lado no puede ser negativo");

		this.lado = lado;
	}

	// constructores
	public Cuadrado() {
	}

	public Cuadrado(String pNombre, float plado) throws FiguraException {
		super(pNombre);
		setLado(plado);
	}

	@Override
	public float calcularPerimetro() {
		return lado * 4;
	}

	@Override
	public float calcularSuperficie() {
		return lado * lado;
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj) && obj instanceof Cuadrado && ((Cuadrado) obj).getLado() == lado;
	}

	@Override
	public int hashCode() {
		return super.hashCode() + (int) lado;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(super.toString());
		sb.append(", lado-");
		sb.append(lado);
		return sb.toString();
	}

}
