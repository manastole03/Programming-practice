import java.util.*;
import java.util.Scanner;
public class selec {
	public String concat(String a,String b){
		if(a.length()>b.length()) {
			int d=a.length()-b.length();
			return a.substring(d, a.length()) + b;
		}
		if(b.length()>a.length()) {
			int d=b.length()-a.length();
			return b.substring(d, b.length()) + a;
		}
		else {
			return a+b;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		selec m= new selec();
		System.out.println("enter a String: ");
		String a=sc.next();
		System.out.println("enter a String: ");
		String b=sc.next();
		System.out.println("Given string: "+a);
		System.out.println("Given string: "+b);
		System.out.println(m.concat(a, b));
		}
}
