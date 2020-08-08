import java.util.*;
import java.util.Scanner;
public class inserting_in_array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of 1D array: ");
		int n=sc.nextInt();
		System.out.println("Enter "+n+" elements ");
		int a[]=new int[n+1];
		for (int i=0;i<n;i++ ) {
			a[i]=sc.nextInt();
		}
		System.out.print("Enter the position where you want to insert element:");
       int m = sc.nextInt();
        System.out.print("Enter the element you want to insert:");
        int x = sc.nextInt();
        System.out.println("Original Array: "+Arrays.toString(a));
        for(int i = (n-1); i >= (m-1); i--)
        {
            a[i+1] = a[i];
        }
        a[m-1] = x;
        System.out.print("Array After inserting element ("+x+"): ");
        for(int i = 0; i < n; i++)
        {
            System.out.print(a[i]+",");
        }
        System.out.print(a[n]);
  }
}
