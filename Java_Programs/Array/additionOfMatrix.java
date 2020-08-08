import java.util.*;
public class additionOfMatrix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of matrix: ");
		int n=sc.nextInt();
		System.out.println("Enter elements of first matrix: ");
		int a[][]=new int[n][n];
		for (int i=0;i<n;i++ ) {
			for(int j=0;j<n;j++) {
			a[i][j]=sc.nextInt();
		}}
		System.out.println("Enter elements of second matrix: ");
		int b[][]=new int[n][n];
		for (int i=0;i<n;i++ ) {
			for(int j=0;j<n;j++) {
			b[i][j]=sc.nextInt();
		}}
		int c[][]=new int [n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				 c[i][j]=a[i][j]+b[i][j];
				}
			}
		System.out.println("first matrix: ");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(a[i][j]+" ");
				}
        System.out.println();
		}
		System.out.println("second matrix: ");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(b[i][j]+" ");
				}
        System.out.println();
		}
		System.out.println("After adding: ");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(c[i][j]+" ");
				}
        System.out.println();
		 }
		}
 }
