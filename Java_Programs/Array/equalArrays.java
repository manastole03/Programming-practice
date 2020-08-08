import java.util.*;
public class equal_Arrays {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of first array: ");
		int n=sc.nextInt();
		System.out.println("enter the size of second array: ");
		int m=sc.nextInt();
		System.out.println("Enter "+n+" elements ");
		int a[]=new int[n];
		for (int i=0;i<n;i++ ) {
			a[i]=sc.nextInt();
		}
		System.out.println("Enter "+m+" elements ");
		int b[]=new int[m];
		for (int i=0;i<m;i++ ) {
			b[i]=sc.nextInt();
		}
		System.out.println("First Array: "+Arrays.toString(a));
		System.out.println("Second Array: "+Arrays.toString(b));
		boolean equality=Arrays.equals(a, b);
		System.out.println("Arrays are equal: "+equality);
	}
}
