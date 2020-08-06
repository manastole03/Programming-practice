import java.util.*;
import java.util.Scanner;
public class sorting_string {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter any number: ");
		int n=sc.nextInt();
		String a[]=new String[n];
		for (int i =0;i<n;i++) {
			a[i]=sc.next();
		}
		System.out.println("before sorting: "+Arrays.toString(a));
		Arrays.sort(a);
		
		System.out.println("after sorting: "+Arrays.toString(a));
	}
}
