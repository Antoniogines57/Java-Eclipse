package puntos;

public class Punto {
	private double x, y;
	
	public Punto() {
		
	}
	public Punto(double x, double y) {
		this.x=x;this.y=y;
	}
	public Punto(Punto m) {
		x=m.getX();y=m.getY();
	}
	/*
	public Punto Punto(Punto p) {
		return new Punto();
	}
	*/
	public double getX() {return x;}
	public double getY() {return y;}
	public String toString() {
		return "[ "+x+" , "+y+" ]";
	}
	public void setX(double x) {
		this.x=x;
	}
	public Punto copiar() {
		return new Punto(x,y);
	}
	
}


class Test{
	public static void main(String[]args) {
		Punto cero=new Punto(0,0);
		Punto arg=new Punto(cero);
		arg.setX(8);
		System.out.println(arg);
		System.out.println(cero);
	}
}