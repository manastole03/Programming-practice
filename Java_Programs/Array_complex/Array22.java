package myAllJavaProjects;
import java.io.*;
import java.util.*;

public class Array26 
{
	static void myclass(int inputArray[], int inputNumber)
	{
		for(int i=0 ; i<inputArray.length ; i++)
		{
			for(int j=i+1 ; j<inputArray.length ; j++)
			{
				if(inputArray[i] + inputArray[j] == inputNumber)
				{
					System.out.print("\n" + inputArray[i] + " + " + inputArray[j] + " = " + inputNumber);
				}
			}
		}
	}
	public static void main(String[] args)
	{
		myclass(new int[] {1,2,3,4,5,6}, 10);
		myclass(new int[] {10,20,30,40,50,60} , 100);
	}
}
