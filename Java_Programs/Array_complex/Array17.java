package myAllJavaProjects;
import java.util.*;
import java.io.*;

public class Array21 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		
		int[] arr = new int[10];
		for(int i=0 ; i<arr.length ; i++)
		{
			System.out.print("Enter array elements :");
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		int m = arr.length - 1;
		while(arr[m] == arr[arr.length - 1])
		{
			m--;
		}
		System.out.print("Second largest:" + arr[m]);
	}
}
