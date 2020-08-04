package myAllJavaProjects;
import java.io.*;
import java.util.*;

public class Array10 
{
	public static class index
	{	
		public index (int[] arr , int number)
		{
			if(arr == null)
			{
				System.out.print("Array is null.");
			}
			int len = arr.length;
			int i = 0;
			while(i<len)
			{
				if (arr[i] == number)
				{
					System.out.print("Index of the number is : "+ i);
				}
				else
				{
					i = i + 1;
				}
			}
			System.out.print("Number is not present.");
		}
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		int[] arr = new int [10];
		for (int i=0 ; i<arr.length ; i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.print("Enter the number :");
		int number = sc.nextInt();
		
		index my = new index (arr , number);	
	}
}
