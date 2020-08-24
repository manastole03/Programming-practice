import java.util.*;
import java.util.Scanner;
public class select {
	public String repeat(String a,String b) {
			if(a.length()!=0 && b.length()!=0 && a.charAt(a.length()-1)==b.charAt(0)) {
				return a+b.substring(1);
			}
			return a+b;
  }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		select c=new select();
		System.out.println("enter a String: ");
		String a=sc.next();
		System.out.println("enter a String: ");
		String b=sc.next();
		System.out.println("The given string is: "+a);
		System.out.println("The given string is: "+b);
		System.out.println("The string after concatination are: "+c.repeat(a,b));
		}
}
