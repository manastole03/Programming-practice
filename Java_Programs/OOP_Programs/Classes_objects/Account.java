import java.util.*;
import java.io.*;
import java.util.Scanner;
class coustomer{
	String firstname,lastname;
	public String user_details(String fn,String ln) {
		return("First Name- "+fn+" ,Last Name- "+ln);
	}
}
class account{
	int Balance;
	coustomer rob=new coustomer();
	public void  balance_details() {
		System.out.print(rob.user_details("Robert","pattinson")+" ,Account balance= "+Balance+"(in $)");
		}
}
public class t {
	public static void main(String[] args) {
		account rob1=new account();
		account rob2=new account();
		rob1.Balance=2000;
		rob2.Balance=20000;
		System.out.println("account 1 ");
	    rob1.balance_details();
		System.out.println("\naccount 2");
		rob2.balance_details();
	}
}
