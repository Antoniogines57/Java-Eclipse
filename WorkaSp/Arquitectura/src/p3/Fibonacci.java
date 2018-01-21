package p3;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=1, b=1, c;
		int count=1;
		
		while(count<50){
			System.out.println(a);
			c=b+a;
			a=b;
			b=c;
			count++;
		}
	}

}