import java.util.*;
import java.io.*; 
public class subArray {

	public static void main(String[] args) {
		int a[]= {10,12,20,30,25,40,32,31,35,50,60};
		int start=3,end=8;
		int []subarr=new int[end-start+1];
		System.arraycopy(a,start,subarr,0,subarr.length);
		System.out.println(Arrays.toString(subarr));
	}
}
