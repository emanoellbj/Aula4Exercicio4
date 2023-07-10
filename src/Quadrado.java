
public class Quadrado implements Figura{
	
	private double lado;

	public Quadrado(double lado) {
		setLado(lado);
	}

	@Override
	public double calcularArea() {
		return lado * lado;
	}

	@Override
	public double calcularPerimetro() {
        return 4 * lado;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

}
