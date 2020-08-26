package introduction;
import java.util.Scanner;
public class subString {
	public  String sub(String a) {
		String c=a;
		if(a.subSequence(0, 2).equals(a.subSequence(a.length()-2,a.length()))) {
			c=a.substring(2);
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
