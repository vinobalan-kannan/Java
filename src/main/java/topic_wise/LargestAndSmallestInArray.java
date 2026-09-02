package topic_wise;

import java.util.Arrays;

public class LargestAndSmallestInArray {

	public static void main(String[] args) {
		Integer []a= {16,22,73,64,57};
		
		Arrays.sort(a);
		
		System.out.println("Mini value : "+a[0]+" Max value : "+a[a.length-1]);

	}

}
