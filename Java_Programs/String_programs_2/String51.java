package introduction;
import java.util.Scanner;
public class subString{
	public  String sub(String a) {
		String t= "";
		  String c = "";
		  int from = 0;
		  int to= 0;
		  boolean b= false;
		  for (int i = 0; i <a.length()- 4; i++) 
		  {
		    t= a.substring(i, i+5);
		    if (t.equals("toast") && b == true)
		      to = i; 
		    if (t.equals("toast") && b == false) 
			{
		     from= i+5;
		      b= true;
		    }
		  }
		  c= a.substring(from,to);
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
