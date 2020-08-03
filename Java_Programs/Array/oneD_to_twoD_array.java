import java.util.*;
import java.util.Scanner;
public class oneD_to_twoD {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array: ");
		int n=sc.nextInt();
		System.out.println("Enter "+n+" elements ");
		int a[]=new int[n];
		for (int i=0;i<n;i++ ) {
			a[i]=sc.nextInt();
			System.out.println("Enter "+((n-1)-i)+" elements left");
		}
		System.out.println("your input is stored successfully");
		int b[]=new int[(n+1)/2];
		int c[]=new int[n-b.length];
		for (int j=0;j<n;j++ ) {
			if (j<b.length) {
				b[j]=a[j];
			}
			else {
				c[j-b.length]=a[j];
			}
		}
		System.out.println(Arrays.toString(b));
	System.out.println(Arrays.toString(c));
	}
}
