import java.util.*;
import java.util.Scanner;
public class max_min_in_array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of 1D array: ");
	
		int n=sc.nextInt();
		System.out.println("Enter "+n+" elements ");
		int a[]=new int[n];
		for (int i=0;i<n;i++ ) {
			a[i]=sc.nextInt();
			System.out.println("Enter "+((n-1)-i)+" elements left");
			
		}
		int max=a[0];
		int min=a[0];
		for(int i=0;i<n;i++){
			     if(min>a[i]){
			       min=a[i];
			     }
			     if(max<a[i]){
			       max=a[i]; 
			     }
		}
		System.out.println("largest number among input is- "+max); 
		 System.out.println("smallest number among input is- "+min); 
	}
}
