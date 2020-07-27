package introduction;
import java.util.Scanner;
public class palidrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number ");
		int n=sc.nextInt();
		int temp=n;
		int r=0;
		while(temp>0) {
			int LD=temp%10;
			r=r*10+LD;
			temp/=10;
		}
		if(r==n) {
			System.out.println("YES,it is a palindrome");
		}
		else {
			System.out.println("NO,it is not a palindrome");
		}
	}
}
