package introduction;

import java.util.Scanner;

public class alphstovalu {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a number ");
		char n=sc.next().charAt(0);
		int asciiCode=n;
		System.out.println("the ascii value of "+n+" is");
		System.out.println(asciiCode);
		
	}

}
