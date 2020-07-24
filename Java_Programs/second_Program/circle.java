package introduction;
import java.util.Scanner;
public class circle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter radius of a circle ");
		double n=sc.nextDouble();
		double p=2*Math.PI*n;
		double a=Math.PI*n*n;
		System.out.println("Perimeter is = "+p);
		System.out.println("Area is = "+a);
	}
}
