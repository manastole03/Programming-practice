package myAllJavaProjects;
import java.util.Scanner;

public class SwappingNumbers{
	public static void main (String[]args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Enter your number : ");
		int num1 = scan.nextInt();
		
		System.out.print("Enter your number :");
		int num2 = scan.nextInt();
		
		 num1 = num1 + num2; 
		 num2 = num1 - num2; 
		 num1 = num1 - num2; 
		
		System.out.print("First number after swapping :"+num1);
		System.out.print("Second number after swapping :"+num2);
		 
		System.out.print("Enter your number : ");
		int num3 = scan.nextInt();
		
		System.out.print("Enter your number : ");
		int num4 = scan.nextInt();
		
		int num5=num3;
		num3=num4;
		num4=num5;
		
		System.out.print("First number after swapping :"+num3);
		System.out.print("Second number after swapping :"+num4);
	}
	
}
