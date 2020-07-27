package introduction;
import java.util.*;
import java.io.*;
class Rectangle{
        int length,breadth;
		void dimensions(int a,int b) {
			 length=a;
			 breadth=b;
		}
		int Area() {
			int area=(length * breadth);
			System.out.print("Area of Rectangle: ");
			return( area);
		}
	}
public class rect2 {
	public static void main(String[] args) {
	    Rectangle Rect1=new Rectangle();
	    Rectangle Rect2=new Rectangle();
		Rect1.dimensions(4, 5);
		Rect2.dimensions(5, 8);
		System.out.println(Rect1.Area());
		System.out.println(Rect2.Area());
	}
}
