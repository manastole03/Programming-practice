package myAllJavaProjects;

import java.util.Scanner;

public class PrimeNNumbers {
	public static void main (String[]args) {
		
		Scanner scan = new Scanner (System.in);
		 boolean flag = false;
		 
		System.out.print("Enter your number :");
		
		int number = scan.nextInt();
		
		for(int i=2 ; i<=number/2 ; ++i) {
			
			if (number%2==0) {
				
				flag = true;
				break;	
			}
		}
		
		if(!flag) {
			System.out.print("Prime number :");
		}else {
			System.out.print("Non-prime number :");
		}
	}
}
