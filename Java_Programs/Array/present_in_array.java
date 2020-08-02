import java.util.*;
import java.util.Scanner;
public class presentInArr {
  public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 10 elements ");
		int a[]=new int[10];
		for (int i=0;i<10;i++ ) {
			a[i]=sc.nextInt();
			System.out.println("Enter "+(9-i)+" elements left");
		}
		System.out.println("your input is stored successfully");
		System.out.println("enter any number ");
		int n=sc.nextInt();
		for(int i = 0; i<a.length; i++){
	         if(n == a[i]){
	            System.out.println("Array contains the given element");
	         }
	}System.out.println();
		}
}
