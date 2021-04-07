package cdc;
import java.util.*;
public class swap {
	public static void main(String ar[]) {
		String iAr[]= {"four","score","and","seven","years","ago"};
		List<String>al=Arrays.asList(iAr);
		for(int i=0;i<al.size();i+=2)
		{
			Collections.swap(al, i, i+1);
		}
		System.out.println("After Switch"+al);
	}

}
