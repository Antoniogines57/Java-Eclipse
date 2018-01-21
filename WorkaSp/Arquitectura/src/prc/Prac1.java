package prc;
import utilidades.Teclado;

public class Prac1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Introduzca el valor de la variable a:");
		int a = utilidades.Teclado.readInt();
		System.out.println("Introduzca el valor de la variable b:");
		int b = utilidades.Teclado.readInt();
		System.out.println("Introduzca el valor de la variable c:");
		int c = utilidades.Teclado.readInt();
		
		double x1 =((-b)+Math.sqrt((b*b)-(4*a*c))/2);
		double x2 =((-b)-Math.sqrt((b*b)-(4*a*c))/2);
		
		System.out.println("Las soluciones que resuelven la ecuacion son: "+x1 +", y: "+x2);
		
	}

}
