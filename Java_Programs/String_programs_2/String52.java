package introduction;
import java.util.Scanner;
public class subString{
	public  boolean sub(String a) {
		boolean c=false;
		  boolean b=false;
		  for (int i = 0; i <a.length()-1; i++){
			  if (a.charAt(i) == 'p' && b== true) {
			      c= true;
			      b = false;
			   } 
				else if (a.charAt(i) == 'p') {
			      c= true;
			    }
			    if (a.charAt(i) == 'q' && c== true)
			      b= true;
			  }
			  if (c == false)
			    b= true;
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
