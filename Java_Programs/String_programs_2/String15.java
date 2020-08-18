import java.util.*;
import java.util.Scanner;
public class lexiComparingStrigs{
	public static void main(String[] args) {
		String a="This is Exerise 1";
		String b="This is Exerise 2";
		System.out.println("String 1: "+a);
		System.out.println("String 2: "+b);
		if (a.compareTo(b)==-1) {
			System.out.println(a+" is less than "+b);
		}
	}
}
