package topic_wise;

public class Star_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows = 5; // You can change this value to alter the pyramid height

		//from left to ri8
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//from ri8 to left
		//***in last loop "*" --> " *" gives pyramid shape
		for (int a = 1; a <= rows; a++) {
			for (int b = 1; b <= rows - a; b++) {
				System.out.print(" ");
			}
			for (int c = 1; c <= a; c++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		//Pyramid
		// Outer loop handles the number of rows
		for (int i = 1; i <= rows; i++) {

			// First inner loop prints the leading spaces for center-alignment
			for (int j = 1; j <= rows - i; j++) {
				System.out.print(" ");
			}

			// Second inner loop prints the stars (odd sequence: 1, 3, 5, 7...)
			for (int k = 1; k <= (2 * i - 1); k++) {
				System.out.print("*");
			}

			// Move to the next line after completing each row
			System.out.println();
		}

	}

}
