package practicasReales;

public class WebInfo {

public static void main(String[] args) {
		
		System.out.println("Bienvenido a la pagina de compras de ropa.");
		System.out.println("Es un usuario nuevo?");
		String yep=Teclado.readString();
		if(yep.equals("si")||yep.equals("Si")) {Compras.register();}
		
		boolean acceso=Compras.login();
		if(acceso==true) {
		    System.out.println("Disponemos de los siguientes productos: ");
		    Compras.getList();
		    System.out.println("Que producto desea comprar: ");
		    int productID=Teclado.readInt();
		    String seleccionado= Compras.getProduct(productID);
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		}
		else {}
		}
}
