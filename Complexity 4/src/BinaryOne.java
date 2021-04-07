import java.util.*;
public class BinaryOne {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int test=sc.nextInt();
		
		for(int i=0;i<test;i++)
		{
			int a=sc.nextInt();
			int count=0;
				for(int j=1;j<=a;j++)
				{
			
			
			 String num=Integer.toBinaryString(j);
			for(int k=0;k<num.length();k++)
			{
				if(num.charAt(k)=='1')
					count++;
			}
		}
		System.out.println(count);
		}
	}
}
	
