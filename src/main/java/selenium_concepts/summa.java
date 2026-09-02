package selenium_concepts;

import java.util.Scanner;

public class summa {

	public static void main(String[] args) {

		// Finding duplicates

//		int[] array = { 1, 2, 3, 4, 56, 7, 6, 5, 4, 3, 2 };
//
//		HashSet<Integer> set = new HashSet<Integer>();
//		String dups = "";
//		for (int num : array) {
//			if (!set.add(num)) {
//				dups += num + " ";
//			}
//		}
//		System.out.println("Duplicate values are : " +dups);
//		
Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter text: ");
        String input = scanner.nextLine();
        
        // Convert string to a character array
        char[] characters = input.toCharArray();
        
        // Loop through, skipping by 2 to only hit even indexes (0, 2, 4...)
        for (int i = 0; i < characters.length; i += 2) {
            characters[i] = Character.toUpperCase(characters[i]);
        }
        
        // Print the final result
        System.out.println("Result: " + String.valueOf(characters));
        
        scanner.close();
    }
}
