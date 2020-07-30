import java.util.*;
import java.io.*;
import java.util.Scanner;
class airline{
	String depacity,arricity,flihtnum,seatassi;
	public void ticket() {
		System.out.println("Departure city- "+depacity+" \nArrival city- "+arricity+" \nflight num- "+flihtnum+" \nseat no- "+seatassi);
	}
}
public class air {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1 or 2 : ");
		int a=sc.nextInt();
		airline ticket1=new airline();
		airline ticket2=new airline();
		ticket1.arricity="Miami";
		ticket1.depacity="Peru";
		ticket1.flihtnum="422104j12";
		ticket1.seatassi="12F";
		 ticket2.arricity="New Jersey";
		 ticket2.depacity="Selicon Valley";
		 ticket2.flihtnum="554290A234";
		 ticket2.seatassi="22A";
		switch (a) {
		case 1:
			ticket1.ticket();
			break;
		case 2:
			ticket2.ticket();
			break;
		default :
			System.out.println("you entered wrong keyword");
		}
	}
}
