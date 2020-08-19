package myAllJavaProjects;

public class String25
{
	public static void main(String[] args) 
	{
		String str = "Manas Tole";
		
		String sub = str.substring(5);
		System.out.print("My substring :" + sub);
		
		String my_string = sub.replaceAll(sub, "Arun");
		System.out.print("After removing :" + my_string);
	}
}
