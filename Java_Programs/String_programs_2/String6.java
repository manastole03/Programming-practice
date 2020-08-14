import java.util.*;
import java.util.Scanner;
public class abbrivation {
	public static void main(String[] args) {
		
		String a = "Robert Brett Roser";
		System.out.println("full name is: "+a);
    	System.out.print("Abbrivation is: ");
    	a=a.trim();
    	 String str1 = "";
         for (int i = 0; i <a.length(); i++) {
            char c = a.charAt(i);
            if (c != ' ') {
               str1 = str1 + c;
            } else {
               System.out.print(Character.toUpperCase(str1.charAt(0)) + ".");
               str1 = "";
            }
         }
         String str2 = "";
         for (int i = 0; i < str1.length(); i++) {
            if (i == 0)
               str2 = str2 + Character.toUpperCase(str1.charAt(0));
            else
               str2 = str2 + Character.toLowerCase(str1.charAt(i));
         }
         System.out.println(str2);
	}
}
