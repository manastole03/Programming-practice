import java.util.*;
import java.util.Scanner;
public class remove_duplicate {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of 1D array: ");
		int n=sc.nextInt();
		System.out.println("Enter "+n+" elements ");
		int a[]=new int[n];
		for (int i=0;i<n;i++ ) {
			a[i]=sc.nextInt();
		}
		for(int i = 0; i < a.length; i++) {  
            for(int j = i + 1; j < a.length; j++) {  
                if(a[i] == a[j]) { 
                	for(int k = i; k < n-1; k++){
    			        a[k] = a[k + 1];
    			        }
                  break;
                }
             }
    }  
		System.out.println("Original Array: "+Arrays.toString(a));
		System.out.println("After deleting duplicate element: " );
    for(int l = 0; l < n-1; l++){
         System.out.print(" " + a[l]);
      }
	 }
  }
