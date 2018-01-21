package cursoJava;
import utilidades.Teclado;

public class ExcepcionesSimple {

	public static void main(String[] args) {
		
		int[] respuestas=new int[30];
		for(int i=0;i<respuestas.length-1;i++) {
			try {
				System.out.println("Introduzca el "+(i+1)+"º numero: ");
				respuestas[i]=Teclado.readInt();
			}
			catch (NumberFormatException nfe){
				System.out.println("El numero no es compatible");
			}
		}
	}
	
	
	
}
