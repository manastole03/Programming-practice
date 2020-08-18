import java.util.*;
import java.util.Scanner;
public class stringBuffer2 {
	public static void main(String[] args) {
		String a="example.com";
		StringBuffer b=new StringBuffer("Example.com") ;
		String c=b.toString();
		System.out.println("Comparing "+a+" and "+b+": "+a.equals(c));
	}
}
