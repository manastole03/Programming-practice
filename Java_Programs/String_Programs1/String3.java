package myAllJavaProjects;
import java.io.*;
import java.util.*;
import java.lang.*;

public class String3
{
	public static void main(String[] args) 
	{
		String str = "Manas Tole";
		
		int my1 = str.codePointBefore(3);
		int my2 = str.codePointBefore(7);
		
		System.out.print("Unicode of a :" + my1);
		System.out.print("\nUnicode of o :" + my2);
	}
}
