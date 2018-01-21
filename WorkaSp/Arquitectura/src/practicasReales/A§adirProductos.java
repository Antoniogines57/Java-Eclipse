package practicasReales;
class AñadirProductos {

	private static void main(String[] args) {
		// TODO Auto-generated method stub

		String producto=Teclado.readString();
		int precio=Teclado.readInt();
		Compras.addProducto(producto, precio);
		
	}

}
