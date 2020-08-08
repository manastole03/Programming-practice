package myAllJavaProjects;
import java.io.*;
import java.util.*;

public class Array25
{

	public static void main(String[] args)
	{
		 String[]  my_array = new String[] {"Python", "JAVA", "PHP",  "Perl", "C#", "C++"};
		  ArrayList<String> list = new ArrayList<String>();
 
		  list.toArray(my_array);
		  
		  for (String  string : my_array)
		  {
		  System.out.println(string);
		  }
	}
}
