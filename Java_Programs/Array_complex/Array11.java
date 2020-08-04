package myAllJavaProjects;
import java.io.*;
import java.util.*;

public class Array15
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		
		int[] arr = new int [10];
		
		for(int i=0 ; i<arr.length ; i++)
		{
			System.out.print("Enter the array number :");
			arr[i] = sc.nextInt();
		}
		for(int i=0 ; i<arr.length / 2 ; i++)
		{
			int temp = arr[i] ;
			arr[i] =arr[arr.length - i - 1];
			arr[arr.length - i - 1] = temp;
		}
		System.out.print("Reversed array :"+ Arrays.toString(arr));
	}
}
