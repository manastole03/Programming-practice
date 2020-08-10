package myAllJavaProjects;
import java.io.*;
import java.util.*;
import java.lang.*;

public class Array37 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int index = 1;
		int[] arr = new int[10];
		for(int i=0 ; i<arr.length ; i++)
		{
			System.out.print("Enter the array elements:");
			arr[i] = sc.nextInt();
		}
		for(int i=0 ; i<arr.length ; i++)
		{
			if(arr[i] != arr[index-1])
			{
				arr[index++] = arr[i];
			}
			
		}
		System.out.print(index);
	}
}
