import java.util.*;
import java.util.Scanner;
public class twoDarray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size of 2D size: ");
		int n=sc.nextInt();
		int m=sc.nextInt();
		System.out.println("Enter elements: ");
		int a[][]=new int[n][m];
		for (int i=0;i<n;i++ ) {
			for (int j=0;j<m;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("your input is stored successfully");
		System.out.println("your input is as: ");
	        for(int []x:a){
	            for(int y:x){
	            System.out.print(y+"        ");
	            }
	            System.out.println();
	        }
	}
}
