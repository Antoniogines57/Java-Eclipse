package salu2;

import colombia.Teclado;

public class Persona {
	private String name;
	private String apellido1;
	private String apellido2;
	private Saludo elSaludo;
	
	public Persona (String nombre) {
		name=nombre;
	}
	public void setSaludo() {
		elSaludo.setSaludo(Teclado.readString());
	}
	public void saludo(String mensaje) {
		elSaludo.setSaludo(mensaje);
	}
	public void Saludar() {
		elSaludo.Saludar();
	}
	
}
