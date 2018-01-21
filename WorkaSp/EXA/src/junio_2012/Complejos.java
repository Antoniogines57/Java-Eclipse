package junio_2012;

public class Complejos {
	private double raw, tita;
	public Complejos(double roe, double teta) {
		raw=roe; tita=teta;
	}
	public Complejos(double real, double imaginaria, boolean put_false) {
		raw=Math.sqrt(real*real+imaginaria*imaginaria);
		tita=Math.atan(imaginaria/real);
	}
	public double getRealPart() {
		return raw;
	}
	public double getImaginaryPart() {
		return tita;
	}
	public void setRaw(double num) {
		raw=num;
	}
	public void setTita(double num) {
		tita=num;
	}
	public Complejos mult(Complejos k) {
		return new Complejos(k.getRealPart()*raw, k.getImaginaryPart()+tita);
	}
	public Complejos divv(Complejos k) {
		return new Complejos(k.getRealPart()/raw,k.getImaginaryPart()-tita);
	}
	public Complejos powwd(int num) {
		return new Complejos(Math.pow(raw, num), tita*num);
	}
	
}
