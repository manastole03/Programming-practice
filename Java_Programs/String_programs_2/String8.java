import java.util.*;
import java.util.Scanner;
public class occurrenceOfElements {
	public static void main(String[] args) {
		String a="Robert Brett Roser";
		int c=0;
		HashMap <Character, Integer> hMap = new HashMap<>();
		System.out.println("Original string: "+a);
		System.out.print("duplicate elements: ");
		for(int i=0;i<a.length();i++) {
				if(hMap.containsKey(a.charAt(i))) {
					int count = hMap.get(a.charAt(i));
		            hMap.put(a.charAt(i), ++count);
		         }
				else {
		            hMap.put(a.charAt(i),1);
				}
		}
		System.out.println(hMap);
		
	}
}
