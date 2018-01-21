package junio_2012;

public class Main {
	private static Poligono[] polis;
	public static void main(String[]args) {
		polis=new Poligono[10];
		for(int i=0;i<polis.length;i++) {
			if(Math.random()<0.5) {
				polis[i]=new Triangulo();
			}
			else {
				polis[i]=new Triangulo();
			}
		}
		for(int m=0;m<polis.length;m++) {
			System.out.println(polis[m].getArea()+" m^2, "+polis[m].getPerimetro()+" m.");
			if(polis[m] instanceof Triangulo) {
				System.out.println("Altura: "+((Triangulo)polis[m]).getAltura()+"m. Base: "
						+((Triangulo)polis[m]).getBase()+"m.");
			}
			else if(polis[m] instanceof Rectangulo) {
				System.out.println("Diagonal: "+((Rectangulo)polis[m]).getDiagonal()+".");
			}
		}
		
	}
}
