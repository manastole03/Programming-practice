import java.util.*;
import java.util.Scanner;
public class noOfEvenAndOdd {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of matrix: ");
		int n=sc.nextInt();
		System.out.println("Enter elements of first matrix: ");
		int a[]=new int[n];
		for (int i=0;i<n;i++ ) {
			a[i]=sc.nextInt();
		}
		System.out.println("original array: "+Arrays.toString(a));
		int even=0;
		int odd=0;
		for(int i=0;i<n;i++) {
			if(a[i]%2==0) {
				even+=1;
			}
			else{
				odd+=1;
			}
		}System.out.println("no.of even elements= "+even);
		System.out.println("no.of odd elements= "+odd);
		}
}
