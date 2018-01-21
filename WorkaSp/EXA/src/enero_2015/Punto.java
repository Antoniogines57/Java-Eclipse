package enero_2015;

public class Punto {
	private double X, Y;
	public Punto(double X, double Y) {
		this.X=X;this.Y=Y;
	}
	public double getX() {return X;}
	public double getY() {return Y;}
	public double distancia(Punto p1) {
		return Math.sqrt((p1.getX()-X)*(p1.getX()-X)+(p1.getY()-Y)*(p1.getY()-Y));
	}
	
}
