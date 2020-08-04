package myAllJavaProjects;
import java.util.*;
import java.io.*;

public class Array12
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		
		int[] arr1 = new int[10];
		int[] arr2 = new int[10];
		
		for(int i=0 ; i<arr1.length ; i++)
		{
			System.out.print("Enter the array element :");
			arr1[i] = sc.nextInt();
			arr2[i] = arr1[i];
		}
		System.out.print("After iteration : "+ Arrays.toString(arr2));
	}
}
