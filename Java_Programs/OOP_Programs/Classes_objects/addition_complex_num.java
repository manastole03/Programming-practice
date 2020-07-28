import java.util.*;
import java.util.Scanner;
public class complex {
  public static class complexxx{
	  double real,imaginary;
	public complexxx(double r,double i) {
		this.real=r;
		this.imaginary=i;
	}
	public double getsum() {
		double addition=real+imaginary;
		return addition;
	}
	public double getdiff() {
		double substraction=real-imaginary;
		return substraction;
	}
	public double getproduct() {
		double aa=((real*real)-(imaginary*imaginary));
		double bb=((real*imaginary)+(imaginary*real));
		double multiplication =aa+bb;
		return multiplication;
	}
}
public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("first number  ");
		System.out.print("real part ");
		int a=sc.nextInt();
		System.out.print("imaginary part ");
		int b=sc.nextInt();
		System.out.print("second number  ");
		System.out.print("real part ");
		int c=sc.nextInt();
		System.out.print("imaginary part ");
		int d=sc.nextInt();
		complexxx sumr=new complexxx(a,c);
		complexxx sumi=new complexxx(b,d);
		System.out.println("addition is ("+sumr.getsum()+" +("+sumi.getsum()+")i)");
		complexxx difr=new complexxx(a,c);
		complexxx difi=new complexxx(b,d);
		System.out.println("substaction is ("+sumr.getdiff()+" +("+sumi.getdiff()+")i)");
		complexxx mulr=new complexxx(a,c);
		complexxx muli=new complexxx(b,d);
		System.out.println("multiplication is ("+mulr.getproduct()+" +("+muli.getproduct()+")i)");
	}
}
