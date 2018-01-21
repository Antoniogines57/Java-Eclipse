package pc;

public class segundaputa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Tu madre es puta, salvi
		
		System.out.println("Nº Votos Jackal:");
		int jackal=Teclado.readInt();
		if(jackal>10) {jackal=10;}
		
		System.out.println("Nº Votos Valkyre:");
		int valkyre=Teclado.readInt();
		if(valkyre>10) {valkyre=10;}
		
		System.out.println("Nº Votos Buck:");
		int buck=Teclado.readInt();
		if(buck>10) {buck=10;}
		
		System.out.println("Nº Votos LordChanka:");
		int tachanka=Teclado.readInt();
		
		double total= jackal+valkyre+buck+tachanka;
		
		System.out.println("\nEl porcentaje de Jackal es:"
				+ "\n"+((jackal/total)*100)+"%");
		System.out.println("\nEl porcentaje de Valkyre es:"
				+ "\n"+((valkyre/total)*100)+"%");
		System.out.println("\nEl porcentaje de Buck es:"
				+ "\n"+((buck/total)*100)+"%");
		System.out.println("\nEl porcentaje de LordChanka es:"
				+ "\n"+((tachanka/total)*100)+"%");
	
		System.out.println("\n\nJackal: "+jackal
				+ "\nValkyre: "+valkyre
				+ "\nBuck: "+buck
				+"\nLordChanka: "+tachanka);
	
	
	}
	

}
