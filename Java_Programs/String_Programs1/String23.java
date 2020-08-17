package myAllJavaProjects;

public class String23
{

	public static void main(String[] args)
	{
		String str1 = "Manas Tole";
		String str2 = "Arunn Tole";
		
        boolean match1 = str1.regionMatches(0, str2, 6,9 );
        //boolean match2 = str1.regionMatches(0, str2, 5, 9 );
        
        System.out.print("Match :" + match1);
	}

}
