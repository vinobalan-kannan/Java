package topic_wise;

public class RandomQns {

	public static void main(String[] args) {
		// Given an array (1,3,3,4,5,6,6,7,8,9,9) when user enters a search element, the
		// program should display the index number where the element is found. If the
		// element is repeated it
		// should display all those indices. If it is not present in the given array
		// program should display "element not found

		int[] array = { 1, 3, 3, 4, 5, 6, 6, 7, 8, 9, 9 };
	
	
		int uservalue = 9;

		StringBuilder sb = new StringBuilder();

		boolean isThere = false;

		for (int i = 0; i < array.length; i++) {

			if (array[i] == uservalue) 
			{
				sb.append(i).append(" ");
				isThere = true;
			}
		
		}
		
		if (isThere == true) {
			System.out.println("The indices are " + sb);
		} else {
			System.out.println("no element present");
		}
	}
}
