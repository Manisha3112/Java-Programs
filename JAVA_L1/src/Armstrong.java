import java.util.*;
public class Armstrong {
	public static void main(String ags[])
	{
		Scanner sc=new Scanner(System.in);
		int iT=sc.nextInt();
		for(int g=0;g<iT;g++)
		{
			int iN=sc.nextInt();
			int temp=iN;
			int iG=iN;
			int sum=0;
			int c=0;
			while(iN>0)
			{
				iN/=10;
				c++;
			}
			if(c==3)
			{
				while(iG>0)
				{
			  int b=iG%10;
			  sum+=(b*b*b);
			  iG/=10;
				}
			
			if(sum==temp)
				System.out.println("Armstrong Number");
			
			else
			
				System.out.println(" Not a Armstrong Number");
			

			}
			else
				System.out.println(" Not a Armstrong Number");	
	}
	}
}
