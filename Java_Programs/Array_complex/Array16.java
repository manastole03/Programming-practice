package myAllJavaProjects;
import java.io.*;
import java.util.*;
public class Array20
{
	public class myclass
	{
		public void myclass(int[] arr)
		{	
			int m = arr.length;
			for(int i=0 ; i<m-1 ; i++)
			{
				for(int j=i+1 ; j<m ; j++)
				{
					if(arr[i] == arr[j])
					{
						arr[j] = arr[m-1];
						m--;
						j--;
					}
				}
			}
		}
	}
	public static void main(String[] args)
	{
		myclass(new int[] {1,24,6,7,3,8,5,0,7,});
	}
}
