package cdc;
import java.util.*;
public class reverse {
	public static void main(String[] args) {
		    List<String>al=new ArrayList<String>();
		    al.add("Java");
		    al.add("Python");
		    al.add("C");
		    al.add("JavaScript");
		    al.add("Ruby");
		    
			System.out.println("Unsorted Array: "+al);
			Collections.sort(al);
			Collections.reverse(al);
			
			System.out.println("Reverse the given array: "+al);
			Collections.sort(al,Collections.reverseOrder());
			System.out.println("Sorted Array in Descending Order: "+al);
				
	}
}
