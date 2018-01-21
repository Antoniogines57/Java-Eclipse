package prc;

public class Divisiblepor11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Introduzca un valor limite(a ser posible menor que 11)");
		int limite = utilidades.Teclado.readInt();
		int numero = 0;
		
		System.out.println("Usamos el metodo \"For\"");
		for (numero=11; numero < limite ;   numero +=11)
		{
			System.out.println(numero);
		}
		
		System.out.println("----------------------------------------------");
		System.out.println("Ahora usamos el metodo \"While\"");
		
		int numero2 =0;
		while(numero2<limite){
			numero2 +=11;
			System.out.println(numero2);
		
		}
		
		System.out.println("----------------------------------------------");
		System.out.println("Ahora usamos el metodo \"Do While\"");
		
		int numero3 =0;
		do { numero3+=11;
		    System.out.println(numero3);
		   }
		while (numero3<limite)
			;
	}

}
