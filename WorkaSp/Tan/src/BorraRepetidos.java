
public class BorraRepetidos {

	public static int[] eliminaRepetidos(int[] a) {

		if (a == null || a.length == 0)
			return null;

		int b[] = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			b[i] = a[i];
		}

		// Ordenamos el array

		int aux = 0;

		for (int p = 0; p < b.length; p++) {
			for (int i = 0; i < b.length - 1 - p; i++) {
				if (b[i] > b[i + 1]) {
					aux = b[i];
					b[i] = b[i + 1];
					b[i + 1] = aux;
				}
			}
		}
		int cont = 0;
		for (int i = 0; i < b.length - 1; i++) {
			if (b[i] == b[i + 1])
				cont++;
		}
		int k = 0;
		int[] c = new int[b.length - cont];
		/*for (int i=0; i<b.length-1; i++){
           if (b[i]!=b[i+1]) 
              res[j++]=b[i];
        }*/
		for (int i = 0; i < b.length; i++) {
			if (i == (b.length - 1)) {
				c[k] = b[i];
			} else if (b[i] != b[i + 1]) {
				c[k] = b[i];
				k++;
			}
		}
		return c;
	}

	
	
    public static int [] eliminaRepetidosExamen(int [] a){

        if (a==null || a.length==0) return null;

        int [] b = new int [a.length];
        for ( int i = 0; i<b.length; i++){ 
            b[i]=a[i];
        }

      int intercambio;
       for (int p = 0; p < b.length-1; p++ ){
         for (int i = 0 ; i < b.length- 1- p; i++){
               if (b[i] > b[i+1]){
                 intercambio = b[i];
                 b[i] = b[i+1];
                 b[i+1] = intercambio;
               }
             }
        }

        int contador=0;
        for (int i=0; i<b.length-1; i++){
           if (b[i]==b[i+1]) contador++;
        } 
        
  int j=0;
        int [] res = new int [b.length-contador];
        for (int i=0; i<b.length-1; i++){
           if (b[i]!=b[i+1]) 
              res[j++]=b[i];
        }
       
        return res;
    }

	public static void printMatrizInt(int a[]) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2,2,3,2,3,2,5,4};

		printMatrizInt(eliminaRepetidos(a));
		System.out.println();
		printMatrizInt(eliminaRepetidosExamen(a));
		;
	}

}
