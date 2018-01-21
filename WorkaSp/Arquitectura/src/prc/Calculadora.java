package prc;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Introduzca un numero entero: ");
		System.out.println("\n(Recuerde que si quiere realizar la division"
				+ "\no el residuo no debe introducir el segundo valor menor"
				+ "\nque el primero)");
		int a = utilidades.Teclado.readInt();
		System.out.println("Introduzca otro numero entero: ");
		int b = utilidades.Teclado.readInt();
		
		System.out.println("Pulse:"
				+ "\n1 Para sumar."
				+ "\n2 Para restar."
				+ "\n3 Para multiplicar"
				+ "\n4 Para dividir"
				+ "\n5 Para clacular el resto ");
		int opcion = utilidades.Teclado.readInt();
		switch (opcion){
		case 1:{
			System.out.println("El resultado de la operacion es: "+(a+b));
			break;
		}
		case 2:{
			System.out.println("El resultado de la operacion es: "+(a-b));
			break;
		}
		case 3:{
			System.out.println("El resultado de la operacion es: "+(a*b));
			break;
		}
		case 4:{if(b!=0){
			             System.out.println("El resultado de la operacion es: "+(a/b));
		                }
		        else {
		        	  System.out.println("Imposible	dividir	por	cero”");
		             }
		        break;
		}
		case 5:{if(b!=0){
                         System.out.println("El resultado de la operacion es: "+(a/b));
                         }
                else {
	                 System.out.println("Imposible	dividir	por	cero”");
                     }
		        break;
		}
		default: System.out.println("No ha seleccionado una opcion.");
		}
		
	}

}
