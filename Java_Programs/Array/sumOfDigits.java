import java.util.*;
import java.util.Scanner;
public class sumOfDigits {
	static int sum(int n) {
		if (n==0) 
			return 0;
			return(n%10 +sum(n/10));
		}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter any number: ");
		int a=sc.nextInt();
		int result=sum(a);
		System.out.println("sum of digits in "+a+" is: "+result);
	}
}
