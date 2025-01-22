package week1.day2;

public class IsPrime {

	public static void main(String[] args) {
		int n=131;
		if (n <= 1) {
            System.out.println("Given no "+n+" is not prime number");
            
        }
		for (int i = 2; i <n;i++) {
            if (n % i == 0) {
               System.out.println("Given no "+n+" is not prime number");
               break;
            }
            else {
            	System.out.println("Given no "+n+" is a prime number");
            	break;
            }
        }
	}
}
