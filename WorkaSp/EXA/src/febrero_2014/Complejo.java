package febrero_2014;

public class Complejo {
	private double modulo, argumento;
	public Complejo(double modulo, double argumento) {
		this.modulo=modulo;this.argumento=argumento;
	}
	public Complejo(char frecuencia, double real, double imag) {
		this.modulo=Math.sqrt(real*real+imag*imag);
		this.argumento=Math.atan(imag/real);
	}
	public double getMod() {return modulo;}
	public double getArg() {return argumento;}
	public Complejo multiplicar(Complejo kk) {
		return new Complejo(modulo*kk.getMod(),argumento+kk.getArg());
	}
	public Complejo dividir(Complejo kk) {
		return new Complejo(modulo/kk.getMod(), argumento-kk.getArg());
	}
	public Complejo potencia(int n) {
		return new Complejo(Math.pow(modulo, n),n*argumento);
	}
}
