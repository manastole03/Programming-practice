package introduction;

import java.util.Scanner;

public class average {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("enter first number ");
	double a=sc.nextDouble();
	System.out.print("enter second number ");
	double b=sc.nextDouble();
	System.out.print("enter third number ");
	double c=sc.nextDouble();
	double d=((a+b+c)/3);
	System.out.println("Average of numbers is = "+d);
	}
 }
