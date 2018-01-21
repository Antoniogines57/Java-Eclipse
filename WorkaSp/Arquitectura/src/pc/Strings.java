package pc;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String[] nombres= {"Maria","Sergio","Cristian","Javi","Elena"};
		String[] apellidos= {"Segado","Lopez","Collado","Hernandez","Garcia"};
		
		System.out.println("Introduzca un nombre\n(primera letra en mayusculas)");
		String introducido=utilidades.Teclado.readString();
		
		if (introducido.equals(nombres[0]) || introducido.equals(nombres[1]) || introducido.equals(nombres[2]) || introducido.equals(nombres[3]) || introducido.equals(nombres[4]) ) {
			System.out.println("\nEl nombre completo es: "
					+ "\n"+introducido+" "+apellidos[0]);
		}
		else {System.out.println("El nombre introducido no consta en\nnuestra base de datos");}
		
	}

}
