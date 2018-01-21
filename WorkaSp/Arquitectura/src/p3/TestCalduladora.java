package p3;

public class TestCalduladora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int cantidad=5;
		float numpi=Calculos.PiLeibniz(cantidad);
		System.out.println(numpi);
		
		
		long base=6;
		long fact=Calculos.Factorial(base);
		System.out.println(fact);
		
		long numbase=2;
		int exp=7;
		long numero=Calculos.potenciaEntera(numbase, exp);
		System.out.println(numero);
		
		long cantpi=5;
		float numpi2=Calculos.PiEuler(cantpi);
		System.out.println(numpi2);
	}

}
