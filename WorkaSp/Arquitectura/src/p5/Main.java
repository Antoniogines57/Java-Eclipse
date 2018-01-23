package p5;

public class Main {
	public static void main(String[]args) {
		PoligonoRegular[] arrayPoligonos1=new PoligonoRegular[6];
		arrayPoligonos1[0]=new PoligonoRegular(3, 10);
		for (int i=1;i<arrayPoligonos1.length;i++) {
			arrayPoligonos1[i]=
				new PoligonoRegular((int)(arrayPoligonos1[i-1].getPerimetro()/arrayPoligonos1[i-1].getLado()), 10);
		}
		
		for(PoligonoRegular k:arrayPoligonos1) {
			System.out.println(k);
			System.out.println("");
			System.out.println("-------------------");
			System.out.println("");
		}
		
		
		
	}
}
