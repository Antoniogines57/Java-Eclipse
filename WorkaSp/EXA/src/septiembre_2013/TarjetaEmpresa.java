package septiembre_2013;

public class TarjetaEmpresa implements TarjetaDeVisita {
	private String cargo;
	private TarjetaPersonal tarjeta;
	
	public TarjetaEmpresa(String nombre, String email, String puesto) {
		cargo=new String(puesto);
		tarjeta=new TarjetaPersonal(new String(nombre), new String(email));
	}
	public String getNombre() {
		return new String(tarjeta.getNombre());
	}
	public String getEmail() {
		return new String(tarjeta.getEmail());
	}
	public String getPuesto() {
		return new String(cargo);
	}

}
