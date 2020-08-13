import java.util.*;
import java.util.Scanner;
public class exceptionalAverage {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of matrix: ");
		int n=sc.nextInt();
		System.out.println("Enter elements of first matrix: ");
		int a[]=new int[n];
		
		for (int i=0;i<n;i++ ) {
			a[i]=sc.nextInt();
		}
		System.out.println("original array: "+Arrays.toString(a));
		double avg=0;
		double sumi=0;
		for(int i=0;i<n;i++) {
			Arrays.parallelSort(a);
			sumi+=a[i];
			avg=((sumi)-(a[0]+a[n-1]))/(n-2);
		}
		System.out.println("largest element is: "+a[n-1]);
		System.out.println("smallest element is: "+a[0]);
		System.out.println("average of numbers except largest and smallest element is: "+avg);

	}
}
