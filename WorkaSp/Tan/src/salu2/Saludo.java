package salu2;

public class Saludo {
	private String mensaje;
	public Saludo(String frase) {
		mensaje=frase;
	}
	public void Saludar() {
		System.out.println(mensaje);
	}
	public void setSaludo(String mens) {
		mensaje=mens;
	}
}
