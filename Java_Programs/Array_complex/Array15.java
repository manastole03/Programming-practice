package myAllJavaProjects;
import java.util.*;
import java.io.*;

public class Array19 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		
		int[] arr1 = new int[5];
		int[] arr2 = new int[5];
		
		for(int i=0 ; i<arr1.length ; i++)
		{
			System.out.print("Enter elements of array 1 :");
			arr1[i] = sc.nextInt();
		}
		for(int i=0 ; i<arr2.length ; i++)
		{
			System.out.print("Enter elements of array 2 :");
			arr2[i] = sc.nextInt();
		}
		for(int i=0 ; i<arr1.length ; i++)
		{
			for(int j=0 ; j<arr2.length ; j++)
			{
				if((arr1[i]) == (arr2[j]))
				{
					System.out.print("Duplicate numbers"+arr2[j]);
				}
			}
		}
	}
}
