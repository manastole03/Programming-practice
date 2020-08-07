import java.util.*;
import java.util.Scanner;
public class contains_elements {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter any number: ");
		int n=sc.nextInt();
		String a[]=new String[n];
		System.out.println("Enter array string or integer: ");
		for(int i=0;i<n;i++) {
			a[i]=sc.next();
		}
		System.out.println("Enter a element: ");
		String m=sc.next();
		int contains = 0;
		for(int i=0;i<n;i++) {
		    if (a[i].equals(m)) {
		    	contains=1;
		    }
		}
		    switch(contains) {
		    case 1:
		    	System.out.println("YES!! element is in array");
		    	break;
		    default:
		    	System.out.println("NO element is not in array");
		    }
		    System.out.println("Input array is: "+Arrays.toString(a));
	}
}
