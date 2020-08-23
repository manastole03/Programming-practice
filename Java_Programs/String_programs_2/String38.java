import java.util.*;
import java.util.Scanner;
public class remove_duplicates {
	public static void repeat(String a)
    {
		if(a.length()<=1)
        {
            System.out.println(a);
            return;
        }
      String n=new String();
      int count=0;
      for(int i=0;i<a.length();i++)
      {
          while(i<a.length()-1 && a.charAt(i)==a.charAt(i+1))
          {
              if(i<a.length()-2 && a.charAt(i)!=a.charAt(i+2))
              i+=2;
              else
              i++;
              count++;
          }
          if(i!=a.length()-1)
          n+=a.charAt(i);
          else
          {if(i==a.length()-1 && a.charAt(i)!=a.charAt(i-1))
              n+=a.charAt(i);
          }
      }
      if(count>0)
      repeat(n);
      else
      System.out.println("The new string after removing all adjacent duplicates is: "+n);
  }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a String: ");
		String a=sc.next();
		System.out.println("The given string is: "+a);
		repeat(a);
		}
}
