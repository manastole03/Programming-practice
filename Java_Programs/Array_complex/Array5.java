package myAllJavaProjects;
import java.util.*;
import java.io.*;

public class Array9
{
	public static class search
	{
		int search;
		public search(int[] arr , int index)
		{
			for (int n : arr)
			{
				if (index == n)
				{
					System.out.print("Element is present.");
					
				}
			}
			System.out.print("Element is not present.");
		}
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		int[] arr = new int[10];
		for(int i=0 ; i<arr.length ; i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.print("Enter that you want to search :");
		int index = sc.nextInt();
		
		search my = new search(arr , index);
	}
}
