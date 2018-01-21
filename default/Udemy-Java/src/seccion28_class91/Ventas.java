package seccion28_class91;

import utilidades.Teclado;

public class Ventas {
	protected static Producto[] lista=new Producto[100];
	protected static int count=0;
	protected static Orden actual=new Orden();
	
	public static void main(String[]args) {
		lista[count++]=new Producto("Pantalon Gucci", 200);
		lista[count++]=new Producto("Camisa Gucci", 130);
		lista[count++]=new Producto("Pantalon Dolce & Camino", 15);
		lista[count++]=new Producto("Chaqueta Paco Rizado", 26);
		
		
		System.out.println("Que operacion desea realizar: ");
		System.out.println("\n1. Gestionar productos."
				+"\n2. Realizar una compra. ");
		int el=Teclado.readInt();
		
		switch (el){
			case 1:{
				ControlVentas.main(args); break;
				}
			case 2:{
				System.out.println("Disponemos de los siguientes productos: ");
				for(Producto k:lista) {
					k.toString("");
				}
				System.out.println("introduzca un nombre de producto: ");
				String sID=Teclado.readString();
				int prod=0;
				for(int i=0;i<lista.length;i++) {
					if(lista[i].getNombre().equals(sID)) {
						prod=i; break;
					}
				}
				actual.addProd(lista[prod]);
				System.out.println("Desea comprar mas productos: ");
				if(Teclado.readString().equals("s")) {
					main(args);
				}
				else {
					actual.mostrarOrden();
				}
				break;
			}
			default:{
				System.out.println("Operacion introducida incorrecta: ");
				System.out.println("Desea reintentarlo(s/n):");
				if(Teclado.readString().equals("s")) {
					main(args);
				}
				else {
					break;
				}
			}
			
		}
		System.out.println("Encantado de poder atenderle!!");
		System.exit(0);
	}
}