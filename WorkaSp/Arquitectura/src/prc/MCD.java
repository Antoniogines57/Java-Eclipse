package prc;

public class MCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Introduzca un numero entero: ");
		int a = utilidades.Teclado.readInt();
		System.out.println("Introduzca otro numero entero: ");
		int b = utilidades.Teclado.readInt();
		
		while (a!=b){
			        if(a<b){
			        	b=b-a;
			        	}
			        else {a=a-b;}
		            }
		System.out.println("El minimo comun divisor es: "+a);
	}
		
		
		
}

