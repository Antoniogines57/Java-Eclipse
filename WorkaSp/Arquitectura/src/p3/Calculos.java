package p3;

public class Calculos {

	public static float PiEuler (long cantidad){
		float resultado=1;
		if (cantidad>0){
			float a=0, n=1, d=1, t=1;
			for(;cantidad>0;cantidad--){
				a+=(n/d);
				t=d;
				d=t*(t+1);
				resultado=a*4;
			}	
		}
		else {resultado=-1;}
		return resultado;
	}
	
	public static long potenciaEntera(long base, int exponente){
		long resultado=1;
		for (;exponente>0;exponente--){
			resultado*=base;
		}
		return resultado;
	}
	
	public static long Factorial(long numero){
		long resultado=1;
		if (numero>0){
			for(; numero>0; numero--) {
				  resultado=resultado*numero;
				  }
		}
		else {resultado=-1;}
		
		return resultado;
	}
	
	public static float PiLeibniz(int cuantos){
		float n=1, d=1,a=0;
		if(cuantos>0){
		for (int i=0;i<=cuantos;i++){
			a+=(n/d);
			d+=2;
			n=-n;
		}
		a= a*4;}
		else {a=-1;}
		
		return a;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		float pii=PiEuler(15);
		System.out.print(pii);
	}
	
}
