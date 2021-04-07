import java.util.*;
public class SwapEve {
	public static void main(String af[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int iAr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			iAr[i]=sc.nextInt();
		}
		if(iAr.length%2==0)
		{
		for(int i=0;i<n/2;i++)
		{
			int temp=iAr[i];
			iAr[i]=iAr[i+n/2];
			iAr[i+n/2+1]=temp;
			
		}
		}
		else
		{
			for(int i=0;i<n/2;i++)
			{
				int temp=iAr[i];
				iAr[i]=iAr[i+(n/2)+1];
				iAr[i+n/2]=temp;
				
			}
			}
		
		for(int i=0;i<n;i++)
		{
			System.out.println(iAr[i]);
		}
	}

}
