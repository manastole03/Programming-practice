package introduction;
import java.util.Scanner;
public class fibonacci {
public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a number upto fibonacci series you want ");
		  int n=sc.nextInt();
	      int a=0;
	      int b=1;
	      System.out.print(a+" ");
	      System.out.print(b+" ");
	      for (int i=0;i<=n-2;i++) {
	    	  int c=a+b;
	    	  a=b;
	    	  b=c;
	    	  System.out.print(c+" ");
	    	 }}
}
