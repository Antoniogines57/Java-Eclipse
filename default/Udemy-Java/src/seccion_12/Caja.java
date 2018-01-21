package seccion_12;

public class Caja {
	public static int numerocajas=0;
	private double ancho, profundo, alto;
	
	public Caja(double ancho, double profundo, double alto) {
		this.ancho=ancho;this.profundo=profundo;this.alto=alto;
		numerocajas++;
	}
	public Caja() {
		ancho=0;profundo=0;alto=0;
		numerocajas++;
	}
	
	public void setAncho(double ancho) {this.ancho=ancho;}
	public void setProfundo(double profundo) {this.profundo=profundo;}
	public void setAlto(double alto) {this.alto=alto;}
	
	public double getVolumen() {return alto*ancho*profundo;}
	public String toString() {
		return "ancho: "+ancho+", profundo: "+profundo+", alto: "+alto;
	}
	
}

class Test{
	public static void main(String[]args) {
		System.out.println(Caja.numerocajas);
		Caja mia=new Caja(4,2,1);
		System.out.println(Caja.numerocajas+": "+mia+".");
		
	}
}
