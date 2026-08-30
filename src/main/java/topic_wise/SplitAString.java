package topic_wise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SplitAString {

	public static void main(String[] args) {

		 //number of words in a string
		String s = "Be Consistent";

		String[] splitter = s.split(" ");

		System.out.println(splitter.length);

		// count of char in string
		String m = "This too shall pass";

		int count = 0;

		for (int i = 0; i < m.length(); i++) {
			if (Character.isLetter(m.charAt(i))) {
				count++;
			}
		}
		System.out.println(count);

		// splitting with streams
		System.out.println(m.chars()
                .filter(Character::isLetter)
                .count());
	}
}
