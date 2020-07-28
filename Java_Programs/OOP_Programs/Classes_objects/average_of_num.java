
import java.util.*;
import java.util.Scanner;
public class avebyclass {
     public static class Average{
    	 double a,b,c;
    	 public  Average(double a,double b,double c) {
    		 this.a=a;
    		 this.b=b;
    		 this.c=c;
    		}
    	 public double getavg() {
    		 double avg=(a+b+c)/3;
    		 return avg;
    	 }
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("first number  ");
	int a=sc.nextInt();
	System.out.print("second number  ");
	int b=sc.nextInt();
	System.out.print("third number  ");
	int c=sc.nextInt();
	Average num=new Average(a,b,c);
	System.out.println("Average is  "+num.getavg());
	}
}
