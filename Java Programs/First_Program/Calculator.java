package introduction;

import java.util.Scanner;

public class calci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a first number ");
	      int n=sc.nextInt();
	      System.out.print("enter a second number ");
	      int m=sc.nextInt();
	      System.out.print("enter a function from +,-,*,/ --> ");
	      char function=sc.next().charAt(0);
	      double result=0;
	      switch (function) {
	      case '+':
	    	  result=n+m;
	    	  System.out.println("your result is "+result);
	    	  break;
	      case '-':
	    	  result=n-m;
	    	  System.out.println("your result is "+result);
	    	  break;
	      case '*':
	    	  result=n*m;
	    	  System.out.println("your result is  "+result);
	    	  break;
	      case '/':
	    	  result=n/m;
	    	  System.out.println("your result is "+result);
	      }
}}
	         
	    	  
