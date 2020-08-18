import java.util.*;
import java.util.Scanner;
public class lexiIngnoringcase {
	public static void main(String[] args) {
		String a="This is Exerise 1";
		String b="This is Exerise 1";
		System.out.println("String 1: "+a);
		System.out.println("String 2: "+b);
		if (a.compareToIgnoreCase(b)==0) {
			System.out.println(a+" is equal to "+b);
		}
	}
}
