package febrero_2013;

public class Circunferencia implements IFormaCerrada{
	private double radio;
	public Circunferencia(double radio) {
		this.radio=radio;
	}
	public double getPerimetro() {
		return Math.PI*2*radio;
	}
	public double getArea() {
		 return Math.PI*radio*radio;
	}
	public double getRadio() {
		return radio;
	}

}
