package myAllJavaProjects;
import java.util.*;
import java.io.*;

public class Array13
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		
		int[] arr = new int[10];

		for(int i=0 ; i<arr.length ; i++)
		{
			System.out.print("Enter the array numbers :");
			arr[i] = sc.nextInt();
		}
		
		System.out.print("Enter the index at you add an element : ");
		int index = sc.nextInt();
		System.out.print("Enter your number :");
		int num = sc.nextInt();
		
		for(int i=arr.length-1; i > index; i--)
		{
		    arr[i] = arr[i-1];
	   }
		arr[index]=num;
		System.out.print("string: " + Arrays.toString(arr));
	}
}
