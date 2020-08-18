import java.util.*;
import java.util.Scanner;
public class unicodeAt {
	public static void main(String[] args) {
		String a="website.com";
		System.out.println("Original string: "+a);
		int v1=a.codePointAt(2);
		int v2=a.codePointAt(1);
		System.out.println("Charecter(unicode point)= "+v1);
		System.out.println("Charecter(unicode point)= "+v2);
	}
}
