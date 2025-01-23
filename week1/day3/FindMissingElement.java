package week1.day3;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		
		        int[] inputArray = {1, 4, 3, 2, 8, 6, 7};		        
		        Arrays.sort(inputArray);		        
		        for (int i = 1; i <= 8; i++) {
		            boolean numberMatched = false;
		            for (int j = 0; j < inputArray.length; j++) {
		                if (inputArray[j] == i) {
		                	numberMatched = true;
		                    break;
		                }
		            }		           
		            if (!numberMatched) {
		                System.out.println("The missing element is: " + i);
		                break;
		            }
		        }
		    }
		

	}


