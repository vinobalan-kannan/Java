package topic_wise;

import java.util.HashSet;

public class DuplicatesInArray {
	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 56, 7, 6, 5, 4, 3, 2 };

		HashSet<Integer> set = new HashSet<Integer>();
		String dups = "";
		
		for (int num : array) {
			if (!set.add(num)) {
				dups += num + " ";
			}
		}

		System.out.println("Duplicate values are : " + dups);

	}
}