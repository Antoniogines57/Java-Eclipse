package Ejemplos;

public class Ejemplo22 {

	public static void main(String[] args) {
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("VARIABLES NUMÉRICAS");			
		
		System.out.println();
		System.out.println("Observe que la operación de módulo tiene signo: (7%3) = "  + (( 7)%3));	
		System.out.println("Observe que la operación de modulo tiene signo: (-7%3) = " + ((-7)%3));	
		System.out.println("La operación de modulo puede aplicarse a los tipos reales: (-7.12%3) = " + ((-7.12)%3));
		System.out.println("La operación de modulo puede aplicarse a los tipos reales: (-7.12%3.2) = " + ((-7.12)%3.2));
		System.out.println();
		System.out.println("La división por cero en los tipos reales: (7.0/0) = " + (7.0/0));	
		System.out.println("no produce error sino un valor especial");		
		System.out.println();
		
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("DESBORDAMIENTO DE VARIABLES ENTERAS");			
		System.out.println("Mucho cuidado con los desbordamientos de las variables enteras.");		
		System.out.println("Java no deja escribir valores fuera de rango, pero si el desbordamiento");	
		System.out.println("se produce como consecuencia de una operación matemática, ");			
		System.out.println("el sistema no informa de error, se vuelve a \"contar\" desde el principio.");
		System.out.println("Máximo valor int = 2147483647");	
		System.out.println("2147483647 + 1 = " + (2147483647 + 1));			
		System.out.println("2147483647 * 2 = " + (2147483647 * 2));		
		
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("PRECISION FINITA DE VARIABLES REALES");			
		System.out.println("Las variables reales tienen precisión finita y variable en su rango.");
		float  z1 = 1f / 3f;
		System.out.println("float   z1 = (float)(1f / 3f) = " + z1);
		z1 = 100000f / 3f;
		System.out.println("float   z1 = (float)(100000f / 3f) = " + z1);
		z1 = 10000000f / 3f;
		System.out.println("float   z1 = (float)(10000000f / 3f) = " + z1);
		System.out.println("La precisión va disminuyendo a medida que aumenta el valor absoluto del número.");
		System.out.println();
		z1 = 200100f; 
		System.out.println("z1 = 200100f,  el valor de z1 almacenado es:       " + z1);
		z1 += 1f; 
		System.out.println("z1 = 200100f, el valor almacenado para z1+1 es:    " + z1);
		z1 = 200100f; 
		z1 += 11f;
		System.out.println("z1 = 200100f, el valor almacenado para z1+11 es:   " + z1);
		z1 = 200100f; 
		z1 += 111f; 
		System.out.println("z1 = 200100f, el valor almacenado para z1+111 es:  " + z1);
		z1 = 200100f; 
		z1 += 1111f; 
		System.out.println("z1 = 200100f, el valor almacenado para z1+1111 es: " + z1);
		System.out.println("Llega un momento en que la precisión es menor que la unidad, la decenas ... ");		
		z1 = 200000100f; 
		System.out.println("z1 = 200000100f,  el valor de z1 almacenado es:       " + z1);
		z1 += 1f; 
		System.out.println("z1 = 200000100f, el valor almacenado para z1+1 es:    " + z1);
		z1 = 200000100f; 
		z1 += 11f;
		System.out.println("z1 = 200000100f, el valor almacenado para z1+11 es:   " + z1);
		z1 = 200000100f; 
		z1 += 111f; 
		System.out.println("z1 = 200000100f, el valor almacenado para z1+111 es:  " + z1);
		z1 = 200000100f; 
		z1 += 1111f; 
		System.out.println("z1 = 200000100f, el valor almacenado para z1+1111 es: " + z1);
		


	}

}
