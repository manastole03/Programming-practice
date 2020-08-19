import java.util.*;
import java.util.Scanner;
public class equals {
	public static void main(String[] args) {
		String a="Stephen Edwin King";
    String b="Walter Winchell";
    String c="Mike Royko";
		System.out.println(a+" equals "+b+ "? : "+a.contentEquals(b));
    System.out.println(a+" equals "+c+ "? : "+a.contentEquals(c));
	}
}
