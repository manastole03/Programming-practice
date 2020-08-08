import java.util.*;
import java.util.ArrayList;
import java.util.List;
public class arrayListToArray {

	public static void main(String[] args) {
		List<Integer> a = new ArrayList<Integer>(); 
        a.add(10); 
        a.add(20); 
        a.add(30); 
        a.add(40); 
        Integer[] b =new Integer[a.size()]; 
        b = a.toArray(b); 
        for (Integer x : b) 
            System.out.print(x + " "); 
 	}
}
