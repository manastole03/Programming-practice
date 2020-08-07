import java.util.*;
import java.util.Scanner;
public class max_min {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter any number: ");
		int n=sc.nextInt();
		int a[]=new int[n];
		int maxi=0;
		int mini=0;
		System.out.println("Enter array string or integer: ");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		System.out.println("input array: "+Arrays.toString(a));
		System.out.println("maximum value is: "+a[0]);
		System.out.println("minimum value is: "+a[(a.length-1)]);
		}
}
