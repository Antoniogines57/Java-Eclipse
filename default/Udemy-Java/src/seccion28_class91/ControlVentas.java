package seccion28_class91;
import utilidades.Teclado;
public class ControlVentas extends Ventas{
	private final static String password="manolococo";
	public static void main(String []args) {
		System.out.println("Introduzca la contrase�a: ");
		if(Teclado.readString().equals(password)==true)
			{
			System.out.println("1. A�adir producto: ");
			System.out.println("2. Quitar producto producto: ");
			System.out.println("3. Volver a la pagina de ventas: ");
			System.out.println("Que operacion desea realizar: ");
			
			int res=Teclado.readInt();
			switch (res) {
				case 1: {
					lista[count]=new Producto();
					System.out.println("introduzca un nombre: ");
					lista[count].setNombre(Teclado.readString());
					System.out.println("introduzca el precio: ");
					lista[count++].setPrecio(Teclado.readDouble());
					break;
				}
				
				
				
				
				
				
				case 3:{
					System.out.println("Volviendo a la pagina de inicio.");
					Ventas.main(args);
					break;
				}
				default:{
					System.out.println("Operacion introducida incorrecta.");
					System.out.println("Desea reintentarlo(s/n):");
					if(Teclado.readString().equals("s")) {
						main(args);
					}
					else {
						Ventas.main(args);
					}
				}
				
			}
			System.out.println("Desea realizar otra operacion(s/n):");
			if(Teclado.readString().equals("s")) {
				main(args);
			}
			else {
				Ventas.main(args);
			}
		}
		else {
			System.out.println("Contrase�a incorrecta, desea reintentarlo(s/n): ");
			if(Teclado.readString().equals("s")) {
				ControlVentas.main(args);
			}
			else {
				Ventas.main(args);
			}
		}
	}
}