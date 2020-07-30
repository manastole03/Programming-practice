1)Take 10 integer inputs from user and store them in an array and print them on screen.

package myAllJavaProjects;
import java.util.*;
import java.io.*;
public class Array1
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[] array= new int[10];
		for(int i=0;i<array.length;i++)
		{
			System.out.print("The value is z["+i+"]  :");
			array[i]=sc.nextInt();
		}
		
		for(int i=0;i<array.length;i++)
		{
			System.out.print("\nThe Printing value:"+array[i]);
		}
	}
