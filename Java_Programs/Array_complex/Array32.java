package myAllJavaProjects;
import java.io.*;
import java.util.*;
import java.lang.*;

public class Array36
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		boolean flag = false;
        int[] arr = new int[10];
        for(int i=0 ; i<arr.length ; i++)
        {
        	System.out.print("Enter the array elements :");
        	arr[i] = sc.nextInt();
        }
        for(int i=0 ; i<arr.length ; i++)
        {
        	if(arr[i] == 65)
        	{
        		System.out.print(flag = true);
        	}
        	else if (arr[i] == 77)
        	{
        		System.out.print(flag = true);
        	}
        	else
        	{
        		System.out.print(flag = false);
        	}
        }
	}

}
