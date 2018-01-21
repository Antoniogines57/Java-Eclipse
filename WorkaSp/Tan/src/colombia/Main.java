package colombia;
public class Main {	
	public static void main(String[]args) {
		System.out.println("Hola como te llamas?");
		String arg=Teclado.readString();
		if(arg.equals("Salvi")||arg.equals("salvi")) {
			System.out.println("Hola salvi, El rey de las magadalenas y las drojas duras, aunque no me importen las blandas.");
		}
		else if(arg.equals("jason")||arg.equals("Jason")) {
			System.out.println("Hola soy Jeison, el rey de mi droja");
		}
		else if(arg.equals("mela")||arg.equals("Mela")) {
			System.out.println("Soy mela el rey del pueblo");
		}
		else if(arg.equals("gilipollas")||arg.equals("Gilipollas")) {
			System.out.println("OK.oq");
		}
		else {
		System.out.println("Ecantado de conocerte "+arg);
		}
	}
		
}
