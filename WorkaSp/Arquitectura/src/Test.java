import utilidades.Teclado;

public class Test{
	public static void main(String[]args) {
	}
	public static double[] medias(double [][]sum) {
		double[] fin=new double[sum.length];
		for(int i=0; i<sum.length;i++) {
			double count=0;
			for(int j=0;j<sum[i].length;j++) {
				count+=sum[i][j];
			}
			fin[i]=count/sum[i].length;
		}
		return fin;
	}
	
	public static void stress() {
		int n=Teclado.readInt();
		double contador=0;
		int divisor=1;
		while(n>0) {
			contador+=1/divisor;
			divisor++;
			divisor*=-1;
			n--;
		}
		System.out.println(contador);
	}
	
	public static int cuentaRepetidos(int[]arr, int n) {
		int count=0;
		for(int i=0; i< arr.length;i++) {
			if(arr[i]==n) count++;
		}
		return count;
	}
	public static int masOcurrente(int[] arr) {
		int aux=0;
		int[] frecuencia=new int[100];
		for(int m=0; m<frecuencia.length;m++) {
			frecuencia[m]=0;
		}
		for(int i=0;i<arr.length;i++) {
			++frecuencia[arr[i]];
		}
		int aux1=0;
		int fina=0;
		for(int k=0;k<frecuencia.length;k++) {
			if(aux1<frecuencia[k]) {
				aux1=frecuencia[k];
				fina=k;
			}
		}
		return fina;
	}
}