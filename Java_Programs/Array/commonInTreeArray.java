import java.util.*;
public class common_ThreeArrays {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of first array: ");
		int n=sc.nextInt();
		System.out.println("enter the size of second array: ");
		int m=sc.nextInt();
		System.out.println("enter the size of third array: ");
		int o=sc.nextInt();
		System.out.println("Enter "+n+" elements ");
		int a[]=new int[n];
		for (int i=0;i<n;i++ ) {
			a[i]=sc.nextInt();
		}
		System.out.println("Enter "+m+" elements ");
		int b[]=new int[m];
		for (int i=0;i<m;i++ ) {
			b[i]=sc.nextInt();
		}
		System.out.println("Enter "+o+" elements ");
		int c[]=new int[o];
		for (int i=0;i<o;i++ ) {
			c[i]=sc.nextInt();
		}
		int contains=0;
		System.out.println("First Array: "+Arrays.toString(a));
		System.out.println("Second Array: "+Arrays.toString(b));
		System.out.println("Third Array: "+Arrays.toString(c));
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				for(int k=0;k<o;k++) {
					if(a[i]==b[j] & b[j]==c[k] & a[i]==c[k]) {
						   contains=1;
							 System.out.println("Common element is: "+a[i]);
							 break;
					}
				}
			}
		}
		if(contains==0) {
			System.out.println("No common elements");
	  }
  }
}
