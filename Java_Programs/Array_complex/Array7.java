package myAllJavaProjects;
import java.util.*;
import java.io.*;

public class Array11 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		int[] arr = new int[10];
		for(int i=0 ; i<arr.length ; i++)
		{
			arr[i] = sc.nextInt();
		}	
		
		System.out.print("Enter the index to remove:");
		int num = sc.nextInt();
		
		for(int i=num ; i<arr.length - 1 ; i++)
		{
			arr[i] = arr[i+1];
		}
		System.out.print("After romoving:"+Arrays.toString(arr));
	}

}
