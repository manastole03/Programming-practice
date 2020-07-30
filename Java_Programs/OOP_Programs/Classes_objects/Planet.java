import java.util.*;
import java.io.*;
import java.util.Scanner;
class planet{
	String name;
	double disFromSun,relativegr;
	public void plane() {
		System.out.println("Name of planet- "+name+" \nDistance from sun is- "+disFromSun+" million km "+" \nrelative gravity- "+relativegr+" m/s2");
	}
}
public class palnetEM {
  public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter e or m : ");
		char a=sc.next().charAt(0);
		planet earth=new planet();
		planet mars=new planet();
		earth.name="Earth";
		earth.disFromSun=151.87;
		earth.relativegr=9.8067;
		mars.name="Mars";
		mars.disFromSun=207.89;
		mars.relativegr=3.728;
		switch (a) {
		case 'e' :
			earth.plane();
			break;
		case 'm':
			mars.plane();
			break;
		default :
			System.out.println("you entered wrong keyword");
		}
	}
}
