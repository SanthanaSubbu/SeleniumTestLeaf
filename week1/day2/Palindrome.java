package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		int input = 121, output = 0,initial=input;  
		while(input != 0)   
		{  
		int remainder = input % 10;  
		output = output * 10 + remainder;  
		input = input/10;  
		}  
		System.out.println("The reverse of the given number is: " + output);  
		 
	if(initial==output) {
		System.out.println("The number " +initial+" is palindrome");
	}else {
		System.out.println("The number " +initial+" is not palindrome");
	}
	}
}

