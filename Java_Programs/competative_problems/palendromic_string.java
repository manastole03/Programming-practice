//You have been given a String S. You need to find and print whether this string is a palindrome or not. If yes, print "YES" (without quotes), else print "NO" (without quotes).

Input Format
The first and only line of input contains the String S. The String shall consist of lowercase English alphabets only.

Output Format
Print the required answer on a single line.

Constraints 1<=|s|<=100

Note
String S consists of lowercase English Alphabets only.//

import java.util.*;
 
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        StringBuffer ab = new StringBuffer(name);
    System.out.println(name.equals(ab.reverse().toString())?"YES":"NO");
        
    }
}
