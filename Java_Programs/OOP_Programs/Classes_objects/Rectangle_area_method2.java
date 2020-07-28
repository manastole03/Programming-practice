package introduction;
import java.util.*;
import java.util.Scanner;
public class rect {
public static class Area{
	int length;
	int breadth;
	public Area(int a,int b) {
		this.length=a;
		this.breadth=b;
	}
	public int returnArea() {
		int result=length*breadth;
		return result;
	}
}
public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("length of rectangle is ");
		int a=sc.nextInt();
		System.out.print("breadth of rectangle is ");
		int b=sc.nextInt();
		Area rect1=new Area(a,b);
		System.out.print( "area is "+rect1.returnArea());
	}
}
