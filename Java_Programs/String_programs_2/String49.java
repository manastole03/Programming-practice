package introduction;
import java.util.Scanner;
public class subString {
	public  String sub(String a) {
		String b = "";
		  for (int i = 0; i <a.length(); i++) 
		  {
		    if (i == 0 && a.charAt(i) != '#')
		      b += a.charAt(i);
		    if (i > 0 && a.charAt(i) != '#' && a.charAt(i-1) != '#')
		      b+= a.charAt(i);
		    if (i > 0 && a.charAt(i) == '#' && a.charAt(i-1) != '#')
		      b = b.substring(0,b.length()-1);
		  }
		  return b;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		subString m=new subString();
        String a=sc.nextLine();
       System.out.println("Entered  string: "+a);
        System.out.println("New string is: "+m.sub(a));
        

	}
}
