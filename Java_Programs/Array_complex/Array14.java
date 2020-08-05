package myAllJavaProjects;
import java.io.*;
import java.util.*;

public class Array18 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		
		String[] arr1 = new String[3];
		String[] arr2 = new String[3];
		for(int i=0 ; i<arr1.length ; i++)
		{
			System.out.print("Enter array 1 elements :");
			arr1[i] = sc.nextLine();
		}
		for(int i=0 ; i<arr2.length ; i++)
		{
			System.out.print("Enter array 2 elements :");
			arr2[i] = sc.nextLine();
		}
		HashSet<String> set = new HashSet<String>();
		for(int i=0 ; i<arr1.length ; i++)
		{
			for(int j=0 ; j<arr2.length ; j++)
			{
				if((arr1[i]).equals( arr2[j]))
				{
					set.add(arr1[i]);
				}
			}
		}
		System.out.print("Common elements :" + set);
	}
}
