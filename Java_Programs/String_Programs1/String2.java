package myAllJavaProjects;
import java.io.*;
import java.util.*;
import java.lang.*;

public class String2 
{
	public static void main(String[] args) 
	{
		String str = "Manas Tole";
		
		int my1 = str.codePointAt(3);
		int my2 = str.codePointAt(7);
		
		System.out.print("Unicode of a :" + my1);
		System.out.print("\nUnicode of o :" + my2);
	}
}
