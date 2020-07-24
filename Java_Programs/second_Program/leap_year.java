package introduction;
import java.util.Scanner;
public class leapyr {
	
	public static void main(String[] arg) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a year");
	      int n=sc.nextInt();
	      if (n%4==0 || n%100==0 || n%400==0) {
	    	  System.out.println(n+" is a leap year");
	      }
	      else {
	    	  System.out.println(n+" is not leap year");
	      }
}}
