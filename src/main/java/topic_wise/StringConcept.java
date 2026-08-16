package topic_wise;

public class StringConcept {

	public static void main(java.lang.String[] args) {
		
		//String literal or object
		String s = "Consistancy beat talent  ";
		
		//String new 
		String s1 = new String("Consistency beat talent");
		
		
		String[] splitedString = s.split("beat");
		System.out.println(splitedString[1]);
		System.out.println(splitedString[1].trim());
		
		
		//print by each char
		for(int i=0; i<s.length(); i++)
		{
			System.out.println(s.charAt(i));
		}
		
		
		//to print from last
		for(int i=s.length()-1; i>=0; i--)
		{
			System.out.print(s.charAt(i));
		}
		
	}

}
