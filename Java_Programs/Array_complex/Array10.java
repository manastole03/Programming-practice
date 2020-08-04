package myAllJavaProjects;
import java.util.*;
import java.io.*;
public class Array14 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		
		int[] arr = new int[10];
		
		for(int i=0 ; i<arr.length ; i++)
		{
			System.out.print("Enter the array elements :");
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		int max =arr [9];
		int min = arr[0];
		System.out.print("max :" + max + "min :" + min);
	}
}
