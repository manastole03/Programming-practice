package myAllJavaProjects;

public class String16 
{

	public static void main(String[] args) 
	{
		String str = "Manas Tole";
		
		byte[] my_byte = str.getBytes();
		
		String str1 = new String (my_byte);
		System.out.print(str1);
	}

}
