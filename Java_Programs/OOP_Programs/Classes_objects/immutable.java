import java.util.*;
import java.io.*;
import java.util.Scanner;
public final class empolyee{
	final String name;
	final int reg_no;
	public  empolyee(String a,int b) {
		this.name=a;
		this.reg_no=b;
	}
	public String getname() {
		return name;
	}
	public int getreg_num() {
		return reg_no;
	}
}
public class immutable {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("enter your name ");
		String a=sc.nextLine();
		System.out.print("enter your roll number ");
		int b=sc.nextInt();
		empolyee s = new empolyee(a,b); 
        System.out.println("your details saved successfully !!"+s.getname()+s.getreg_num()); 
  }
}
