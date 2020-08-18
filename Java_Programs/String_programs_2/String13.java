import java.util.*;
import java.util.Scanner;
public class unicodeBefore {
	public static void main(String[] args) {
		String a="resource.com";
		System.out.println("Original string: "+a);
		int v1=a.codePointBefore(1);
		int v2=a.codePointBefore(7);
		System.out.println("Charecter(unicode point)= "+v1);
		System.out.println("Charecter(unicode point)= "+v2);
	}
}
