import java.util.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class arrayToArraylist {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of 1D array: ");
		int n=sc.nextInt();
		System.out.println("Enter "+n+" elements ");
		String a[]=new String[n];
		for (int i=0;i<n;i++ ) {
			a[i]=sc.next();
		}
		List<String> list = Arrays.asList(a);          
	      System.out.println("Arraylist: "+list);
	}
}
