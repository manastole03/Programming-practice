import java.util.*;
import java.util.Scanner;
public class add_distance {
public static class AddDistance{
	int a;
	public  AddDistance(int a) {
		this.a=a;
	}
	public double change() {
		double result=(0.0833333*a);
		return result;
	}
}
public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Distance in Inch- ");
		int a=sc.nextInt();
		AddDistance inch=new AddDistance(a);
		System.out.println("Distance in feet "+inch.change());
	}
}
