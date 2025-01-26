package week1.day4;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String companyName="TestLeaf";
		char[] reverseName =companyName.toCharArray();
		for(int i=reverseName.length-1;i>=0;i--) {
			System.out.print(reverseName[i]);
		}
	}

}
