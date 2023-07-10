
public class Circulo implements Figura{
	
	private double raio;
	
	

	public Circulo(double raio) {
		setRaio(raio);
	}

	@Override
	public double calcularArea() {
		return Math.PI * raio * raio;
	}

	@Override
	public double calcularPerimetro() {
        return 2 * Math.PI * raio;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

}
