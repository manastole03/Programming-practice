import java.util.*;
import.java.util.Scanner;
public class containsSpecificElements {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size array: ");
		int n=sc.nextInt();
		System.out.println("Enter elements of array: ");
		int a[]=new int[n];
		
		for (int i=0;i<n;i++ ) {
			a[i]=sc.nextInt();
		}
		System.out.println("original array: "+Arrays.toString(a));
		boolean flag=false;
		for(int i=0;i<n;i++) {
			if(a[i]==0 || a[i]==-1) {
				flag=true;
			}}
		if(flag==true) {
			System.out.println("Array contains 0 or -1");
		}
		if(flag==false) {
			System.out.println("Array does not contains 0 or -1");
		}
	}
}
