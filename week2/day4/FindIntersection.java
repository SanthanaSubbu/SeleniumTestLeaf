package week2.day4;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		int[] array1 = {3, 2, 11, 4, 6, 7};
        int[] array2 = {1, 2, 8, 4, 9, 7};
        List<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < array1.length; i++) {
            list1.add(array1[i]);
        }
        List<Integer> list2 = new ArrayList<>();
        for (int j = 0; j < array2.length; j++) {
            list2.add(array2[j]);
        }
        List<Integer> list3 = new ArrayList<>();
        for (int k = 0; k < list1.size(); k++) {
        	for (int l = 0;l< list2.size(); l++) {
        		if(list1.get(k)==(list2.get(l))) {
        			list3.add(list2.get(l));
        		}
        	}
        }
        
        System.out.println("Common values:"+list3);

	}
}
