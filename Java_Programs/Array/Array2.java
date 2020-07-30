2.Take 10 integer inputs from user and store them in an array. Again ask user to give a number. Now, tell user whether that number is present in array or not.

package myAllJavaProjects;
import java.util.*;
import java.io.*;

public class Array2
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		int [] array = new int [10];
		for (int i=0;i<array.length;i++)
		{
			array[i]=sc.nextInt();
		}
		System.out.print("Enter the number :");
		int number = sc.nextInt();
		
		for(int i=0;i<array.length;i++)
		{
			if(array[i]==number)
			{
				System.out.print("This number is present in the array");
			}
			else
			{
				System.out.print("This number is not present in the array");
			}
		}
		
	}

}
