package masqueputa;

public class Fibonazi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Introzca un valor maximo de numeros: ");
		int limite=Teclado.readInt();
		int a=1, b=1, c=0;
		while (c<limite) {
			c=b+a;
			System.out.println(c);
			a=b;
			b=c;
		}
		
		
		
	}

}
