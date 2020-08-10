package myAllJavaProjects;

import java.util.Scanner;

public class Array35 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		int sum = 0;
		boolean flag = false;
		int[] arr = new int[10];
		for(int i=0 ; i<arr.length ; i++)
		{
			System.out.print("Enter the array elements:");
			arr[i] = sc.nextInt();
		}
		for(int i=0 ; i<arr.length ; i++)
		{
			 sum = sum + i;
		}
		 if(sum == 30)
		 {
			 System.out.print(flag = true);
		 }
		 else
		 {
			 System.out.print(flag = false);
		 }
	}

}
