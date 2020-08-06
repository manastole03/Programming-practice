import java.util.*;
import java.util.Scanner;
public class contains_element {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter any number: ");
		int n=sc.nextInt();
		char a[]=new char[n];
		System.out.println("Enter array string or integer: ");
		for(int i=0;i<n;i++) {
			a[i]=sc.next().charAt(0);
		}
		System.out.println("Enter a element: ");
		char m=sc.next().charAt(0);
		boolean contains = false;
		for (char c : a) {
		    if (c == m) {
		        contains = true;
		        break;
		    }
		}
		if (!contains) {
			System.out.println("NO given input is not in array");
		}
		if(contains==true) {
			System.out.println("YES!! given input is in array");
		}
	}
}
