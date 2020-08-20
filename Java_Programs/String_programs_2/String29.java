import java.util.*;
import java.util.Scanner;
public class string_to_CharacterArray {

	public static void main(String[] args) {
		String a="[C@2a139a55";
		char b[]=new char[a.length()];
		for(int i=0;i<a.length();i++) {
			b[i]=a.charAt(i);
		}
		for(char c:b) {
			System.out.print(c);
		}
	}
}
