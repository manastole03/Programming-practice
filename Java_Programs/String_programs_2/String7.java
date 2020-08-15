import java.util.*;
import java.util.Scanner;
public class countElements {
  public static void main(String[] args) {
		String a="Robert Brett Roser";
		char[] l = {'a','e','i','o','u'};
		int v=0;
		int c=0;
		int ws=0;
		for(int i=0;i<a.length();i++) {
			for(int j=0;j<5;j++) {
				if(a.charAt(i)==l[j] ) {
					v+=1;
				}
			}
			c+=1;
		}
			for(int i=0;i<a.length();i++) {
			if(a.charAt(i)==' ') {
				ws+=1;
			}
		}
		System.out.println("No. of in Vowels String ("+a+")is: "+v);
		System.out.println("No. of in Consonents String ("+a+")is: "+(c-v-ws));
		System.out.println("No. of in White spaces String ("+a+")is: "+ws);
	}
}
