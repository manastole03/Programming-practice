package myAllJavaProjects;
import java.io.*;
import java.util.*;

public class Array27 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		
		int[] arr1 = new int[5];
		int[] arr2 = new int[5];
		
		for(int i=0 ; i<arr1.length ; i++)
		{
			System.out.print("Enter arr1 elements:");
			arr1[i] = sc.nextInt();
		}
		for(int j=0 ; j<arr2.length ; j++)
		{
			System.out.print("Enter arr2 elements:");
			arr2[j] = sc.nextInt();
		}
		
		for(int i=0 ; i<arr1.length ; i++)
		{
			for(int j=0 ; j<arr2.length ; j++)
			{
				if(arr1[i] == arr2[j])
				{
					System.out.print("\nSame elements:"+arr1[i]);
				}
			}
		}
		

	}

}
