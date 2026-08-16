package topic_wise;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayConcept {

	public static void main(String[] args) {
		
		//Defining Arrays
		int[] i = new int[5];
		i[0] = 1;
		i[1] = 3;
		
		String[] s= {"Aim High" ,"Be Stoic"};
		System.out.println(s[0]);
		
		
		
		//ArrayList
		ArrayList<String> a=new ArrayList<String>();
		a.add("Consistency");
		a.add("Is");
		a.add("A");
		a.add("Key");
		a.add("To");
		a.add("Success");
		
		System.out.println(a.contains("Is"));    //check particular value preent or not
		System.out.println(a.get(0));				 //getting values in it using index of it
		
		//Array to ArrayList
		List<String> namelist=Arrays.asList(s);
		System.out.println(namelist.get(1));
		
		
		
		
		
	}

}
