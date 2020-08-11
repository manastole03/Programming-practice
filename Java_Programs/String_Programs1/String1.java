package myAllJavaProjects;
import java.io.*;
import java.util.*;
import java.lang.*;

public class String1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in) ;
		String mystr = "Manas Tole";
		
		int my = mystr.charAt(0);
		int my1 = mystr.charAt(6);
		
		System.out.print("at 0 index:" + (char)my);
		System.out.print("\nat 6th index:" + my1);
		
	}
}
