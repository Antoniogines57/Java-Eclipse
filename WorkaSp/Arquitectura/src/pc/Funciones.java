package pc;
import java.util.Arrays;
public class Funciones {

    public static double calcularArea(int base, int altura) {
    	double area = (double) base*altura;
		return area;	
    }
    
    public static double NumeroFibonacci(int cantidad) {
    	double numero=cantidad*(cantidad/2);
    	return numero;
    }
    static boolean VerdadMentira(String palabra) {
    	boolean resultado= (palabra.equals("Koala"));
    	return resultado;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int base=2;
		int altura=3;
		double area=Funciones.calcularArea(base, altura);
		System.out.println(area);
		System.out.println("Introduzca el nombre de un animal: ");
		String animal=Teclado.readString();
		if (Funciones.VerdadMentira(animal)) {
			System.out.println("Has acertado el animal.");
		}
		else {System.out.println("No has acertado el animal.");}
		
		String[] comparar1= {"Carlos","Paco","Fernando"};
		String[] comparar2=new String[3];
		comparar2[0]=Teclado.readString();
		comparar2[1]=Teclado.readString();
		comparar2[2]=Teclado.readString();
		
		if (comparar1[0].equals(comparar2[0])||comparar1[1].equals(comparar2[1])||comparar1[2].equals(comparar2[2])) {
			System.out.println("Los arrays coinciden");
		}
		else {System.out.println("Los arrays no coinciden");}
		
		/*    ESTO EN MORADO NO FUNCIONA IDK XQ   */
		
		/*
		if (comparar1.equals(comparar2)) {
			System.out.println("Los arrays coinciden al completo.");
		}
		else {System.out.println("Los arrays no coinciden");}*/
		
		//--------------------------------------------------------------------------------------//
		
		/*
		if (Arrays.equals(comparar1, comparar2)) {
			System.out.println("Los arrays coinciden al completo.");
		}
		else {System.out.println("Los arrays no coinciden");}*/

		//--------------------------------------------------------------------------------------//
		
		/*
		if (Arrays.deepEquals(comparar1, comparar2)) {
			System.out.println("Los arrays coinciden al completo.");
		}
		else {System.out.println("Los arrays no coinciden");}*/
		

		//--------------------------------------------------------------------------------------//
		
		/*
		boolean resultado = false;
		for (int i=0;i<=2;i++) {
			if(comparar1[i].equals(comparar2[i])) {
				resultado=true;
			}
			else {resultado=false;}
		}
		if(resultado==true) {
			System.out.println("Los arrays coinciden");
		}
		else {System.out.println("Los arrays no coinciden");}
		*/
		boolean kamikaze =java.util.Arrays.equals(comparar1, comparar2);
		
		if (kamikaze==true) {
			System.out.println("SI");
		}
		else if(kamikaze==false) {
			System.out.println("NO");
		}
	}
	
	

}
