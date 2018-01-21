
public class Diciembre17 {
	public static void main(String[]args) {
		String vel="Carlos";
		char[] al=new char[vel.length()];
		int count=0;
		for (char l:vel.toCharArray()) {
			al[count]=l;
			System.out.println(l);
			count++;
		}
	}
}
