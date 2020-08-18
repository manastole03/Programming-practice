import java.util.*;
import java.util.Scanner;
public class pointCount {
	public static void main(String[] args) {
		String a="source.com";
		System.out.println("Original string: "+a);
		int n=a.length()-1;
		int c=a.codePointCount(0,n);
		System.out.println("Codepoint count= "+c);
	}
}
