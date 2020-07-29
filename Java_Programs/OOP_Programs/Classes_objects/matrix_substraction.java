import java.util.*;
import java.io.*;
import java.util.Scanner;
class matrix{
	private double [][]mat;
	int ro,co;
	matrix(){
		ro=0;
		co=0;
	}
	matrix(int r,int c){
		ro=r;
		co=c;
		mat=new double[ro][co];
	}
	public void input() {
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter Element row wise " );  
		int i=0;
		int j=0;
		for ( i =0;i<ro;i++){  
			for(j=0;j<co;j++){  
				mat[i][j]=sc.nextInt(); 
		   }
    }
	}
	public void get_mat() {
		int i=0;
		int j=0;
		 System.out.print("Printing Elements...");  
			for(i=0;i<ro;i++){   
				System.out.println(" ");  
				 for(j=0;j<co;j++){ 
	       System.out.println(" "+mat[i][j]);
				 }
      }
	}
	public matrix sub(matrix m1) {
   matrix ans = new matrix(ro,co);
		int i=0,j=0;
		if (this.ro != m1.ro || this.co != m1.co)
		{
			System.out.println("ERROR: The two matrices should have same no. of rows and columns for substraction!");
		}
		else
		{
			for (i = 0; i < ro; i++)
			{
				for (j = 0; j < co; j++)
				{
					ans.mat[i][j] = this.mat[i][j] - m1.mat[i][j];
				}
			}
		}
		return ans;
	}
	
}
public class submatrix {
	private static matrix m1,m2,ans;
	public static void main(String[] args) {
    int i = 0, j = 0,r=0,c=0;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter no. of rows:");
		r = s.nextInt();
		System.out.print("Enter no. of columns:");
		c = s.nextInt();
		System.out.print("Enter the first matrix:>>");
		m1 = new matrix(r,c);
		m1.input();
		System.out.print("Enter the second matrix:>>");
		m2 = new matrix(r,c);
		m2.input();
		ans = m1.sub(m2);
		System.out.println("\nSubstraction of the two matrices is:>>");
		ans.get_mat();
	}
}  
