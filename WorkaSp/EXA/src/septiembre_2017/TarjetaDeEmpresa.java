package septiembre_2017;

public class TarjetaDeEmpresa implements ITarjetaVisita{
	private TarjetaPersonal personal;
	private String job;
	public TarjetaDeEmpresa(String nombre, String correo, String puesto) {
		personal=new TarjetaPersonal(nombre, correo);
		job=puesto;
	}
	public String getNombre() {
		return personal.getNombre();
	}
	public String getEmail() {
		return personal.getEmail();
	}
	public String getJob() {
		return job;
	}
	public String toString() {
		return getNombre()+", "+getEmail()+", "+getJob()+" de la empresa.";
	}

}
