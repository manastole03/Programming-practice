package myAllJavaProjects;
import java.io.*;
import java.util.*;

public class Array28 
{
	public static void main(String[] args)
	{
		int sum =0;
		Scanner sc = new Scanner (System.in);
		int[] arr = new int[10];
		
		for(int i=0 ; i<arr.length ; i++)
		{
			System.out.print("Enter the array elements:");
			arr[i] = sc.nextInt();
		}
		
		int m = arr.length;
		int total = m * ((m + 1) / 2);
		
		for(int i : arr)
		{
			 sum = sum + i;
		}
		int number = total - sum;
		System.out.print("The missing number: " + number);
	}
}
