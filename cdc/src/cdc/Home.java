package cdc;
import java.util.*;
public class Home {
	public static void main(String as[])
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String iAr[]=str.split("");
		int j=0;
		StringBuilder ar=new StringBuilder(str);
		int n=ar.length();
		for(int i=0;i<ar.length();i++)
		{
			while(ar.charAt(j)=='.')
				ar.deleteCharAt(j);
			j++;
		}
		System.out.println(ar);
		for(int i=0;i<ar.length();i++)
		{
			while(iAr[n-1]=='/')
				ar.deleteCharAt(j);
		}
		
		System.out.println(ar);
	}

}
