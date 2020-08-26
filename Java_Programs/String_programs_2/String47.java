package introduction;
import java.util.Scanner;
public class subString {
	public  String sub(String a) {
		String c=a;
		if(a.charAt(0)=='t' && a.charAt(a.length()-1)=='t') {
			c=a.substring(1,a.length()-1);
			return c;
			}
		return c; 
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		subString m=new subString();
        String a=sc.nextLine();
       System.out.println("Entered  string: "+a);
        System.out.println("New string is: "+m.sub(a));
	}
}
