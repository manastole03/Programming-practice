package introduction;

import java.util.Scanner;

public class pattern6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a number ");
		int n=sc.nextInt();
		int m=2*n-1;
		for (int i=1;i<=m;i++) {
			if (i<=n) {
				for(int j=1;j<=i;j++) {
					System.out.print( "*" );
				}
			}
			else {
				for(int j=m-i+1;j>=1;j--) {
					System.out.print("*");
				}
			}
		System.out.println();
	}
}
}
//expected output:
//enter a number 4
//*
//**
//***
//****
//***
//**
//*

