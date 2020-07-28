package introduction;
import java.util.Scanner;
import java.util.*;
public class area_rect {
public static  class Area{
	int length;
	int breadth;
	public  Area(int a,int b) {
		this.length=a;
		this.breadth=b;
	}
	public int  getArea() {
		int result=length*breadth;
		return result;
	}
}
public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter 1st side ");
		int a=sc.nextInt();
		System.out.print("enter 2nd side ");
		int b=sc.nextInt();
		Area ar=new Area(a,b);
		System.out.print("area is "+ar.getArea());
	}
}
