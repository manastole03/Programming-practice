
public class selectionSorting {

	public static void main(String[] args) {
		int a[]= {2,3,1,45,15};
		int n=a.length;
		for(int i=0;i<n-1;i++) {
			int s=i;
			for(int j=i;j<n;j++) {
				if(a[j]<a[s]) {
					s=j;
				}
			}
			int temp=a[i];
			a[i]=a[s];
			a[s]=temp;
		}
		for(int e:a) {
			System.out.print(e+" ");
		}
	}
}
