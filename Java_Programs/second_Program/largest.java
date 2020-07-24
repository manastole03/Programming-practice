package introduction;
import java.util.Scanner;
public class max {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("length of list you want ");
		int n=sc.nextInt();
		int max=0;
		System.out.println("enter a list of number ");
		int []arr = new int[n]; 
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		max=arr[0];
		for(int i=0;i<n;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println("maximum number among is "+max);
	}
	}
		

		
				
