package week2.day4;

import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) {
		int[] s = {3, 2, 11, 4, 6, 7};
		Arrays.sort(s);
		System.out.println("The second largest number in array is "+s[s.length-2]);

	}

}
