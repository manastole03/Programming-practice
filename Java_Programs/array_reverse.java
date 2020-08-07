import java.util.*;
import java.util.Scanner;
public class reverseOfArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter any number ");
		int n=sc.nextInt();
		int a[]=new int[n];
		int maxi=0;
		int mini=0;
		System.out.println("Enter array string or integer: ");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Original Array: "+Arrays.toString(a));
		System.out.println("Original Array printed in reverse order: ");
        for(int i=a.length-1;i>=0;i--) {
        	System.out.println(a[i]);
	    }
	}
}
