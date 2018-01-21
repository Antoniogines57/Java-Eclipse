package Ejemplos;

public class Ejemplo23 {

	public static void main(String[] args) {
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("EXPRESIONES BOOLEANAS");	
		boolean ba = true;
		boolean bb = false;
		System.out.println("Devuelven true o false. ");
		System.out.println("Con variables booleanas los operadores | y || y & y && son funcionalmente equivalentes. ");
		System.out.println("boolean ba = true, bb = false -> ");				
		System.out.println("ba|bb  = " + (ba|bb));
		System.out.println("ba||bb = " + (ba||bb));
		System.out.println("ba&bb  = " + (ba&bb));
		System.out.println("ba&&bb = " + (ba&&bb));		
		System.out.println();
		
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("NOTACIîN HEXADECIMAL");
		int y2 =  0x9; 
		int y3 = -0x9;
					
		System.out.println("int y2 = " + y2 + "\tHEX -> " + Integer.toHexString(y2));
		System.out.println("int y3 = " + y3 + "\tHEX -> " + Integer.toHexString(y3));	
		
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("OPERACIONES SOBRE BITS");
		System.out.println("Con variables enteras los operadores | y & trabajan bit a bit y devuelven un entero. ");		
		System.out.println("short ia = 0xff, ib = 0xaa, ic = 0x55");
		short ia = 0xff;
		short ib = 0xaa;	
		short ic = 0x55;
		System.out.println("ib | ic = 0x" + Integer.toHexString(ib|ic) + " = " + Integer.toBinaryString(ib|ic));
		System.out.println("ia & ib = 0x" + Integer.toHexString(ia&ib) + " = " + Integer.toBinaryString(ia&ib));
		System.out.println("ia & ic = 0x" + Integer.toHexString(ia&ic) + " =  " + Integer.toBinaryString(ia&ic));
		System.out.println();
		
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("CLASE Math");
		System.out.println("El valor absoluto de -67 es: " + Math.abs(-67));
		System.out.println("La ra’z cuadrada de 56.4 es: " + Math.sqrt(56.4));
		System.out.println("El seno de PI/4 es         : " + Math.sin(Math.PI/4));

	}

}
