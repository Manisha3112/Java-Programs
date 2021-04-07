package cdc;
import java.util.*;
public class OneoneTwo {
	public static void main(String ad[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int c=0;
		int iAr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			iAr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			if(iAr[i]==iAr[i+1])
				c++;
		}
		System.out.println(c+" ");
		//int iC=(int)(Math.log10(iN))+1;
		
}
	
}
