package febrero_2013;

public class GestorFormas {
	private static IFormaCerrada[] arrayFormas;
	
	public TrianguloEquilatero[] getTriangulos() {
		int c=0;
		for(IFormaCerrada l: arrayFormas) {
			if(l instanceof TrianguloEquilatero) {c++;}
		}
		if(c==0) return null;
		TrianguloEquilatero[] triangulos=new TrianguloEquilatero[c];
		c=0;
		for(IFormaCerrada m:arrayFormas) {
			if(m instanceof TrianguloEquilatero) {
				triangulos[c]=(TrianguloEquilatero) m; c++;
			}
		}
		return triangulos;
	}
	public static void printFormas() {
		for(IFormaCerrada mol:arrayFormas) {
			System.out.print("El area es: "+mol.getArea());
			if(mol instanceof TrianguloEquilatero) {
				System.out.println(" , y tiene una altura de: "+
						((TrianguloEquilatero)mol).getHeigh());
			}
			else if(mol instanceof Circunferencia) {
				System.out.println(" , y tiene un radio de: "
						+((Circunferencia)mol).getRadio());
			}
		}
	}
}

