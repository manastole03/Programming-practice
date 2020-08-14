import java.util.*;
import java.util.Scanner;
public class lengthOfString {

	public static void main(String[] args) {
		String a="refrigerator";
		int count=0;
		for(int i=0;i<a.length();i++) {
			count+=1;
		}
		System.out.println("length of "+a+" is: "+count);
	}
}
