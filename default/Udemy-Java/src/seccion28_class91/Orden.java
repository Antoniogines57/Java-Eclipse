package seccion28_class91;

public class Orden {
	private final int IDorden;
	private final Producto[] aComprar;
	private static int conntCompras;
	private int contProd;
	private static final int maxProd=10;
	
	public Orden() {
		IDorden=conntCompras; conntCompras++;
		aComprar=new Producto[maxProd];
	}
	public void addProd(Producto aC) {
		if(contProd<maxProd) {
			aComprar[contProd++]=aC;
		}
		else {
			System.out.println("M�ximo de productos alcanzado.");
		}
	}
	public double calcularTotal() {
		double total=0;
		for(Producto k:aComprar) {
			total+=k.getPrecio();
		}
		return total;
	}
	public void mostrarOrden() {
		System.out.println("Compra n�: "+IDorden+
				"\nPrecio total: "+calcularTotal()+
				"\nProductos: \n");
		System.out.println("---------------------------------");
		for(Producto k:aComprar) {
			k.toString("\n");
		}
		System.out.println("---------------------------------");
	}
	
	
	
}