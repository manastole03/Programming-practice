package introduction;

import java.util.Scanner;

public class rectangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter width of a rectangle ");
		double w=sc.nextDouble();
		System.out.print("enter height of a rectangle ");
		double h=sc.nextDouble();
		double p=2*(w+h);
		double a=w*h;
		System.out.println("Perimeter is = "+p);
		System.out.println("Area is = "+a);
	}
}
