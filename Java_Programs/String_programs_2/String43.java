package introduction;
import java.util.Scanner;
public class subString {
	public  String sub(String a,int n) {
		return a.substring(0, n)+a.substring(a.length()-n, a.length());
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		subString m=new subString();
        String a=sc.next();
        int n=sc.nextInt();
       System.out.println("Entered  string: "+a);
       System.out.println("Entered number: "+n);
        System.out.println("New string is: "+m.sub(a,n));
        

	}
}
