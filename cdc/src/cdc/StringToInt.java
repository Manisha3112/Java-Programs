package cdc;
import java.util.*;
public class StringToInt {
	public static void main (String ar[])
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		long iN=0;
		//int start=(int)Math.pow(2,31);
		int k=(int)Math.pow(2,31);
	     int start=-k;
		String h=str.trim();
		for(int i=0;i<str.length();i++)
		{
			if(Character.isDigit(h.charAt(i)))
				iN=Long.parseLong(h);
			
		}
		//System.out.println(start);
		//System.out.println(k);
		//if(iN>start && iN<k)
		//{
			System.out.println(iN);
		//}
		
		
	}

}
