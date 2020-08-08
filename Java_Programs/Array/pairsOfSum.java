import java.util.*;
import java.util.Scanner;
public class pairsOfsum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of 1D array: ");
		int n=sc.nextInt();
		System.out.println("Enter "+n+" elements ");
		int a[]=new int[n];
		for (int i=0;i<n;i++ ) {
			a[i]=sc.nextInt();
		}
		System.out.println("Enter sum you want: ");
		int m=sc.nextInt();
		System.out.println("Array: "+Arrays.toString(a));
		 for(int i=0;i<n;i++) {
			 for(int j=i;j<n;j++) {
				if(m==a[i]+a[j] && i!=j) {
				 System.out.println(i+" , "+j);
				}
       }
		 }
	}
}
