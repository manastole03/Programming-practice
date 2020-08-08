import java.util.*;
public class second_smallest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of 1D array: ");
    int n=sc.nextInt();
		System.out.println("Enter "+n+" elements ");
		int a[]=new int[n];
		for (int i=0;i<a.length;i++ ) {
			a[i]=sc.nextInt();
		}
		System.out.println("Original Array: "+Arrays.toString(a));
		for(int i=0;i<n;i++) {
			Arrays.sort(a);
		}
		System.out.println("Second Smallest element in array is: "+a[1]);
	}
}
