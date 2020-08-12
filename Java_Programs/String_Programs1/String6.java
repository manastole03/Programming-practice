package myAllJavaProjects;
import java.io.*;
import java.util.*;
import java.lang.*;

public class String6
{
	public static void main(String[] args)
	{
		String str1 = new String("Manas Tole");
		String str2 = new String ("manas tole");
		
		int result = str1.compareToIgnoreCase(str2);
		
		if(result < 0)
		{
			System.out.print("str1 > str2");
		}
		else if (result == 0)
		{
			System.out.print("str1 == str2");
		}
		else
		{
			System.out.print("str1 < str2");
		}
	}
}
