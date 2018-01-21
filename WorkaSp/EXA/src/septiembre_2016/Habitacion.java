package septiembre_2016;

public class Habitacion {
	private String name; private int DNI;
	private Fecha entrada, salida;
	private char fumador;
	
	public Habitacion(String nombre, int dni, Fecha fEntrada, Fecha fSalida) {
		name=nombre; DNI=dni; entrada=fEntrada; salida=fSalida;
	}
	public String getName() {return name;}
	public int getDNI() {return DNI;}
	public Fecha getFechaEntrada() {return entrada;}
	public Fecha getFechaSalida() {return salida;}
	public char getFumador() {return fumador;}
}
