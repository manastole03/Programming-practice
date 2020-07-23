package introduction;

import java.util.Scanner;

public class alphstovalu {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a ascii value  ");
		int asciiCode=sc.nextInt();
		String n=new Character((char) asciiCode).toString();
		System.out.println("the character value of "+asciiCode+" is");
		System.out.println(n);
		
	}

}
