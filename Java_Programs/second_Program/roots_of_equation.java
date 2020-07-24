package introduction;
import java.util.Scanner;
public class roots {
public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b,c,d;
		System.out.println("enter a number ");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		d=(b*b-4*a*c);
		double square_d=Math.sqrt(d); 
		if (a==0) {
			System.out.println("invalid");
		}
		if( d>0 ) {
			System.out.println("roots are real and different");
			System.out.println((-b+square_d)/(2*a));
			System.out.println((-b-square_d)/(2*a));
		}
		if( d==0 ) {
			System.out.println("roots are");
			System.out.println((-b/(2*a)));
			}
		if(d<0) {
			System.out.println("no real roots");
		}
	}
}
