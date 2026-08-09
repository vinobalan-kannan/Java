package topic_wise;

public class ReverseAString {

	public static void main(String[] args) {

		String a = "Belief";
		String finall = "";
		for (int i = a.length() - 1; i >= 0; i--) {

			finall += a.charAt(i);

		}
		System.out.print(finall);

	}

	
}
