import java.util.*;
import java.util.Scanner;
public class selec {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a String: ");
		String a=sc.next();
		System.out.println("enter a String: ");
		String b=sc.next();
		System.out.println("Given string: "+a);
		System.out.println("Given string: "+b);
		if(a.contains(b)) {
			System.out.println("The string containing "+b+" at last :"+true);
		}
		else {
			System.out.println("The string containing "+b+"at last: "+false);
		}
		}
}
