package week1.day2;

public class Fibonacci {

	public static void main(String[] args) {
		int n = 8;
		int a = 0;
		int b = 1;
		System.out.println("Fibonacci series:");
		for (int i = 1; i <=n; i++) {
			System.out.println(a + "");
			int c = a+b;
			a=b;
			b=c;
		}
	
	}

}
