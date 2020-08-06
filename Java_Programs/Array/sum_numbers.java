import java.util.*;
import java.util.Scanner;
public class sum_array {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter any number: ");
		int n=sc.nextInt();
		int a[]=new int[n];
		int sum=0;
		for (int i =0;i<n;i++) {
			a[i]=sc.nextInt();
			sum+=a[i];
		}
		System.out.println("input array is: "+Arrays.toString(a));
		System.out.println("sum of elements in array is:"+sum);
	}
}
