package introduction;
import java.util.Scanner;
public class subString {
	public  String sub(String a) {
		
		  String t = "";
		  for (int i = 0; i <a.length(); i++) 
		  {
		    if (i == 0 && a.charAt(i) == 'g')
		      t += 'g';
		    else if (i == 1 && a.charAt(i) == 'h')
		     t += 'h';
		    else if (i > 1)
		      t += a.charAt(i);
		  }
		    return t;
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		subString m=new subString();
        String a=sc.nextLine();
       System.out.println("Entered  string: "+a);
        System.out.println("New string is: "+m.sub(a));
        

	}
}
