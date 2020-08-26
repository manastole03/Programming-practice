package introduction;
import java.util.Scanner;
public class subString{
	public  boolean sub(String a) {
		boolean c=false;
		if(a.subSequence(0, 2).equals(a.subSequence(a.length()-2,a.length()))) {
			return (c=true);
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
