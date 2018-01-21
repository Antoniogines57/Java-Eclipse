package cortana;
import utilidades.Teclado;
public class Cliente {
	private String ID;
	private String nombre;
	private String apellidos;
	private int DNI;
	private String password;
	private Fecha deNacimiento;
	
	public Cliente() {
	}
	public Cliente(String ID) {
		System.out.println("Introduzca solamente su nombre: ");
		nombre=Teclado.readString();
		System.out.println("Introduzca sus apellidos: ");
		apellidos=Teclado.readString();
		System.out.println("Introduzca su numero de DNI: ");
		DNI=Teclado.readInt();
		System.out.println("Introduzca su dia de nacimiento: ");
		int d=Teclado.readInt();
		System.out.println("Introduzca su mes de nacimiento: ");
		int m=Teclado.readInt();
		System.out.println("Introduzca su año de nacimiento: ");
		deNacimiento=new Fecha(d,m,Teclado.readInt());
		System.out.println("Introduzca una contraseña: ");
		password=Teclado.readString();
		this.ID=new String(ID);
	}
	public boolean login() {
		System.out.println("Introduzca su contraseña: ");
			if(Teclado.readString().equals(password)) {
				return true;
			}
			else return false;
	}
	public void setPassword() {
		System.out.println("Introduzca su contraseña actual: ");
		if(Teclado.readString().equals(password)) {
			System.out.println("Introduzca su nueva contraseña: ");
			password=new String(Teclado.readString());
		}
		else System.out.println("Contraseña incorrecta.");
	}
	public void setNombre() {
		System.out.println("Introduzca su contraseña actual: ");
		if(Teclado.readString().equals(password)) {
			System.out.println("Introduzca su nombre: ");
			nombre=new String(Teclado.readString());
		}
		else System.out.println("Contraseña incorrecta.");
	}
	public void setApellidos() {
		System.out.println("Introduzca su contraseña actual: ");
		if(Teclado.readString().equals(password)) {
			System.out.println("Introduzca sus apellidos: ");
			apellidos=new String(Teclado.readString());
		}
		else System.out.println("Contraseña incorrecta.");
	}
	public String getName() {
		return new String(nombre);
	}
	public String getApellidos() {
		return new String(apellidos);
	}
	public int getDNI() {
		return DNI;
	}
	public Fecha getNacimiento() {
		return deNacimiento.newFecha();
	}
	public String getID() {
		return new String(ID);
	}
	
}
