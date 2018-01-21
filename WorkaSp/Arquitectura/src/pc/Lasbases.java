package pc;

public class Lasbases {

	//-NO-ES-MI-ELABORACION---------------------------------// NO FUNCIONA
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_BLACK = "\u001B[30m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_BLUE = "\u001B[34m";
	public static final String ANSI_PURPLE = "\u001B[35m";
	public static final String ANSI_CYAN = "\u001B[36m";
	public static final String ANSI_WHITE = "\u001B[37m";
	//------------------------------------------------------//
	public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
	public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
	public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
	public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
	public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
	public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
	public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
	public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
	//------------------------------------------------------//
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Disponemos de una serie de programas:"
				+ "\n1. Introduccion de nombres y los imprime todos."
				+ "\n2. Selecciona y modifica un valor de la base de datos."
				+ "\n3. Programa nulo."
				+ "\n4. Introduccion de nombres en una base de datos."
				+ "\n\n Introduzca el numero del programa que desea utilizar: ");
		int programa=Teclado.readInt();
		switch (programa) {
		
		case 1:{
		//------------------------------------------------------//
	    System.out.println("\n");
			
		String[] base1= new String[10];
		System.out.println("Introduzca el nombre nº 1: ");
		base1[0]=utilidades.Teclado.readString();
		System.out.println("Introduzca el nombre nº 2: ");
		base1[1]=utilidades.Teclado.readString();
		System.out.println("Introduzca el nombre nº 3: ");
		base1[2]=utilidades.Teclado.readString();
		System.out.println("Introduzca el nombre nº 4: ");
		base1[3]=utilidades.Teclado.readString();
		System.out.println("Introduzca el nombre nº 5: ");
		base1[4]=utilidades.Teclado.readString();
		System.out.println("Introduzca el nombre nº 6: ");
		base1[5]=utilidades.Teclado.readString();
		System.out.println("Introduzca el nombre nº 7: ");
		base1[6]=utilidades.Teclado.readString();
		System.out.println("Introduzca el nombre nº 8: ");
		base1[7]=utilidades.Teclado.readString();
		System.out.println("Introduzca el nombre nº 9: ");
		base1[8]=utilidades.Teclado.readString();
		System.out.println("Introduzca el nombre nº 10: ");
		base1[9]=utilidades.Teclado.readString();
		
		for (int i=0; i<10; i++) {
			System.out.print("\n"+base1[i]);
		    }
		break;
		//------------------------------------------------------//
		}
		
		case 2: {
		//------------------------------------------------------//
		System.out.println("\n");
			
		String[] base2= new String[300];
		
		System.out.println("Que valor desea modificar");
		int a=Teclado.readInt();
		System.out.println("Que valor desea introducir?");
		base2[(a-1)]=Teclado.readString();
		break;
		//------------------------------------------------------//
		}
		
		case 3:{
		
		//------------------------------------------------------//
		System.out.println("\n\n");
			
		String[][] base3= {
				{},
				{},
				{},
				{}
		};
		break;
		//------------------------------------------------------//
		}
		
		case 4:{
		
		//------------------------------------------------------//
		System.out.println("\n");
		
		String[][] base4=new String[10][10];
		System.out.println("Introduzca el nombre nº 1: ");
		base4[0][0]=utilidades.Teclado.readString();
		System.out.println("Introduzca los apellidos (por separado)");
		base4[0][1]=utilidades.Teclado.readString();
		base4[0][2]=utilidades.Teclado.readString();
		System.out.println("Introduzca el nombre nº 2: ");
		base4[1][0]=utilidades.Teclado.readString();
		System.out.println("Introduzca los apellidos (por separado)");
		base4[1][1]=utilidades.Teclado.readString();
		base4[1][2]=utilidades.Teclado.readString();
		System.out.println("Introduzca el nombre nº 3: ");
		base4[2][0]=utilidades.Teclado.readString();
		System.out.println("Introduzca los apellidos (por separado)");
		base4[2][1]=utilidades.Teclado.readString();
		base4[2][2]=utilidades.Teclado.readString();
		System.out.println("Introduzca el nombre nº 4: ");
		base4[3][0]=utilidades.Teclado.readString();
		System.out.println("Introduzca los apellidos (por separado)");
		base4[3][1]=utilidades.Teclado.readString();
		base4[3][2]=utilidades.Teclado.readString();
		System.out.println("Introduzca el nombre nº 5: ");
		base4[4][0]=utilidades.Teclado.readString();
		System.out.println("Introduzca los apellidos (por separado)");
		base4[4][1]=utilidades.Teclado.readString();
		base4[4][2]=utilidades.Teclado.readString();
		System.out.println("Introduzca el nombre nº 6: ");
		base4[5][0]=utilidades.Teclado.readString();
		System.out.println("Introduzca los apellidos (por separado)");
		base4[5][1]=utilidades.Teclado.readString();
		base4[5][2]=utilidades.Teclado.readString();
		System.out.println("Introduzca el nombre nº 7: ");
		base4[6][0]=utilidades.Teclado.readString();
		System.out.println("Introduzca los apellidos (por separado)");
		base4[6][1]=utilidades.Teclado.readString();
		base4[6][2]=utilidades.Teclado.readString();
		System.out.println("Introduzca el nombre nº 8: ");
		base4[7][0]=utilidades.Teclado.readString();
		System.out.println("Introduzca los apellidos (por separado)");
		base4[7][1]=utilidades.Teclado.readString();
		base4[7][2]=utilidades.Teclado.readString();
		System.out.println("Introduzca el nombre nº 9: ");
		base4[8][0]=utilidades.Teclado.readString();
		System.out.println("Introduzca los apellidos (por separado)");
		base4[8][1]=utilidades.Teclado.readString();
		base4[8][2]=utilidades.Teclado.readString();
		System.out.println("Introduzca el nombre nº 10: ");
		base4[9][0]=utilidades.Teclado.readString();
		System.out.println("Introduzca los apellidos (por separado)");
		base4[9][1]=utilidades.Teclado.readString();
		base4[9][2]=utilidades.Teclado.readString();
		
		System.out.println("\n\n¿Que nombre desea imprimir?");
		int c=Teclado.readInt();
		System.out.println(base4[(c-1)][1]+" "+base4[(c-1)][2]+", "+base4[(c-1)][0]);
		break;
		//------------------------------------------------------//
		}
		case 5:{
		
		//------------------------------------------------------//
		
			
			
			
			
			
		//------------------------------------------------------//
		}
		
		default:{System.out.println("\n"); System.out.println("No ha introducido un valor valido"); break;}
		}
		
	}

}
