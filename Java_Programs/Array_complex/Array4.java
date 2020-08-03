package myAllJavaProjects;
import java.io.*;
import java.util.*;

public class Array8
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		int[] arr = new int[10];
		int sum=0 , avg=0 ;
		for(int i=0 ; i<arr.length ; i++)
		{
			arr[i] = sc.nextInt();
			sum = sum + arr[i];
		}
		avg = sum / arr.length;
		System.out.print("Average : "+ avg);
	}
}
