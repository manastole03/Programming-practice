package myAllJavaProjects;
import java.io.*;
import java.util.*;
import java.lang.*;

public class Array33 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		
		int[] arr = new int[10];
		int max = arr[0];
		int min = arr[0];
		float sum = arr[0];
		for(int i=0 ; i<arr.length ; i++)
		{
			System.out.print("Enter array elements:");
			arr[i] = sc.nextInt();
		}
		
		for(int i = 1; i < arr.length; i++)
		{
			sum  += arr[i];
			if(arr[i] > max)
				max = arr[i];
			else if(arr[i] < min)
				min = arr[i];
		}
		float x = ((sum-max-min) / (arr.length - 2));
		System.out.print("Average :" + x);

	}
}
