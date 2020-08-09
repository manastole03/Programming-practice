package myAllJavaProjects;
import java.io.*;
import java.util.*;
import java.lang.*;

public class Array32 
{

	public static void main(String[] args)
	{
		   int[] array_nums = {5, 7, 2, 4};
			System.out.println("Original Array: "+Arrays.toString(array_nums)); 
			int max_val = array_nums[0];
			int min = array_nums[0];
			for(int i = 1; i < array_nums.length; i++)
			{
				System.out.print(array_nums[i]);
				if(array_nums[i] > max_val)
				{
					max_val = array_nums[i];
					System.out.print("\nhi");
				}	
				else if(array_nums[i] < min)
				{
					min = array_nums[i];
				    System.out.print("\nhiiii");
				}
			}
			System.out.print("Difference:" + (max_val - min));
	}
}
