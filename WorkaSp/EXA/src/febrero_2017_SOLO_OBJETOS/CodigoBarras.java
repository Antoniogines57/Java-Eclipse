package febrero_2017_SOLO_OBJETOS;

public class CodigoBarras {
	private int[] barCode;
	
	public CodigoBarras() {
		barCode=new int[10];
		for(int i=0;i<barCode.length;i++) {
			barCode[i]=0;
		}
	}
	public CodigoBarras(int[] max) {
		if(max.length==10) {
			boolean aux=true;
			for(int i=0;i<max.length;i++) {
				if(max[i]<0||max[i]>9) aux=false;
			}
			if (aux==true) barCode=max;
		}
	}
	public int[] getCodigo() {
		if(barCode==null) return null;
		for(int k:barCode) {
			System.out.print(k);
		}
		System.out.println("");
		return barCode;
	}
}
