package myAllJavaProjects;
import java.util.Arrays;
import java.lang.*;

public class Array5
{
	public static void main(String[] args)
	{
		int[] numeric_array = {2000 , 2056 , 1996 , 2004 , 2020 , 2005 , 2006 , 2007 , 2050 , 2009 ,2010};
		String[] char_array = {"Manas" , "omkar" , "raj" , "om" , "kapur"};
		Arrays.sort(numeric_array);
		Arrays.sort(char_array);
		System.out.print("Sorted array : "+ Arrays.toString(numeric_array));
		System.out.print("\nSorted array :"+ Arrays.toString(char_array));		
	}
}
