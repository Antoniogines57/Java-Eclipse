package septiembre_2016;
import utilidades.Teclado;
public class GestionHotel {
	private Habitacion[] hotel1;
	
	public GestionHotel(int numeroHabitaciones) {
		hotel1=new Habitacion[numeroHabitaciones];
		for(Habitacion clero:hotel1) {
			clero=null;
		}
	}
	public void reservarHabitacion() {
		System.out.println("Introduzca su nombre: ");
		String nombre=Teclado.readString();
		System.out.println("Introduzca su DNI: ");
		int dni=Teclado.readInt();
		System.out.println("Introduzca el dia,mes y año de entrada: ");
		Fecha fentrada=new Fecha(Teclado.readInt(),Teclado.readInt(),Teclado.readInt());
		System.out.println("Introduzca el dia,mes y año de salida: ");
		Fecha fesalida=new Fecha(Teclado.readInt(),Teclado.readInt(),Teclado.readInt());
		for(int i=0;i<hotel1.length;i++) {
			if(hotel1[i]==null) {
				hotel1[i]=new Habitacion(nombre, dni, fentrada, fesalida);
				System.out.println("Su habitacion es la número: "+i+1);
				break;
			}
		}
	}
	public void anularReserva(int dni, int habitacion) {
		if(hotel1[habitacion-1].getDNI()==dni) {
			hotel1[habitacion-1]=null;
			System.out.println("Reserva cancelada con éxito. ");
		}
		else System.out.println("El DNI no coincide.");
	}
}
