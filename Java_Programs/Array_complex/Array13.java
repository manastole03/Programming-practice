package myAllJavaProjects;
import java.util.*;
import java.io.*;

public class Array17
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		
		String[] arr = new String[10];
		for(int i=0 ; i<arr.length ; i++)
		{
			System.out.print("Enter the array elements :");
			arr[i] = sc.nextLine();
		}
		for(int i=0 ; i<arr.length -1 ; i++)
		{
			for(int j=i+1 ; j<arr.length ; j++)
			{
				if (arr[i] == arr[j] && (i != j))
				{
					System.out.print("Duplicate :" + arr[j]);
				}
			}
		}
	}
}
