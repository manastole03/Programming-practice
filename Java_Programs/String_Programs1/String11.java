package myAllJavaProjects;

public class String11 
{
	public static void main(String[] args) 
	{
		char[] my = new char[] {1,2,3,4,5,6};
		String str = String.copyValueOf(my, 1, 5);
		System.out.print("My String :" + str + "is this");
	}
}
