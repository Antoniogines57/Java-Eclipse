package Ejemplos;
import utilidades.Teclado;
public class miejemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char b = 'b' ;
		char l = 'l' ;
	
		System.out.println("B es menor que L: b < l : " + (b < l));
		System.out.println("---------------------------------------------");
		
		System.out.println("Indice su edad y pulse intro.");
		int edad = (10 * utilidades.Teclado.readInt());
		
		System.out.println("Mi edad es: " + edad 
				+ ", por tanto 10 veces mi edad en hexadecimal será: " 
				+Integer.toHexString(edad));
		System.out.println("---------------------------------------------");
		
		System.out.println("La tabla del operador logico se redacta de la forma: aa|bb");
		
		System.out.println( "");
		System.out.println( " a   |    b    |      ");
		System.out.println( " a   |    b    |      ");
		System.out.println( " a   |    b    |      ");
		
		
	}

}
