import java.util.*;
import java.util.Scanner;
public class farr {
  public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 10 elements ");
		int a[]=new int[10];
		for (int i=0;i<10;i++ ) {
			a[i]=sc.nextInt();
			System.out.println("Enter "+(9-i)+" elements left");
		}
		System.out.println("your elements -");
		for (int i = 0; i < 10; i++){
			System.out.print(a[i] +"\t");
		}
	}
}
