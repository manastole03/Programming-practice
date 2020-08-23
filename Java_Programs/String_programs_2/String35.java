import java.util.*;
import java.util.Scanner;
public class repeating_elements {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a String: ");
		String a=sc.next();
		System.out.println("the duplicate characters and counts are: ");
		for(int i=0;i<a.length();i++) {
			int count=1;
			for(int j=i+1;j<a.length();j++) {
				if(a.charAt(i)==a.charAt(j)) {
					count++;
					System.out.println(a.charAt(i)+" appears "+count+" times ");
				}
			}
		}
		}
}
