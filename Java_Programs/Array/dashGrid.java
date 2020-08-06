import java.util.*;
import java.util.Scanner;
public class dash_grid {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter any number: ");
		int n=sc.nextInt();
		System.out.println("Printing output...");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print("-");
			}System.out.println();
		}
	}
}
//expected output:
//enter any number: 3
//Printing output...
//---
//---
//---
