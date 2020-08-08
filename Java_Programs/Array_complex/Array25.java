package myAllJavaProjects;
import java.io.*;
import java.util.*;

public class Array29
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int[] array1 = new int[5];
		int[] array2 = new int[5];
		int [] array3 = new int[5];
		
		ArrayList<Integer> common = new ArrayList<Integer>();
		
		for(int i=0 ; i<array1.length ; i++)
		{
			System.out.print("Enter array1 elements");
			array1[i] = sc.nextInt();
		}
		for(int i=0 ; i<array2.length ; i++)
		{
			System.out.print("Enter array2 elements");
			array2[i] = sc.nextInt();
		}
		for(int i=0 ; i<array3.length ; i++)
		{
			System.out.print("Enter array3 elements");
			array3[i] = sc.nextInt();	
		}	
			int x = 0, y = 0, z = 0;
			while (x < array1.length && y < array2.length && z < array3.length)
			{
				if (array1[x] == array2[y] && array2[y] == array3[z])
				{
					common.add(array1[x]);
					x++;
					y++;
					z++;
				}
				else if(array1[x] < array2[y]) 
				{
					x++;
				}
				else if (array2[y] < array3[z])
				{
					y++;
				}
				else
				{
					z++;
				}
			}
			System.out.println("Common elements from three sorted arrays: ");
		System.out.println(common);
	}
}

