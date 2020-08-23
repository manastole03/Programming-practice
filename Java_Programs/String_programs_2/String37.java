import java.util.*;
import java.util.Scanner;
public class pattern_string {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a String: ");
		String a=sc.next();
		String b=sc.next();
		boolean pre=false;
		System.out.println("The given strings are:  "+a);
		System.out.println("The given Pattern is: "+b);
		for(int i=0;i<a.length();i++) {
			if(a.regionMatches(i, b, i, i)) {
				pre=true;
			}
		}
		if(pre==true) {
		System.out.println("The given pattern is matching");
		}
		else {
			System.out.println("The given pattern is not matching");
		}
		}
}
