import java.util.*;
import java.util.Scanner;
import java.util.HashSet; 
import java.util.Set;
public class duplicateString_Array{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of 1D array: ");
		int n=sc.nextInt();
		System.out.println("Enter "+n+" elements ");
		String a[]=new String[n];
		for (int i=0;i<n;i++ ) {
			a[i]=sc.next();
		}
		 System.out.println("Original Array: "+Arrays.toString(a));
		 for (int i = 0; i < a.length; i++) { 
			 for (int j = i + 1; j < a.length; j++) {
				 if (a[i].equals(a[j]) ) {
				 }
			 }
		 }
		 Set<String> store = new HashSet<>(); 
		 for (String b : a) {
			 if (store.add( b) == false) {
				 System.out.println("Duplicate element in array : " + b);
				 } 
			 } 
	}
}
