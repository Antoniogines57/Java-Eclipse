package septiembre_2012;

public class Administrativi implements Funcionario {
	private int nivel;
	private String categoria;
	private boolean jefe;
	
	public Administrativi() {
		
	}
	@Override
	public int getNivel() {
		// TODO Auto-generated method stub
		return nivel;
	}

	@Override
	public String getCategoria() {
		// TODO Auto-generated method stub
		return categoria;
	}
	public boolean esJefeSeccion() {
		return jefe;
	}
}
