import java.util.*;
import java.io.*;
import java.util.Scanner;
class Employee{
	int sa,no_hours;
	int insa=0;
	public void getinfo(int a,int b) {
		this.sa=a;
		this.no_hours=b;
	}
	public int Addsa(int a) {
		if (a>=500) {
			insa+=10;
		}
		return insa;
	}
	public int Addwo(int b) {
			if(b>6) {
				insa=5;
			}
			if(b<=6) {
				insa=0;
			}
		return insa;
	}
}
public class emo_sa {
public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enetr salary in $ - ");
		int a=sc.nextInt();
		System.out.print("enter no. of hours of work per day- ");
		int b=sc.nextInt();
		Employee empo18=new Employee();
		int total=a+empo18.Addsa(a)+empo18.Addwo(b);
		System.out.println("Your Salary (after increasing)- "+total);
	}
}
