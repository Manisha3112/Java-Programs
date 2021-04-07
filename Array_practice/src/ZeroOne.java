import java.util.*;
public class ZeroOne {
	public static void main(String af[])
	{
		Scanner sc=new Scanner(System.in);
		int len=sc.nextInt();
		int iAr[]=new int[len];
		int c=0;
		int an=0;
		int temp=0;
		for(int i=0;i<len;i++)
		{
			iAr[i]=sc.nextInt();
		}
		for(int i=0;i<len-1;i++)
		{
			if(iAr[i]>=iAr[i+1])
			{
				temp=iAr[i];
				iAr[i]=iAr[i+1];
				iAr[i+1]=temp;
				
			}
			else
				c++;
		}
		for(int i=0;i<len;i++)
		{
		System.out.println(iAr[i]);
		}
		
	}

}
