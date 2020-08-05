
public class split {

	public static void main(String[] args) {
		int a[]= {4,5,7,85};
		int b[]=new int[a.length+1];
		int high=a[0];
		int se_high=a[0];
		int j=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>high) {
				high=a[i];
				j=i;
			}
		}
		for(int i=0;i<a.length;i++) {
			if (a[i]<high && a[i]>se_high) {
				se_high=a[i];
			}
		}
		for(int i=0;i<j;i++) {
			b[i]=a[i];
		}
		b[j]=se_high;
		b[j+1]=high-se_high;
		for(int i=j+2;i<b.length;i++) {
			b[i]=a[i-1];
		}
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}
	}
}
