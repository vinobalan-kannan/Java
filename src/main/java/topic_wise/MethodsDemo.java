package topic_wise;

public class MethodsDemo {

	public static void main(String[] args) {
	
	MethodsDemo d=new MethodsDemo();
	d.stoic();
	
	String s = MethodsDemo.stoic1();
	System.out.println(s);

	}
	
	//Methods Defining
	public void stoic()
	{
		System.out.println("BE STOIC");
	}
	
	
	//Return a String
	public static String stoic1()
	{
		System.out.println("BE STOIC");
		return "returningstring"; 
	}
	
}
