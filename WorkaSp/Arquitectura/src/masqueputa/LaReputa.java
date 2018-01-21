package masqueputa;
import masqueputa.Teclado;
public class LaReputa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Introduce un numero: ");
		int numero=Teclado.readInt();
		
		if (numero<0) {
			System.out.println("Tu madre es puta");
		}
		else {
			System.out.println("La tuya");
		}
	
	}
}
