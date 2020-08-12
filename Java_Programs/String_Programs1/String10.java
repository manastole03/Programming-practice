package myAllJavaProjects;

public class String10 
{
	public static void main(String[] args) 
	{
		String str1 = "Manas";
		String str2 = "Tole";
		StringBuffer str = new StringBuffer (str1);		
       
		System.out.print("Compare 1 :" + str1.contentEquals(str));
		System.out.print("\nCompare 2 :" + str2.contentEquals(str));
	}
}
