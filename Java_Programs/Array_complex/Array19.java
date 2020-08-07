package myAllJavaProjects;
import java.util.*;
import java.io.*;

public class Array23
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter the number of rows:");
		int i = sc.nextInt();
		
		System.out.print("Ennter the number of columns:");
		int j = sc.nextInt();
		
		int[][] arr1 = new int [i][j];
		int[][] arr2 = new int [i][j];
		int[][] sum = new int [i][j];
		
		for(int m=0 ; m<i ; m++)
		{
			for(int n=0 ; n<j ; n++)
			{
				System.out.print("Enter element of first matrix:");
				arr1[m][n] = sc.nextInt();
			}
		}
		for(int m=0 ; m<i ; m++)
		{
			for(int n=0 ; n<j ; n++)
			{
				System.out.print("Enter element of second matrix:");
				arr2[m][n] = sc.nextInt();
			}
		}
		for(int m=0 ; m<i ; m++)
		{
			for(int n=0 ; n<j ; n++)
			{
				sum[m][n] = arr1[m][n] + arr2[m][n];
				System.out.print("Matrix :" + sum[m][n]);
			}
			System.out.print("");
		}
	}
}
