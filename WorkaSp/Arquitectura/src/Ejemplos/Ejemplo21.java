package Ejemplos;

public class Ejemplo21 {

	
	public static void main(String [] args){
		
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("CADENAS DE CARACTERES");
		System.out.println("La salida por consola se puede hacer mediante System.out.println(texto)");
		System.out.println("Los caracteres especiales se imprimen con secuencias de escape");
		System.out.println("hola \\ \n que tal\t tabulador, comillas \" ");
		System.out.println();
		
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("CARACTERES");		
		char a = 'a';
		char b = 'b';
				
		System.out.println("Los caracteres se pueden comparar");
		System.out.println("a > b es " + (a > b));
		System.out.println();
		
		System.out.println("Los caracteres se pueden sumar, restar, dividir,... pero ...");
		System.out.println("el resultado debe asignarse a una variable numérica.");
		int c = a + b;
		int d = a % b;
		int e = a / b;
		System.out.println("int c = 'a' + 'b' = " + c);
		System.out.println("La variable numérica puede convertirse en char (cast explícito).");
		char f = (char)c;
		System.out.println("char f = (char)c = " + f);
		System.out.println();
		
		System.out.println("Los caracteres que no aparecen en el teclado se pueden sustituir por su codigo:");
		System.out.println("\\u007e = " + '\u007e');
								
	}
}
