import java.util.*;
import java.io.*; 
public class symmetricMatrix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter elements of the array ");
		int a[][]=new int[3][3];
		for (int i=0;i<3;i++ ) {
			for(int j=0;j<3;j++) {
			a[i][j]=sc.nextInt();
		    }
		}
		System.out.println("printing input...");
		for (int i=0;i<3;i++ ) {
			for(int j=0;j<3;j++) {
			System.out.print(a[i][j]+"\t");
		    }System.out.println();
		}
		 boolean symmetric = true;
         
         for (int i = 0; i < 3; i++)
         {
             for (int j = 0; j < 3; j++)
             {
                 if(a[i][j] != a[j][i])
                 {
                     symmetric = false;
                     break;
                 }
             }
         }
         if(symmetric)
         {
             System.out.println("Matrix is symmetric");
         }
         else
         {
             System.out.println("Matrix is not symmetric");
         }
	}
}
