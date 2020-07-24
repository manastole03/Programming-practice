package introduction;

import java.util.Scanner;

public class table {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a number  ");
		int n=sc.nextInt();
		System.out.println("table of "+n+" :");
		for (int i=1;i<=10;i++) {
			int result=i*n;
			System.out.println(n+" x "+i+" = "+result);
		}
  }
}
