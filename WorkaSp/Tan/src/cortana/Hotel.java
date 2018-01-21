package cortana;
import java.util.ArrayList;
import utilidades.Teclado;
public class Hotel {
	private Habitacion[] habitaciones;
	private String nombre;
	private String owner;
	private ArrayList<Trabajador> trabajadores=new ArrayList<Trabajador>();
	private String direccion;
	ArrayList<Cliente> clientes=new ArrayList<Cliente>();
	
	public Hotel(String name, int numberOfRooms) {
		if(name!=null&&name.equals(" ")==false) {
			if(numberOfRooms>0) {
				nombre=new String(name);
				habitaciones=new Habitacion[numberOfRooms];
				for(int i=0;i<habitaciones.length;i++) {
					habitaciones[i]=null;
				}
			}
			else {
				System.out.println("Numero de habitaciones introducido erroneo.");
			}
		}
		else {
			System.out.println("El nombre introducido no es valido.");
		}
	}
	public String getName() {
		return new String(nombre);
	}
	public void setOwner(String dato) {
		if(dato!=null&&dato.equals(" ")==false) {
			owner=new String(dato);
		}
		else {
			System.out.println("Nombre introducido no es valido.");
		}
	}
	public void setDireccion(String calle) {
		if(calle!=null&&calle.equals(" ")==false) {
			direccion=new String(calle);
		}
		else {
			System.out.println("Direccion introducida erronea.");
		}
	}
	public void reservarHabitacion() {
		System.out.println("Introduzca su nombre de usuario: ");
		String nam=Teclado.readString();
		Cliente actual=null;
		for(Cliente kl:clientes) {
			if(kl.equals(nam)==true) {
				if(kl.login()==true) {
					actual=kl;
				}
			}
		}
		
		System.out.println("Disponemos de las siguientes habitaciones: ");
		System.out.println(" ");
		for(int i=0;i<habitaciones.length;i++) {
			if(habitaciones[i]==null) {
				System.out.println("Habitacion "+(i+1)+" disponible.");
			}
		}
		System.out.println(" "); System.out.println(" ");
		System.out.println("Introduzca el numero de la habitacion que desea reservar: ");
		int el=Teclado.readInt()-1;
		if(habitaciones[el]!=null&&el>=habitaciones.length) {
			System.out.println("Numero de habitacion no disponible");
		}
		else {
			System.out.println("Introduzca la fecha de entrada: ");
			Fecha deEntrada=new Fecha(Teclado.readInt(),Teclado.readInt(),Teclado.readInt());
			System.out.println("Introduzca la fecha de salida: ");
			Fecha deSalida=new Fecha(Teclado.readInt(),Teclado.readInt(),Teclado.readInt());
			if(deEntrada.fechaAnteriorA(deSalida)==false) {
				habitaciones[el].reserva(el, actual, deEntrada, deSalida);
			}
			else {
				System.out.println("Fecha de salida anterior a la de entrada.");
			}
		}
		/*
		private void setMaxRoom() {
			
		}
		*/
	}
	public void cancelarReserva() {
		System.out.println("Introduzca su numero de habitacion: ");
		habitaciones[Teclado.readInt()-1].cancelarReserva();
	}
}
