package myAllJavaProjects;
import java.util.*;
import java.io.*;

import java.lang.*;
public class Array22
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		 
		int arr[] = new int[10];
		
		for(int i=0 ; i<arr.length ; i++)
		{
			System.out.print("Enter array elements :");
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr , Collections.reverseOrder());
		int m = arr.length - 1;

	}
}
