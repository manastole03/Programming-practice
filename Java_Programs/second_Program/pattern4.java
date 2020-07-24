package introduction;

import java.util.Scanner;

public class pattern4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a number ");
		int n=sc.nextInt();
		for (int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
			System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
//expected output:
//enter a number 4
//1 
//1 2 
//1 2 3 
//1 2 3 4 
