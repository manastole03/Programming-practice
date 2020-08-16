package myAllJavaProjects;

public class String17
{

	public static void main(String[] args) 
	{
		String str = "Manas Tole";
		char[] my = new char[10] ;
		str.getChars(1, 7, my, 1);
		System.out.print("Array :" + my);
	}

}
