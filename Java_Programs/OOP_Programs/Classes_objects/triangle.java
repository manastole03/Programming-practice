package introduction;
import java.util.*;
import java.io.*;
public class tri
{
	public static class triangle
	{
		int a,b,c;
		public void perimet() {
			int perimeter=(a+b+c);
			System.out.println("Perimeter is "+perimeter);
		}
		public void area() {
			double s=(a+b+c)/2;
			double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
			System.out.println("Area is "+area);
		}
	}
	public static void main(String[] args)
	{
		triangle diemension = new triangle();
		diemension .a=3;
		diemension .b=4;
		diemension .c=5;
		diemension .perimet();	
		diemension .area();
	}
}
