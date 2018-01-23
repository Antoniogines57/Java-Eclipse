package febrero_2017_SOLO_OBJETOS;

public class MAIN {
	public static void main(String[]args) {
		Lavadora bosch=new Lavadora(575.75, 640.59,"Gris", new CodigoBarras(new int[] {1,1,1,1,1,1,1,1,1,1}));
		System.out.println(bosch);
		System.out.println("");
		CodigoBarras alfaPack=new CodigoBarras(new int[] {1,5,4,3,7,9,1,3,5,8});
		bosch.getCodigo().getCodigo();
		
	}
}
