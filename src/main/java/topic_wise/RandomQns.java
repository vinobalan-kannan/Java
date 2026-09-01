package topic_wise;

import java.util.Arrays;
import java.util.List;

public class RandomQns {

	public static void main(String[] args) {
		// Given an array (1,3,3,4,5,6,6,7,8,9,9) when user enters a search element, the
		// program should display the index number where the element is found. If the
		// element is repeated it
		// should display all those indices. If it is not present in the given array
		// program should display "element not found

//		int[] array = { 1, 3, 3, 4, 5, 6, 6, 7, 8, 9, 9 };
//
//		int uservalue = 9;
//
//		StringBuilder sb = new StringBuilder();
//
//		boolean isThere = false;
//
//		for (int i = 0; i < array.length; i++) {
//
//			if (array[i] == uservalue) {
//				sb.append(i).append(" ");
//				isThere = true;
//			}
//
//		}
//
//		if (isThere == true) {
//			System.out.println("The indices are " + sb);
//		} else {
//			System.out.println("no element present");
//		}
//		
//		
//		
//
//		// Print the second smallest and second largest element from an array. java
//		int[] arr = { 1, 7, 3, 4, 5, 6, 7, 8, 3 };
//
//		int[] unique = Arrays.stream(arr).distinct().sorted().toArray();
//
//		System.out.println("The 2nd samllest number: " + unique[1]);
//
//		System.out.println("The 2nd largest number: " + unique[unique.length - 2]);
		
		
		//Find the Sum of Digits in a Number 
		
		int n=123;	
		String g=Integer.toString(n);
		int a=0;
		//System.err.println(g.length());
		for(int i=0; i<g.length();i++)
		{
			a=a+Character.getNumericValue(g.charAt(i));
		
			
		}
		System.out.println(a);
		
}
	
}
