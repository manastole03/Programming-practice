import java.util.*;
import java.util.Scanner;
public class duplicateArray {

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
		for(int i = 0; i < a.length; i++) {  
            for(int j = i + 1; j < a.length; j++) {  
                if(a[i] == a[j])  
                    System.out.println("Duplicate elements- "+a[j]);  
	           }
    }
 }
}
