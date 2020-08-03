import java.util.*;
import java.util.Scanner;
class max_min_diff{
	 int maxDiff(int a[], int a_size)  
	    { 
	        int max_diff = a[1] - a[0]; 
	        int i, j; 
	        for (i = 0; i < a_size; i++)  
	        { 
	            for (j = i + 1; j < a_size; j++)  
	            { 
	                if (a[j] - a[i] > max_diff) 
	                    max_diff = a[j] - a[i]; 
	            } 
	        } 
	        return max_diff; 
	    } 
	 int minDiff(int a[], int a_size)  
	    { 
	        int min_diff =a[1]-a[0]; 
	        int i, j; 
	        for (i = 0; i < a_size-1; i++)  
	        { 
	            for (j = i + 1; j < a_size; j++)  
	            { 
	                if (Math.abs(a[i] - a[j]) < min_diff) 
	                    min_diff =Math.abs( a[i] - a[j]); 
	            } 
	        } 
	        return min_diff; 
	    } 
}
public class max_min_Diff {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of 1D array: ");
	
		int n=sc.nextInt();
		System.out.println("Enter "+n+" elements ");
		int a[]=new int[n];
		for (int i=0;i<n;i++ ) {
			a[i]=sc.nextInt();
			System.out.println("Enter "+((n-1)-i)+" elements left");
		}
		max_min_diff maxdif = new max_min_diff();
		max_min_diff mindif = new max_min_diff(); 
		System.out.println("Minimum differnce among input is- " +  
                maxdif.minDiff(a, n));
		System.out.println("Maximum differnce among input is- " +  
                maxdif.maxDiff(a, n));
		
	}
}
