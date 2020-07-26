package introduction;

import java.util.Scanner;

public class crazy {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter first number ");
		int n=sc.nextInt();
		System.out.print("enter second number ");
		int m=sc.nextInt();
		if(n%6==m%6) {
			if(n>m) {
				System.out.print(m);
			}
			if(n<m) {
				System.out.print(n);
			}
			else {
				System.out.print(0);
			}
		}
		if(n%6!=m%6) {
			if(n>m) {
				System.out.print(n);
			}
			if(m>n) {
				System.out.print(m);
			}
			else {
				System.out.print(0);
			}
	}}
}
