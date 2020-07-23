package introduction;
import java.util.Scanner;
public class swapping {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter first number ");
		int n=sc.nextInt();
		System.out.print("enter second number ");
		int m=sc.nextInt();
		int t=n;
		n=m;
		m=t;
		System.out.print("after swapping numbers are "); 
		System.out.print(n+" ");
		System.out.print(m);
  }

}
