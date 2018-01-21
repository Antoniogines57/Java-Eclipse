package segundaprc;
import utilidades.Teclado;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Introduzca el numero 1 y pulse enter. ");
		int num1 = utilidades.Teclado.readInt();
		
		System.out.println("Introduzca el numero 2 y pulse enter. ");
		int num2 = utilidades.Teclado.readInt();
		
		System.out.println("La suma de ambos es: " + (num1 + num2));
		System.out.println("La resta de ambos es: " + (num1 - num2));
		System.out.println("La multiplicacion de ambos es: " + (num1 * num2));
		System.out.println("La division de ambos es: " + (num1 / num2 ));
		System.out.println("El resto de la division es : " +(num1%num2)
				+ ", y el valos absoluto del primer término es : " +
				+ Math.abs(num1) + "." );
		
		
		
		
	}

}
