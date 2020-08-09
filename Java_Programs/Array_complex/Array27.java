package myAllJavaProjects;
import java.io.*;
import java.util.*;
import java.lang.*;

public class Array31 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in) ;
		
		int[] arr = new int[10];
		
		for(int i=0 ; i<arr.length ; i++)
		{
			System.out.print("\nEnter the array elements:");
			arr[i] = sc.nextInt();
			
			if (arr[i] % 2 == 0)
			{
				System.out.print("\nEven number :" + arr[i]);
			}
			else
			{
				System.out.print("\nOdd number :" + arr[i]);
			}
		}
	}
}
