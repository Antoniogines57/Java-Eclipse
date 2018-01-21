package septiembre_2013;

public class TarjetaPersonal implements TarjetaDeVisita {
	private String name, EMAIL;
	public TarjetaPersonal(String nombre,String email) {
		name=new String(nombre);
		EMAIL=new String(email);
	}
	public String getNombre() {
		return new String(name);
	}
	public String getEmail() {
		return new String(EMAIL);
	}

}
