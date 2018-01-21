package seccion28_class91;

public class Producto {
	private int ID;
	private String nombre;
	private double precio;
	private static int contProd;
	
	public Producto() {
		ID=contProd;
		contProd++;
	}
	public Producto(String nombre, double precio) {
		this();
		this.nombre=new String(nombre);
		this.precio=precio;
	}
	public String getNombre() {return new String(nombre);}
	public void setNombre(String nombre) {
		this.nombre=new String(nombre);
	}
	public double getPrecio() {return precio;}
	public void setPrecio(double precio) {
		if(precio>0) {
			this.precio=precio;
		}
	}
	public String toString() {
		return "Producto: "+nombre+", Precio: "+precio
				+"\nID: #"+ID;
	}
	public void toString(String ceroN) {
		System.out.print("Producto: "+nombre+", Precio: "+precio+"�"
				+"\nID: #"+ID);
		System.out.println(ceroN);
	}
}
