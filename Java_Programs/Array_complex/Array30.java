package myAllJavaProjects;
import java.io.*;
import java.util.*;
import java.lang.*;

public class Array34 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		
		int[] arr = new int[10];
		for(int i=0 ; i<arr.length ; i++)
		{
			System.out.print("Enter the array elements:");
			arr[i] = sc.nextInt();
		}
		for(int i=0 ; i<arr.length ; i++)
		{
			if(arr[i] == 0)
			{
				System.out.print("\nArray is having 0");
			}
			else if (arr[i] == -1)
			{
				System.out.print("\nArray is having -1");
			}
			else
			{
				System.out.print("\nArray is not having 0 or -1");
			}
		}
	}
}

