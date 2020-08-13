import java.util.*;
import java.util.Scanner;
public class diffInLargestAndSmallest {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int n=sc.nextInt();
		System.out.println("Enter elements of array: ");
		int a[]=new int[n];
		
		for (int i=0;i<n;i++ ) {
			a[i]=sc.nextInt();
		}
		System.out.println("original array: "+Arrays.toString(a));
		int diff=0;
		for(int i=0;i<n;i++) {
			Arrays.parallelSort(a);
			 diff=a[n-1]-a[0];
		}
    System.out.println("difference between largest and smallest element is: "+diff);
  }
}
