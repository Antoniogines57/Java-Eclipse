package pc;
import utilidades.Teclado;

public class Compras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int C123=354;
		int eleccion,  precio;
		int p1=30, p2=25, p3=50, p4=20, p5=60, p6=80;
		
		System.out.println("Disponemos de estos productos:"
				+ "\n1. Camiseta Zara: " +p1 +"$"
				+ "\n2. Camiseta Pull&Bear: " +p2 +"$"
				+ "\n3. Pantalon H&M: " +p3 +"$"
				+ "\n4. Zapatos Decathlon: " +p4 +"$"
				+ "\n5. Abrigo Primark: " +p5 +"$"
				+ "\n6. Abrigo Levi's: " +p6 +"$"
				);
		
		
		//----------------------------------------------------------------------
		System.out.println("\n\nIntroduzca el numero del producto que desea.");
		eleccion = utilidades.Teclado.readInt();
		
		if (eleccion == 1) {
		System.out.println("\nHa seleccionado: " + "Producto nº 1");
		}
		else if (eleccion == 2) {
			System.out.println("\nHa seleccionado: " + "Producto nº 2");
			}
		else if (eleccion == 3) {
			System.out.println("\nHa seleccionado: " + "Producto nº 3");
			}
		else if (eleccion == 4) {
			System.out.println("\nHa seleccionado: " + "Producto nº 4");
			}
		else if (eleccion == 5) {
			System.out.println("\nHa seleccionado: " + "Producto nº 5");
			}
		else if (eleccion == 6) {
			System.out.println("\nHa seleccionado: " + "Producto nº 6");
			}
		//----------------------------------------------------------------------
		char eleccionboo;
		System.out.println("\n\nQuiere consultar el saldo disponible \nen su cuenta?\n"
				+ "\nEn caso de querer introduzca \"y\","
				+ "\nEn caso de no querer introduzca \"n\".");
		eleccionboo = utilidades.Teclado.readChar();
		
		if (eleccionboo == 'y' || eleccionboo == 'Y') {
			System.out.println("\nEl saldo de su cuenta es: "+ C123);
		}
		//----------------------------------------------------------------------
		System.out.println("\nDesea realizar la compra?"
		        + "\nEn caso de querer introduzca \"y\","
		        + "\nEn caso de no querer introduzca \"n\".");
		char eleccionbo2 = utilidades.Teclado.readChar();
		int C124=C123;
		
		if (eleccionbo2 == 'y' || eleccionbo2 =='Y') {
			switch (eleccion) {
			case 1:{
				precio = p1;
				C124 = C123-precio;
				System.out.println("\nLa compra se ha realizado satisfactoriamente."
				    		          + "\nGracias por su visita.");
				break;
			       }
			case 2:{
			    precio = p2;
			    C124 = C123-precio;
			    System.out.println("\nLa compra se ha realizado satisfactoriamente."
			    		          + "\nGracias por su visita.");
			    break;
		       }
			case 3:{
			    precio = p3;
			    C124 = C123-precio;
			    System.out.println("\nLa compra se ha realizado satisfactoriamente."
			    		          + "\nGracias por su visita.");
			    break;
		       }
			case 4:{
			    precio = p4;
			    C124 = C123-precio;
			    System.out.println("\nLa compra se ha realizado satisfactoriamente."
			    		          + "\nGracias por su visita.");
			    break;
		       }
			case 5:{
			    precio = p5;
			    C124 = C123-precio;
			    System.out.println("\nLa compra se ha realizado satisfactoriamente."
			    		          + "\nGracias por su visita.");
			    break;
		       }
			case 6:{
			    precio = p6;
			    C124 = C123-precio;
			    System.out.println("\nLa compra se ha realizado satisfactoriamente."
			    		          + "\nGracias por su visita");
			    break;
		       }
			default: System.out.println("No ha seleccionado ningun producto.");
			}
		}
		else {
			System.out.println("No ha realizado ninguna compra. \nGracias por su visita.");
		}
		//----------------------------------------------------------------------------------
		if (eleccionboo == 'y' || eleccionbo2 == 'y') {
			if (C124>=C123) {System.out.println("\nEl saldo de su cuenta no ha variado.");}
			else if (C124<C123) {System.out.println("\nEl saldo de su cuenta ha desdencido a: "+C124+".");
			}
		}
	}

}
