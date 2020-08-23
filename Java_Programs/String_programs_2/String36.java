import java.util.*;
import java.util.Scanner;
public class rotation {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a String: ");
		String a=sc.next();
		String b=sc.next();
		String c=a.concat(a);
		boolean pre=false;
		System.out.println("The given strings are:  "+a+" and "+b);
		System.out.println("The concatination of 1st string twice is: "+c);
		for(int i=0;i<b.length();i++) {
			if(c.contains(b)) {
				pre=true;
			}
		}
		if(pre==true) {
		System.out.println("The 2nd string CDABA  exists in the new string.\nStrings are rotations of each other.");
		}
		else {
			System.out.println("no");
		}
		}
}
