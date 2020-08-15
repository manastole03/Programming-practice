import java.util.*;
import java.util.Scanner;
public class removingVowels {
  public static void main(String[] args) {
		String a="Okay,have a good day!";
		System.out.println("original string: "+a);
		 String b = a.replaceAll("[AEIOUaeiou]", "");
		 System.out.println("after removing vowels: "+b);
	}
}
