package myAllJavaProjects;

public class String21
{
	public static void main(String[] args) 
	{
		String str = "Manas Tole";
		int a = str.lastIndexOf("a", str.length() - 1);
		int m = str.lastIndexOf("M" , str.length() - 1);
		int n = str.lastIndexOf("n" , str.length() - 1);
		int t = str.lastIndexOf("T" , str.length() - 1);
		int o = str.lastIndexOf("o", str.length() - 1);
		int l = str.lastIndexOf("l", str.length() - 1);
		int e = str.lastIndexOf("e", str.length() - 1);
		
		System.out.print("a :" + a);
		System.out.print("\nM :" + m);
		System.out.print("\nn :" + n);
		System.out.print("\nt :" + t);
		System.out.print("\no :" + o);
		System.out.print("\nl :" + l);
		System.out.print("\ne :" + e);
	}
}
