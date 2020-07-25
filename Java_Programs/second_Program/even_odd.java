package myAllJavaProjects;
import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter your First number : ");
		int num1 = scan.nextInt();
		
		System.out.print("Enter your Second number : ");
		int num2 = scan.nextInt();
		
		if(num1%2==0) {
			
		System.out.print("even ");
		}else {
			System.out.print("odd");	
		}
	
	}

}
