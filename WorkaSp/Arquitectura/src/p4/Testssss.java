package p4;

public class Testssss {

	public static void main(String[] args) {
		int[]a= {1,2,3,4,5,9};
		int[]b= {6,7,8,9,0,7};
		int[]res=ProcesarArrays.alternarElementos(a, b);
		for(int lol=0;lol<res.length-1;lol++) {
			System.out.println(res[lol]);
		}
		
		System.out.println();
		System.out.println();
		System.out.println("----------------------------------------------------------");
		System.out.println();
		System.out.println();
		
		int[]z= {3,4,5,6,1,4,2,4,5,3,4,2,1,4};
		int[] ocurrencias=ProcesarArrays.indices(z, 4);
		System.out.print("{");
		for(int al=0;al<ocurrencias.length-1;al++) {
			System.out.print(ocurrencias[al]+", ");
		}
		System.out.print(" }");
	}

}
