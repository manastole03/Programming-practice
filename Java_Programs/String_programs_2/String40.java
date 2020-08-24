import java.util.*;
import java.util.Scanner;
public class selec {
	static char [] swap(String a,int i,int j) {
			char b[]=a.toCharArray();
				char t=b[i];
				b[i]=b[j];
				b[j]=t;
				return b;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a String: ");
		String a=sc.next();
		System.out.println("Given string: "+a);
		System.out.print("After swaping: ");
		System.out.println(swap(a,(a.length() - 1),(a.length() - 2)));
	
		}
}
