package introduction;

import java.util.Scanner;

public class pattern5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a number ");
		int n=sc.nextInt();
		int vlu=1;
		for (int i=1;i<=n;i++) {
			for(int j=n;j>=i;j--) {
			System.out.print("  ");
			
			}
			
			for(int j=1;j<=i;j++) {
				System.out.print(vlu+"   ");
				vlu++;
			}
			
			System.out.println();
	}

}}
//expected output:
//enter a number 4
//        1   
//      2   3   
//    4   5   6   
//  7   8   9   10   
