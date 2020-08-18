import java.util.*;
import java.util.Scanner;
public class stringBuffer{
	public static void main(String[] args) {
		String a="example.com";
		StringBuffer b=new StringBuffer("example.com") ;
		String c=b.toString();
		System.out.println("Comparing "+a+" and "+b+": "+a.equals(c));
	}
}
