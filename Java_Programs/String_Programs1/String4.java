package myAllJavaProjects;
import java.io.*;
import java.util.*;
import java.lang.*;

public class String4
{
	public static void main(String[] args) 
	{
		String str = "Manas Tole";
		
		int my1 = str.codePointCount(1,5);
		System.out.print("Unicode of a :" + my1);
	}
}
