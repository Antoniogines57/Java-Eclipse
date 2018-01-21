package masqueputa;
import masqueputa.Teclado;
public class Regorda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Introduce un nombre: ");
		String nombre = Teclado.readString();
		System.out.println(nombre);
		System.out.println("\nEs es tu nombre? ");
		String verdad=Teclado.readString();
		if (verdad.equals("si")) {
			System.out.println("Cual es tu apodo: ");
			String apodo=Teclado.readString();
			System.out.println("\nEncantado de conocerte "+nombre+", "+apodo+".");
		}
		else {
			System.out.println("Entonces cual es tu nombre?");
			String nombre2=Teclado.readString();
			System.out.println("Y cual es tu apodo: ");
			String apodo2=Teclado.readString();
			System.out.println("Encantado de conocerte "+nombre2+", "+apodo2+".");
		}
		
		
		
	}

}
