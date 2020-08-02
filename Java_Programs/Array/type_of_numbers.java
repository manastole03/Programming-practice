import java.util.*;
import java.util.Scanner;
public class typeOfArr {
  public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 20 elements ");
		int a[]=new int[20];
		for (int i=0;i<20;i++ ) {
			a[i]=sc.nextInt();
			System.out.println("Enter "+(19-i)+" elements left");
		}
		System.out.println("your input is stored successfully");
		int positive=0;
		int negative=0;
		int zero=0;
		int even=0;
		int odd=0;
		for(int i = 0; i<a.length; i++){
			if (a[i]>0){
				positive+=1;
			}
			if (a[i]<0) {
				negative+=1;
			}
			if(a[i]==0) {
				zero+=1;
			}
			if(a[i]%2==0) {
				even+=1;
			}
			if(a[i]%2!=0) {
				odd+=1;
			}
		}System.out.println("positive numbers- "+positive);
		System.out.println("negative numbers- "+negative);
		System.out.println("number of 0's- "+zero);
		System.out.println("even numbers- "+even);
		System.out.println("odd numbers- "+odd);
	}
}
