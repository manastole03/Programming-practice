3.Take 20 integer inputs from user and print the following:
number of positive numbers
number of negative numbers
number of odd numbers
number of even numbers
number of 0s.

package myAllJavaProjects;
import java.util.*;
import java.io.*;

public class Array3
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int[] array = new int[10];
		
		for(int i=0 ; i<array.length ; i++)
		{
			array[i] = sc.nextInt();
		if(array[i]>0)
		{
			System.out.print("Number is positive.");
		}
		else if(array[i]==0)
		{
			System.out.print("Number is zero");
		}
		else
		{
			System.out.print("Number is negative.");
		}
		if(array[i] % 2 == 0)
		{
			System.out.print("Number is even.");
		}
		else if(array[i] % 2 == 1)
		{
			System.out.print("Number is odd.");
		}
		else
		{
			System.out.print("Number is not a even or odd");
		}
			
		}
	}
}
