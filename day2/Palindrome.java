package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		for (int i=10;i<=100;i++) {
			int n = i;
			int reverse = 0;
			while (n>0) {
				int rem = n%10;
				reverse = reverse*10+rem;
				n = n/10;
			}
			if (i==reverse) {
				System.out.println(i+" ");
			}
		}

	}

}
