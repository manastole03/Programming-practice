package myAllJavaProjects;
import java.io.*;
import java.util.*;
import java.lang.*;

public class String5
{
	public static void main(String[] args) 
	{
		String str1 = "Tole";
		String str2 = "Tole";
		
		int my = str1.compareTo(str2);
		
		if(my<0)
		{
			System.out.print("str1 is Less than 2");
		}
		else if (my == 0)
		{
			System.out.print("str1 is equal to str2");
		}
		else
		{
			System.out.print("str1 is greater than str2");
		}
	}
}
