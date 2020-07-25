package myAllJavaProjects;
import java.util.Scanner;

public class AsciiCode {
	public static void main (String[]args){
		Scanner scan = new Scanner (System.in);
		System.out.print("Enter your character : ");
		char ch = scan.next(). charAt(0);
		int ascii = ch;
		int finalascii = (int)ch;
		System.out.print("Ascii code is : " + finalascii);
		System.out.print("ENter your Number : ");
		int number = scan.nextInt();	
		char finalasciichar = (char)number;
		System.out.print("Ascii Character : "+ finalasciichar);	
	}

}
