import java.util.*;
import java.util.Scanner;
public class add_mul_OfArr {
  public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Enter "+n+" elements ");
		int a[]=new int[n];
		for (int i=0;i<n;i++ ) {
			a[i]=sc.nextInt();
			System.out.println("Enter "+((n-1)-i)+" elements left");
		}
		System.out.println("your input is stored successfully");
		int sum=0;
		int mul=1;
		for (int i = a.length-1; i >= 0; i--) {  
			sum+=a[i];
		}
		for (int i = a.length-1; i >= 0; i--) {  
			mul*=a[i];
		}
		System.out.println("Addition of the given numbers is- "+sum);
		System.out.println("Multiplication of the given numbers is-  "+mul);
	}
}
