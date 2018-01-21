package pc;

public class Piso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter = 0;
		System.out.println("Introduzca el dinero que posee.");
		int Dinero = utilidades.Teclado.readInt();
		while ( Dinero > 0) {
			Dinero -=30;
			counter +=1;
		}
		System.out.println("\nTiene dinero suficiente para "
				+ "\npagar "+counter+" meses de alguiler.");
	}

}
