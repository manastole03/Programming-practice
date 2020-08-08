import java.util.*;
import java.util.Scanner;
public class removing_element {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter any number: ");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter array string or integer: ");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		System.out.print("Enter Element to be deleted : ");
		int m=sc.nextInt();
		for(int i=0;i<n;i++) {
			if(a[i]==m){
				 for(int j = i; j < n-1; j++){
				        a[j] = a[j + 1];
				  }
				 break;
			}
		}
		System.out.println("Elements After deleting: " );
	    for(int i = 0; i < n-1; i++){
	      System.out.print(" " + a[i]);
	    }
  }
}
