import java.util.*;
import java.util.Scanner;
public class copyByIterating {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of 1D array: ");
		int n=sc.nextInt();
		System.out.println("Enter "+n+" elements ");
		int a[]=new int[n];
		for (int i=0;i<n;i++ ) {
			a[i]=sc.nextInt();
		}
		 System.out.println("Original Array: "+Arrays.toString(a));
       for(int i=0;i<n;i++) {
    	   a[i]=a[i];
       }
       System.out.println("New Array: "+Arrays.toString(a));
	 }
  }
