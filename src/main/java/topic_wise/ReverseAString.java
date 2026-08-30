package topic_wise;

public class ReverseAString {

	public static void main(String[] args) {

		String a = "Too Toxic";
		String finall = "";
		for (int i = a.length() - 1; i >= 0; i--) {

			finall += a.charAt(i);

		}
		System.out.println(finall);

		//Reverse using StringBuilder
		StringBuilder s = new StringBuilder(a);
		System.out.println(s.reverse());
		
		
		
		//Reverse a string without changing its position
		String[] b = a.split(" ");

		for (int i = 0; i < b.length; i++) {
			String c = b[i];
			for (int j = c.length() - 1; j >= 0; j--) {
				System.out.print(c.charAt(j));
			}
			System.out.print(" ");
		}

	}
}
