import java.util.*;
import java.util.Scanner;
public class comparingStrings {
	public static void main(String[] args) {
		String a="example.com";
		String b="example.com";
		boolean v=false;
		if(a.compareTo(b)==0) {
			 v=true;
		}
		System.out.println("Comparing "+a+" and "+b+": "+v);
	}
}
