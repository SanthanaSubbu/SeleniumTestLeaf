package week3.day1;

import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicatesSet {

	public static void main(String[] args) {
		String s = "google";
		char[] s1=s.toCharArray();
		Set<Character> n = new TreeSet<>();
		for(int i=0;i<s1.length;i++) {
			n.add(s1[i]);
		}
		System.out.println(n.toString());

	}

}
