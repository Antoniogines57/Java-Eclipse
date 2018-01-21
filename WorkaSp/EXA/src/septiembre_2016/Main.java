package septiembre_2016;

public class Main {
	public static void main(String[]args) {
		GestionHotel hotelPrincipal=new GestionHotel(1000);
		hotelPrincipal.reservarHabitacion();
		hotelPrincipal.reservarHabitacion();
		hotelPrincipal.reservarHabitacion();
		hotelPrincipal.anularReserva(75454, 02);
	}
}
