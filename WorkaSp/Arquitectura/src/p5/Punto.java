package p5;
import java.text.DecimalFormat;

public class Punto implements IForma {

	private double X;
	private double Y;
	
	public Punto(){X=0; Y=0;}
	public Punto(double xx, double yy){X=xx;Y=yy;}
	public Punto(Punto p) {
		X=p.getX();Y=p.getY();
	}
	
	public void setPunto(double ejeX,double ejeY) {
		X=ejeX;
		Y=ejeY;
	}
	
	public double[] getPunto() {return new double[] {X,Y};}
	public double getX() {return X;}
	public double getY() {return Y;}
	public double getOrientacion() { return 0.0;}
	
	public Punto girar(double grados, double x0, double y0 ) {
		
		double gradosR=Math.toRadians(grados);
		if(grados==0) {X=x0;Y=y0;}
		else {
			X=x0*Math.cos(gradosR)+y0*Math.sin(gradosR);
			Y=x0*Math.sin(gradosR)+y0*Math.cos(gradosR);
		}
		return new Punto(X,Y);
        /*return new Punto(X,Y);*/
	}
	
	public Punto girar(double grados) {
		/*return new Punto(X,Y);*/
		double gradosR=Math.toRadians(grados);
		if(grados==0) return new Punto(X,Y);
		else {
			double X0=X*Math.cos(gradosR)+Y*Math.sin(gradosR);
			double Y0=X*Math.sin(gradosR)+Y*Math.cos(gradosR);
			return new Punto(X0,Y0);
		}
	}
	
	public Punto trasladar(double xx, double yy) {
		X+=xx;Y+=yy;
		return new Punto(X,Y);
	}
	
	public double distancia(double xx, double yy) {
		double ptoRespecto0X=X-xx;
		double ptoRespecto0Y=Y-yy;
		return Math.sqrt(Math.pow(ptoRespecto0X,2)+Math.pow(ptoRespecto0Y, 2));
	}
	public double distancia(Punto aux) {
		double ptoRespecto0X=aux.getX()-X;
		double ptoRespecto0Y=aux.getY()-Y;
		return Math.sqrt(Math.pow(ptoRespecto0X,2)+Math.pow(ptoRespecto0Y, 2));
	}
	
	public String toString() {
		DecimalFormat form=new DecimalFormat();
		form.setMaximumFractionDigits(2);
		form.setMinimumFractionDigits(2);
		return "[ " + form.format(X)+" , "+form.format(Y)+" ]";
	}
	@Override
	public double distancia(IForma forma) {
		// TODO Auto-generated method stub
		return Math.sqrt((forma.getX()-X)*(forma.getX()-X)+(forma.getY()-Y)*(forma.getY()-Y));
	}
	
}



class Test{
	public static void main(String[]args) {
		System.out.println("----------------");
		
		Punto ejer=new Punto(2,3).girar(90);
		double[] pos=ejer.getPunto();
		for(double el: pos) {
			System.out.print(el+" ");
		}
		System.out.println();
		System.out.println();
		System.out.println(new Punto(2,3).girar(90));
		System.out.println();
		System.out.println("----------------");
		System.out.println();
		/*
		double distan=new Punto().distancia(2, 1);
		System.out.println(distan);
		*/
		System.out.println(new Punto().distancia(2,0));
		System.out.println();
		System.out.println("----------------");
		System.out.println();
		/*
		String cadena=new Punto(3.2482,6.549).toString();
		*/
		System.out.println(new Punto(4.24522,544.2131));
		System.out.println();
		System.out.println("----------------");
		System.out.println();
		
		
		
		
	}
	
}
